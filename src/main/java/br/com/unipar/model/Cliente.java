package br.com.unipar.model;

import java.util.Date;

public class Cliente extends Pessoa {
    private double dinheiro;


    public Cliente(String nome, String cpf, int idade, String genero, String rg, Endereco endereco, int id, Date dataCadastro, double dinheiro) {
        super(nome, cpf, idade, genero, rg, endereco, id, dataCadastro);
        this.dinheiro = dinheiro;
    }


    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
}
