package com.clinica.Models;

public class Caixa {
    
    private double saldo;
    private String operacao; // 1 debito 2 credito
    private String data;
    private String hora;
    private String descricao;

    
    public Caixa(double saldo, String operacao, String data, String hora, String descricao) {
        this.saldo = saldo;
        this.operacao = operacao;
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public String getOperacao() {
        return operacao;
    }


    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }


    public String getData() {
        return data;
    }


    public void setData(String data) {
        this.data = data;
    }


    public String getHora() {
        return hora;
    }


    public void setHora(String hora) {
        this.hora = hora;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
