package com.matera.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Funcionario {


    @Id
    @GeneratedValue

    private long id;
    @NotNull(message="nome não pode ser vazio")
    private String nome;

    @NotNull(message="idade não pode ser vazia")
    private int idade;

    @Email(message = "Email deve ser valido")
    @NotNull(message="email não pode ser vazio")
    @NotEmpty(message="email não pode ser vazio")
    private String email;


    public Funcionario() {
    }

    public Funcionario(String nome, int idade, String email) {
        this.nome = nome;
        this.idade= idade;
        this.email=email;



    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof com.matera.model.Funcionario)) return false;

        com.matera.model.Funcionario that = (com.matera.model.Funcionario) o;

        if (getIdade() != that.getIdade()) return false;
        return getNome() != null ? getNome().equals(that.getNome()) : that.getNome() == null;

    }

    @Override
        public String toString() {
            return "Funcionario{" +
                    "idade=" + idade +
                    ", nome='" + nome + '\'' +
                    '}';
    }


    @Override
    public int hashCode() {
        int result = getIdade();
        result = 31 * result + (getNome() != null ? getNome().hashCode() : 0);
        return result;
    }
}
