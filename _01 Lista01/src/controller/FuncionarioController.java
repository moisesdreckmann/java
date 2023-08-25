package controller;

import model.Funcionario;

import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class FuncionarioController {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(1L,"João", 1320);
        System.out.println(f1 + "\n");


        Funcionario f2 = new Funcionario();
        f2.setId(2L);
        f2.setNome("Maria");
        f2.setSalario(1500);
        System.out.println("Nome: " + f2.getNome());
        System.out.println("Salario: " + f2.getSalario() + "\n");


        Funcionario f3 = new Funcionario(3L,"João", 1320);
        Funcionario f4 = new Funcionario(3L,"João", 1320);
        Funcionario f5 = new Funcionario(4L,"Ana", 1400);
        Funcionario f6 = new Funcionario(5L,"Maria", 1500);
        Funcionario f7 = new Funcionario(6L,"José", 1600);

        System.out.println(f4.hashCode());
        System.out.println(f3.hashCode());
        System.out.println(f4.equals(f3) + "\n");

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(f3);
        funcionarios.add(f4);
        funcionarios.add(f5);
        funcionarios.add(f6);
        funcionarios.add(f7);
        System.out.println("Coleção do tipo Lista: " + funcionarios + "\n");

        funcionarios.sort(Comparator.comparing(Funcionario::getId).reversed());
        System.out.println(funcionarios + "\n");

        System.out.println("Funcionarios Localizadas: ");
        funcionarios.forEach(f -> {
            if (f.getId() == 3) {
                System.out.println(f);
            }
        });
        System.out.println("\n");

        Map<Long, Funcionario> funcionariosMap = new HashMap<>();
        funcionariosMap.put(f1.getId(),f1);
        funcionariosMap.put(f2.getId(),f2);
        funcionariosMap.put(f5.getId(),f5);
        funcionariosMap.put(f6.getId(),f6);
        funcionariosMap.put(f7.getId(),f7);
        System.out.println("\nColeção do tipo Map\n" + funcionariosMap);

    }
}
