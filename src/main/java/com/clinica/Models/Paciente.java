package com.clinica.Models;

public class Paciente extends Pessoa {
    
    private String convenio;
    private String tratamento;
    
    
    public Paciente(String nome, String cpf, String endereco, String email, String telefone, String convenio,
            String tratamento) {
        super(nome, cpf, endereco, email, telefone);
        this.convenio = convenio;
        this.tratamento = tratamento;
    }

    public String getConvenio() {
        return convenio;
    }


    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }


    public String getTratamento() {
        return tratamento;
    }


    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }
}
