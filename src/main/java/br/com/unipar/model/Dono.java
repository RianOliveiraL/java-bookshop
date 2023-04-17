package br.com.unipar.model;

import java.util.ArrayList;
import java.util.Date;

public class Dono extends Pessoa {
    private ArrayList<Cliente> clientes;


    public Dono(String nome, String cpf, int idade, String genero, String rg, String dataNascimento, Endereco endereco, int id, Date dataCadastro) {
        super(nome, cpf, idade, genero, rg, dataNascimento, endereco, id, dataCadastro);

    }

    public Cliente criarCliente(String nome, String cpf, int idade, String genero, String rg, String dataNascimento, Endereco endereco, int id, Date dataCadastro, double dinheiro){
        Cliente cliente = new Cliente(nome, cpf, idade, genero, rg, dataNascimento, endereco, id, dataCadastro, dinheiro);
        return cliente;
    }

    public void adicionarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public Cliente buscarIdClientes(int id){
        for (Cliente cliente: clientes){
            if (cliente.getId() == id){
                return cliente;
            }
        }
        return null;
    }



}
