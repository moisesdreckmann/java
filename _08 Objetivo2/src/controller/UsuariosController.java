package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class UsuariosController {
    public static void main(String[] args) {
        ContaPoupança cp1 = new ContaPoupança(500.0);
        ContaPoupança cp2 = new ContaPoupança(600.0);
        ContaPoupança cp3 = new ContaPoupança(700.0);
        ContaCorrente cc1 = new ContaCorrente(1000.0);
        ContaCorrente cc2 = new ContaCorrente(1200.0);
        ContaCorrente cc3 = new ContaCorrente(1500.0);
        Cliente c1 = new Cliente("Moisés");
        Cliente c2 = new Cliente("Ana");
        Cliente c3 = new Cliente("João");

        System.out.println(cp1);
        System.out.println(cp2);
        System.out.println(cp3);
        System.out.println(cc1);
        System.out.println(cc2);
        System.out.println(cc3);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("\n");

        List<Conta> contaList = new ArrayList<>();
        contaList.add(cp1);
        contaList.add(cp2);
        contaList.add(cp3);
        contaList.add(cc1);
        contaList.add(cc2);
        contaList.add(cc3);

        List<Associado> associadoList = new ArrayList<>();
        associadoList.add(cc1);
        associadoList.add(cc2);
        associadoList.add(cc3);
        associadoList.add(c1);
        associadoList.add(c2);
        associadoList.add(c3);

        System.out.println(contaList + "\n");
        System.out.println(associadoList + "\n");

        cp1.depositar(1000.0);
        cp1.atualizar(0.05);
        cp1.sacar(50.0);
        cc1.depositar(500.0);
        cc1.sacar(400.0);
        System.out.println(cp1);
        System.out.println(cc1 + "\n");

        cc1.setQuantidadeDeCotas(100);
        cc2.setQuantidadeDeCotas(400);
        cc3.setQuantidadeDeCotas(600);
        c1.setQuantidadeDeCotas(300);
        c2.setQuantidadeDeCotas(600);
        c3.setQuantidadeDeCotas(600);
        associadoList.forEach(i ->{
            System.out.println(i + "Quantidade de Cotas: " + i.getQuantidadeDeCotas());
        });
        System.out.println("\n\n");

        //quantidade de cotas em ordem decrescente
        associadoList.sort(Comparator.comparing(Associado::getQuantidadeDeCotas).reversed());
        associadoList.forEach(i ->{
            System.out.println(i + "Quantidade de Cotas: " + i.getQuantidadeDeCotas());
        });
        System.out.println("\n\n");

        //maximo numero de cotas:
        int valorMax = associadoList.stream()
                .map(Associado::getQuantidadeDeCotas)
                .max(Integer::compareTo)
                .orElse(0);

        associadoList.stream()
                .filter(associado -> associado.getQuantidadeDeCotas() == valorMax)
                .forEach(associado -> {
                    System.out.println(associado + " MaxCotas: " + associado.getQuantidadeDeCotas());
                });
        System.out.println("\n\n");

        //contas em ordem decrescente
        contaList.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println(contaList);
        System.out.println("\n\n");

        //associados que possuem conta
        associadoList.stream()
                .filter(associado -> associado instanceof Conta)
                .forEach(associado -> {
                    System.out.println(associado);
                });
        System.out.println("\n\n");

        //maior saldo bancario
        double maiorSaldo = contaList.stream()
                .map(Conta::getSaldo)
                .max(Double::compareTo)
                .orElse(0.0);

        contaList.stream()
                .filter(conta -> conta.getSaldo() == maiorSaldo)
                .forEach(conta -> {
                    System.out.println("conta com maior saldo: " + conta);
                });
    }
}
