package controller;

import model.Conta;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class ContaController {
    public static void main(String[] args) {
        Conta c1 = new Conta(1L,500);
        c1.setDeposita(500);
        c1.setSacar(1200);
        c1.setAtualiza(20);
        System.out.println(c1 + "\n");


        Conta c2 = new Conta();
        c2.setId(2L);
        c2.setSaldo(500);
        c2.setDeposita(500);
        c2.setSacar(400);
        c2.setAtualiza(20);
        System.out.println("Saldo: " + c2.getSaldo() + "\n");


        Conta c3 = new Conta(3L,500);
        Conta c4 = new Conta(3L,500);
        Conta c5 = new Conta(4L,700);
        Conta c6 = new Conta(5L,800);
        Conta c7 = new Conta(6L,900);

        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        System.out.println(c3.equals(c4) + "\n");

        List<Conta> contas = new ArrayList<>();
        contas.add(c3);
        contas.add(c4);
        contas.add(c5);
        contas.add(c6);
        contas.add(c7);
        System.out.println("Coleção do tipo Lista: " + contas + "\n");

        contas.sort(Comparator.comparing(Conta::getId).reversed());
        System.out.println(contas + "\n");

        System.out.println("Contas Localizadas: ");
        contas.forEach(c -> {
            if (c.getId() == 3) {
                System.out.println(c);
            }
        });
        System.out.println("\n");

        Map<Long, Conta> contasMap = new HashMap<>();
        contasMap.put(c1.getId(),c1);
        contasMap.put(c2.getId(),c2);
        contasMap.put(c5.getId(),c5);
        contasMap.put(c6.getId(),c6);
        contasMap.put(c7.getId(),c7);
        System.out.println("Coleção do tipo Map\n" + contasMap);
    }
}
