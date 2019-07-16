package com.matera.controller;

import com.matera.model.Funcionario;
import com.matera.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

//link para o console: http://localhost:8080/h2-console
@RestController
public class Controller {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping("/funcionario")
    public List<Funcionario> returnAquisition() {
        return funcionarioService.findAllFuncionarios();

    }

    @DeleteMapping("/funcionario/{id}")
    public String deletaFuncionario(@PathVariable long id){
        return funcionarioService.deletaFunc(id);
    }

    @GetMapping("/funcionario/{id}")
    public Optional<Funcionario> buscaFuncionario(@PathVariable long id){
        return funcionarioService.buscaFuncionario(id);
    }

    @GetMapping("")
    public String homePage() {
        return "homePage";
    }


    @PostMapping("/funcionario")
    public String salvaFunc (@RequestBody @Valid Funcionario func) {
        return funcionarioService.salvaFunc(func);

    }

}




