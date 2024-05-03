package br.edu.unicesumar.domain;

import java.math.BigDecimal;

public class CLT extends Funcionario implements RemuneracaoStrategy {
    public CLT(String nome, BigDecimal salario, BigDecimal bonificacao) {
        super(nome, salario, bonificacao);
    }

    @Override
    public BigDecimal calcularRemuneracao() {
        var salarioComDesconto = this.getSalario().subtract(this.getSalario().multiply(new BigDecimal("0.05")));
        return salarioComDesconto.add(getBonficacao());
    }
}
