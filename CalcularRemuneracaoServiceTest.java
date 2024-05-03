package br.edu.unicesumar.service;

import br.edu.unicesumar.domain.CLT;
import br.edu.unicesumar.domain.Estagiario;
import br.edu.unicesumar.domain.JovemAprendiz;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class CalcularRemuneracaoServiceTest {

    @Test
    void deveCalcularRemuneracaoParaFuncioinarioCLT() {
        // arrange
        DecimalFormat formato = new DecimalFormat("#.00");
        CalcularRemuneracaoService calcularRemuneracaoService = new CalcularRemuneracaoService(
                new CLT("Lumbrigo", new BigDecimal("1000.00"), new BigDecimal("100.00"))
        );
        // act
        BigDecimal remuneracao = calcularRemuneracaoService.calcular();
        // assert
        assertEquals("1050,00", formato.format(remuneracao));
    }

    @Test
    void deveCalcularRemuneracaoParaFuncioinarioJovemAprendiz() {
        // arrange
        DecimalFormat formato = new DecimalFormat("#.00");
        CalcularRemuneracaoService calcularRemuneracaoService = new CalcularRemuneracaoService(
                new JovemAprendiz("Bob", new BigDecimal("500.00"), new BigDecimal("0.00"))
        );
        // act
        BigDecimal remuneracao = calcularRemuneracaoService.calcular();
        // assert
        assertEquals("500,00", formato.format(remuneracao));
    }

    @Test
    void deveCalcularRemuneracaoParaFuncioinarioEstagiario() {
        DecimalFormat formato = new DecimalFormat("#.00");
        CalcularRemuneracaoService calcularRemuneracaoService = new CalcularRemuneracaoService(
                new Estagiario("Ana", new BigDecimal("900.00"), new BigDecimal("0.00"))
        );
        // act
        BigDecimal remuneracao = calcularRemuneracaoService.calcular();
        // assert
        assertEquals("900,00", formato.format(remuneracao));
    }

    @Test
    void deveCalcularRemuneracaoParaFuncionarioEstagiarioComDesconto() {
        DecimalFormat formato = new DecimalFormat("#.00");
        CalcularRemuneracaoService calcularRemuneracaoService = new CalcularRemuneracaoService(
                new Estagiario("Maria", new BigDecimal("2500.00"), new BigDecimal("550.00"))
        );
        // act
        BigDecimal remuneracao = calcularRemuneracaoService.calcular();
        // assert
        assertEquals("3000,00", formato.format(remuneracao));
    }

    //testando com valores baixos
    @Test
    void deveCalcularRemuneracaoParaFuncioinarioBaixo() {
        DecimalFormat formato = new DecimalFormat("#.00");
        CalcularRemuneracaoService calcularRemuneracaoService = new CalcularRemuneracaoService(
                new JovemAprendiz("João", new BigDecimal("1.00"), new BigDecimal("0.00"))
        );
        // act
        BigDecimal remuneracao = calcularRemuneracaoService.calcular();
        // assert
        assertEquals("1,00", formato.format(remuneracao));
    }

}