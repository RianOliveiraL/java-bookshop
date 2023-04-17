package br.com.unipar;

import br.com.unipar.model.Cliente;
import br.com.unipar.model.Dono;
import br.com.unipar.model.Endereco;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // instância do Dono (Anderson) OBS: Chutei um endereço aleatório, e o cpf também, espero não ter acertado ksksksks
        Endereco enderecoDono = new Endereco("Paraná", "Toledo", "85906-070", "Avenida Parigot de Souza", "Jardim Porto Alegre", 5678, "PR");
        Dono dono = new Dono("Anderson", "893.475.900-37", 35, "Masculino", "43.839.472-0", "01/01/1988", enderecoDono, 1, new Date());

        // Criar/adicionar clientes OBS: dados gerados aleatoriamente no 4Devs
        Endereco enderecoCliente1 = new Endereco("Paraná", "Toledo", "23456-789", "Rua aleatória", "Bairro industrial", 456, "PR");
        Cliente cliente1 = dono.criarCliente("Eugênia", "222.333.444-55", 30, "Feminino", "234567", "01/01/1992", enderecoCliente1, 2, new Date(), 2000);

        Endereco enderecoCliente2 = new Endereco("Paraná", "Toledo", "34567-890", "Rua aleatória 2", "Porto Alegre", 789, "PR");
        Cliente cliente2 = dono.criarCliente("Leôncio", "333.444.555-66", 25, "Masculino", "345678", "02/02/1998", enderecoCliente2, 3, new Date(), 3000);

        dono.addCliente(cliente1);
        dono.addCliente(cliente2);


        int idCliente = 2;
        Cliente clienteEncontrado = dono.buscarIdClientes(idCliente);
        if (clienteEncontrado != null) {
            System.out.println("Cliente encontrado: " + clienteEncontrado.getNome());
        } else {
            System.out.println("Cliente não encontrado");
        }
    }
}