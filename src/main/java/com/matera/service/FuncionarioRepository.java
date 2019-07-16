package com.matera.service;

import com.matera.model.Funcionario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {


    long countByIdade(int idade);
    List<Funcionario> findByNome(String nome);

}

