package br.edu.ifrs.pw1.teste2;

import br.edu.ifrs.pw1.clientes.Cliente;
import br.edu.ifrs.pw1.contatos.Endereco;

import java.util.ArrayList;
import java.util.List;

public class Teste2 {
    public static void main(String[] args) {
        List<Endereco> enderecos = new ArrayList<>();
        enderecos.add(new Endereco("Travessa","Casa",44515));
        enderecos.add(new Endereco("Rua","Casa",44515));


        Cliente cli1 = new Cliente();

        System.out.println(cli1);
        System.out.println(cli1.toString());

        Cliente cli2 = new Cliente("4644466", enderecos);
        System.out.println(cli2.toString());
    }
}
