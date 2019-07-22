package com.matera.controller;

import com.matera.model.Funcionario;
import com.matera.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

//link para o console: http://localhost:8080/h2-console
@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    FuncionarioService funcionarioService;

    @PostMapping
    public String salvarFuncionario(@RequestBody @Valid Funcionario funcionario) {
        return funcionarioService.salvarFuncionario(funcionario);
    }

//    @GetMapping
//    public List<Funcionario> returnAquisition() {
//        return null;
//
//    }




}




