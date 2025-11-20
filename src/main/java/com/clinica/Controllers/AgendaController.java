package com.clinica.Controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.Models.Agenda;

import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping
@RestController

public class AgendaController {
    
    private String status;

    @RequestMapping("/agenda/marcar")
    public Map<String, String> AgendarConsulta(@RequestParam String paciente, // parametros da agenda
                                    @RequestParam String medico,  
                                    @RequestParam String data,
                                    @RequestParam String hora,
                                    @RequestParam double valorConsulta) {

        Agenda.ObjAgenda.setPaciente(paciente); // colocar os argumentos recebidos no objeto Agenda
        Agenda.ObjAgenda.setMedico(medico);      
        Agenda.ObjAgenda.setData(data);
        Agenda.ObjAgenda.setHora(hora);
        Agenda.ObjAgenda.setValorConsulta(valorConsulta);
        
        status = "Agenda marcada!";  // mudar status para agenda marcada

        return Map.of("Paciente", Agenda.ObjAgenda.getPaciente(), //retornar json do objeto e status para o front-end
                        "Medico", Agenda.ObjAgenda.getMedico(),   
                        "Data", Agenda.ObjAgenda.getData(),
                        "Hora", Agenda.ObjAgenda.getHora(),
                        "Valor da consulta", String.valueOf(Agenda.ObjAgenda.getValorConsulta()),
                        "Status", status);
    }

    @RequestMapping("/agenda/desmarcar")
    public Map<String,  String> DesmarcarConsulta(@RequestParam String paciente, // parametros do cancelamento
                                                  @RequestParam String data,
                                                  @RequestParam String hora) {

        if( paciente.equals(Agenda.ObjAgenda.getPaciente()) && data.equals(Agenda.ObjAgenda.getData()) && hora.equals(Agenda.ObjAgenda.getHora()) ){ // condicional para saber se a agenda existe
            Agenda.ObjAgenda.setPaciente(""); // se existir remover os atributos do objeto agenda
            Agenda.ObjAgenda.setData("");
            Agenda.ObjAgenda.setHora("");

            status = "Agenda cancelada"; // mudar status para agenda cancelada com sucesso

            return Map.of("Status", status); // retornar json status da agenda cancelada
        }

        status = "Agenda não encontrada"; // caso a agenda não existe mudar status para agenda não encontrada
        return Map.of("Status", status); // retornar json status
    }
    
}
