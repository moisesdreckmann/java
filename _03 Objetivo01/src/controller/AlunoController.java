package controller;
import model.Aluno;

import java.util.*;

public class AlunoController {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(1,11111111,"Ana","Santos","ana@gmail.com");
        Aluno a2 = new Aluno(2,22222222,"Maria","Silva","maria@gmail.com");

        Aluno a3 = new Aluno(3, "Marta");
        Aluno a4 = new Aluno(4, "João");

        Aluno a5 = new Aluno();
        a5.setId(55);
        a5.setCpf(555555555);
        a5.setNome("José");
        a5.setSobrenome("da Silva");
        a5.setEmail("jose@gmail.com");

        Aluno a6 = new Aluno();
        a6.setId(6);
        a6.setCpf(66666666);
        a6.setNome("Pedro");
        a6.setSobrenome("dos Santos");
        a6.setEmail("pedro@gmail.com");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);

        a5.setId(5);
        a5.setCpf(10101010);
        a5.setNome("Mateus");
        a5.setSobrenome("Cunha");
        a5.setEmail("mateus@gmail.com");
        a6.setId(11);
        a6.setCpf(11101110);
        a6.setNome("Jorge");
        a6.setSobrenome("Pereira");
        a6.setEmail("jorge@gmail.com");

        System.out.println("\nDados Aluno 5:");
        System.out.println(a5.getId());
        System.out.println(a5.getCpf());
        System.out.println(a5.getNome());
        System.out.println(a5.getSobrenome());
        System.out.println(a5.getEmail()+"\n");

        System.out.println("Dados Aluno 6:");
        System.out.println(a6.getId());
        System.out.println(a6.getCpf());
        System.out.println(a6.getNome());
        System.out.println(a6.getSobrenome());
        System.out.println(a6.getEmail()+"\n");

        List<Aluno> alunosList = new ArrayList<>();
        alunosList.add(a1);
        alunosList.add(a2);
        alunosList.add(a3);
        alunosList.add(a4);
        alunosList.add(a5);
        alunosList.add(a6);
        System.out.println("Lista: " + alunosList +"\n");

        Map<Integer,Aluno> alunosMap = new HashMap<>();
        alunosMap.put(a1.getId(),a1);
        alunosMap.put(a2.getId(),a2);
        alunosMap.put(a3.getId(),a3);
        alunosMap.put(a4.getId(),a4);
        alunosMap.put(a5.getId(),a5);
        alunosMap.put(a6.getId(),a6);
        System.out.println("Map: " + alunosMap);

        System.out.println("\nAluno localizado no List: ");
        alunosList.forEach(a -> {
            if (a.getId() == 5) {
                System.out.println(a);
            }
        });
        System.out.println("\n");

        System.out.println("Aluno localizado no Map: ");
        alunosMap.forEach((id,aluno) -> {
            if (id.equals(5)) {
                System.out.println(aluno);
            }
        });
        System.out.println("\n");

        alunosList.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println("Ordem Reversa: " + alunosList + "\n");

    }
}