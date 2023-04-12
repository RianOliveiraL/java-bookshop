package br.com.unipar.model;

import java.util.Date;

public class Cliente extends Pessoa {
    private int idCliente;
    private Date dataCadastro;
    private double dinheiro;

    public Cliente(String nome, String cpf, int idade, String genero, String rg, Endereco endereco, int idCliente, Date dataCadastro, double dinheiro) {
        super(nome, cpf, idade, genero, rg, endereco);
        this.idCliente = idCliente;
        this.dataCadastro = dataCadastro;
        this.dinheiro = dinheiro;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
}
