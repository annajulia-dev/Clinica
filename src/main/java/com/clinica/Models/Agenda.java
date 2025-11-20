package com.clinica.Models;

public class Agenda {
    private String paciente;
    private String medico;
    private String data;
    private String hora;
    private double valorConsulta; 

    
    public Agenda(String paciente, String medico, String data, String hora, double valorConsulta) {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.hora = hora;
        this.valorConsulta = valorConsulta;
    }


    public String getPaciente() {
        return paciente;
    }


    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }


    public String getMedico() {
        return medico;
    }


    public void setMedico(String medico) {
        this.medico = medico;
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


    public double getValorConsulta() {
        return valorConsulta;
    }


    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public static Agenda ObjAgenda = new Agenda("", "", "", "", 0.00);
}
