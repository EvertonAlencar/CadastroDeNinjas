package com.java10x.CadastroDeNinjas.Ninja;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Essa e minha primeira mensagem de boas vindas";
    }

}
