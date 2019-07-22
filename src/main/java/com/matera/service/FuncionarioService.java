package com.matera.service;

import com.matera.model.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.sql.Statement;

@Service
public class FuncionarioService {


    DatabaseTreatment db;


    public String salvarFuncionario(Funcionario func) {

        String sql = "INSERT INTO database_projeto.funcionarios (id,nome,idade,email) \n" +
                "VALUES ('0001'," + "'" + func.getNome() + "'," + "'" + func.getIdade() + "'," + "'" + func.getEmail() + "')";

        db.abreConexaoComBanco();
        db.insereFuncionarioBanco(sql);
        db.fechaConexaoComBanco();

        return "Classe concluída (teste)";
    }
}
