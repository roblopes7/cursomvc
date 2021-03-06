package com.udemy.cursomcv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @RequestMapping("/cadastrar")
    public String cadastrar(){
        return "/funcionario/cadastro";
    }

    @RequestMapping("/listar")
    public String listar(){
        return "/funcionario/lista";
    }
}
