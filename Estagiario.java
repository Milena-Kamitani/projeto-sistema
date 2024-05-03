package br.edu.unicesumar.domain;

import java.math.BigDecimal;

public class Estagiario extends Funcionario implements RemuneracaoStrategy {
    public Estagiario(String nome, BigDecimal salario, BigDecimal bonificacao) {
        super(nome, salario, bonificacao);
    }

    @Override
    public BigDecimal calcularRemuneracao() {
        var limit = new BigDecimal("3000.00");
        var valorOriginal = this.getSalario().add(getBonficacao());
        if (valorOriginal.compareTo(limit) > 0) {
            var salarioComDesconto = this.getSalario().subtract(this.getSalario().multiply(new BigDecimal("0.02")));
            return salarioComDesconto.add(getBonficacao());
        }
        return this.getSalario().add(getBonficacao());

    }
}
