package br.com.unipar.model;

import java.util.ArrayList;
import java.util.Date;

public class Dono extends Pessoa {
    private ArrayList<Cliente> clientes;

    //construtor
    public Dono(String nome, String cpf, int idade, String genero, String rg, String dataNascimento, Endereco endereco, int id, Date dataCadastro) {
        super(nome, cpf, idade, genero, rg, dataNascimento, endereco, id, dataCadastro);
        this.clientes = new ArrayList<>();
    }

    //metodo construtor vazio
    public Dono(){}

    public Cliente criarCliente(String nome, String cpf, int idade, String genero, String rg, String dataNascimento, Endereco endereco, int id, Date dataCadastro, double dinheiro){
        Cliente cliente = new Cliente(nome, cpf, idade, genero, rg, dataNascimento, endereco, id, dataCadastro, dinheiro);
        return cliente;
    }

    // adicionar novos clientes
    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    //Buscar clientes pelo Id de cada um
    public Cliente buscarIdClientes(int id){
        for (Cliente cliente: clientes){
            if (cliente.getId() == id){
                return cliente;
            }
        }
        return null;
    }



}
