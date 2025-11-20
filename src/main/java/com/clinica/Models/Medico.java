package com.clinica.Models;

public class Medico extends Pessoa {

    private String CRM;
    private String especialidade;
    

    public Medico(String nome, String cpf, String endereco, String email, String telefone, String cRM,
            String especialidade) {
        super(nome, cpf, endereco, email, telefone);
        CRM = cRM;
        this.especialidade = especialidade;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String cRM) {
        CRM = cRM;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public static Medico ObjMedico = new Medico("", "", "", "", "", "", "");
}
