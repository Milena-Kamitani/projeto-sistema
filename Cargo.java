package br.edu.unicesumar.domain;

import java.math.BigDecimal;

public class Cargo {
    private String nome;
    private BigDecimal salario;

    public Cargo(){
    }

    public Cargo(String nome, BigDecimal salario) {
        this.nome= nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
