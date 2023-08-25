package controller;

import model.Cliente;
import model.Marca;
import model.Modelo;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class ClienteController {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(1L,"012344678", "moises", "silva", "Endereco", "00010000", "22334455", "adas@gmail.com");
        System.out.println(c1 + "\n");


        Cliente c2 = new Cliente();
        c2.setId(2L);
        c2.setCpf("4566");
        c2.setNome("moises");
        c2.setSobrenome("santos");
        c2.setEndereco("endereço");
        c2.setCep("5433322");
        c2.setTelefone("888888888");
        c2.setEmail("asdasjiod@gmail.com");
        System.out.println("cpf: " + c2.getCpf());
        System.out.println("nome: " + c2.getNome());
        System.out.println("sobrenome: " + c2.getSobrenome());
        System.out.println("endereço: " + c2.getEndereco());
        System.out.println("cep: " + c2.getCep());
        System.out.println("telefone: " + c2.getTelefone());
        System.out.println("Email: " + c2.getEmail() + "\n");


        Cliente c3 = new Cliente(3L,"012344678", "Moises", "silva", "Endereco", "00010000", "22334455", "moises@gmail.com");
        Cliente c4 = new Cliente(3L,"012344678", "Moises", "silva", "Endereco", "00010000", "22334455", "moises@gmail.com");
        Cliente c5 = new Cliente(4L,"543336789", "Joao", "santos", "Endereco", "22222222", "666666666", "joao@gmail.com");
        Cliente c6 = new Cliente(5L,"555555555", "Ana", "pereira", "Endereco", "33333333", "777777777", "ana@gmail.com");
        Cliente c7 = new Cliente(6L,"777777777", "Maria", "sauro", "Endereco", "55555555", "8888888888", "maria@gmail.com");

        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        System.out.println(c3.equals(c4) + "\n");

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(c3);
        clientes.add(c4);
        clientes.add(c5);
        clientes.add(c6);
        clientes.add(c7);
        System.out.println("Lista: " + clientes +"\n");

        clientes.sort(Comparator.comparing(Cliente::getId).reversed());
        System.out.println("Ordem Reversa: " + clientes + "\n");

        System.out.println("Clientes localizados: ");
        clientes.forEach(c -> {
            if (c.getId() == 3) {
                System.out.println(c);
            }
        });
        System.out.println("\n");

        Map<Long, Cliente> clientesMap = new HashMap<>();
        clientesMap.put(c1.getId(),c1);
        clientesMap.put(c2.getId(),c2);
        clientesMap.put(c5.getId(),c5);
        clientesMap.put(c6.getId(),c6);
        clientesMap.put(c7.getId(),c7);
        System.out.println("Coleção do tipo Map\n" + clientesMap);


    }


}
