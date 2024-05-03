package br.edu.unicesumar.domain;

import java.math.BigDecimal;

public class JovemAprendiz extends Funcionario implements RemuneracaoStrategy {
    public JovemAprendiz(String nome, BigDecimal salario, BigDecimal bonificacao) {
        super(nome, salario, bonificacao);
    }

    @Override
    public BigDecimal calcularRemuneracao() {
        return getSalario();
    }
}
