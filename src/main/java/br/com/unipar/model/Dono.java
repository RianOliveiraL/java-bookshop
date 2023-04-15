package br.com.unipar.model;

import javax.swing.*;
import java.util.Date;

public class Dono extends Pessoa {

    private Cliente cliente;

    public Dono(String nome, String cpf, int idade, String genero, String rg, Endereco endereco, int id, Date dataCadastro) {
        super(nome, cpf, idade, genero, rg, endereco, id, dataCadastro);

    }

    public Pessoa criarCliente(String nome, String cpf, int idade, String genero, String rg, Endereco endereco, int id, Date dataCadastro){

        Pessoa cliente = new Pessoa(nome, cpf, idade, genero, rg, endereco, id, dataCadastro);

        return cliente;
    }


}
