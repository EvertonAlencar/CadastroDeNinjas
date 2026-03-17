package com.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Essa e minha primeira mensagem de boas vindas";
    }

}
