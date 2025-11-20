package com.clinica.Controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.Models.Medico;

import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping
@RestController
public class MedicoController {
    
    private String status;

    @RequestMapping("/medico/cadastro")
    public Map<String, String> cadastrarMedico(@RequestParam String nome) {

        Medico.ObjMedico.setNome(nome);

        status = "Cadastrado!";
        
        return Map.of("Nome", Medico.ObjMedico.getNome(),
                    "Status", status);
    }
    

}
