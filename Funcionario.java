package br.edu.unicesumar.domain;

import java.math.BigDecimal;

public abstract class Funcionario implements RemuneracaoStrategy{
    private String nome;
    private BigDecimal salario;
    private BigDecimal bonficacao;

    public Funcionario (String nome, BigDecimal salario, BigDecimal bonficacao) {
        this.nome = nome;
        this.salario = salario;
        this.bonficacao = bonficacao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getBonficacao() {
        return bonficacao;
    }
}
