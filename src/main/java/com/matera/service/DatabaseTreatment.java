package com.matera.service;

import com.matera.model.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@Component
public class DatabaseTreatment {

    String jdbcURL = "jdbc:mysql://localhost:3306/mysql";
    String username = "root";
    String password = "mysql";

    Connection connection;

    public void abreConexaoComBanco()

    {
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);

            if (connection != null) {
                System.out.println("Connected Successfully");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void fechaConexaoComBanco() {

        try {
            connection.close();

            if (connection != null) {
                System.out.println("Desligado do banco");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    public void insereFuncionarioBanco(String sql ){
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        }
        catch(SQLException excecaoSql){
            excecaoSql.printStackTrace();
        }
    }
}
