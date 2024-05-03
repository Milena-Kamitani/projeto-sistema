package br.edu.unicesumar.service;

import br.edu.unicesumar.domain.RemuneracaoStrategy;

import java.math.BigDecimal;

public class CalcularRemuneracaoService {

    private RemuneracaoStrategy remuneracaoStrategy;

    public CalcularRemuneracaoService(RemuneracaoStrategy remuneracaoStrategy) {
        this.remuneracaoStrategy = remuneracaoStrategy;
    }

    public BigDecimal calcular() {
        return remuneracaoStrategy.calcularRemuneracao();
    }

}
