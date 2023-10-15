package controller;

import model.Empresa;
import model.Funcionario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FuncionarioController {
    public static void main(String[] args) {

        LocalDate dataNascimento1 = LocalDate.of(1989, 3, 4);
        LocalDate dataNascimento2 = LocalDate.of(1990, 4, 5);
        LocalDate dataNascimento3 = LocalDate.of(1991, 5, 6);
        LocalDate dataNascimento4 = LocalDate.of(1992, 6, 7);
        LocalDate dataNascimento5 = LocalDate.of(1985, 11, 9);
        LocalDate dataNascimento6 = LocalDate.of(1986, 12, 12);
        Funcionario f1 = new Funcionario(1L, "111", "ana", "reis", dataNascimento1);
        Funcionario f2 = new Funcionario(2L, "222", "maria", "santos", dataNascimento2);
        Funcionario f3 = new Funcionario(3L, "444", "antonio", "silva", dataNascimento3);
        Funcionario f4 = new Funcionario(4L, "333", "jorge", "sauro", dataNascimento4);
        Funcionario f5 = new Funcionario(5L, "555", "marcos", "da silva", dataNascimento5);
        Funcionario f6 = new Funcionario(6L, "666", "sonia", "dos santos", dataNascimento6);

        Empresa e1 = new Empresa("112233", "razao", "empresa1");
        Empresa e2 = new Empresa("445566", "razao", "empresa2");

        e1.getFuncionarios().add(f1);
        e1.getFuncionarios().add(f2);
        e1.getFuncionarios().add(f3);
        e2.getFuncionarios().add(f4);
        e2.getFuncionarios().add(f5);
        e2.getFuncionarios().add(f6);

        imprimirFuncionariosNome(e1);
        imprimirFuncionariosNome(e2);

        imprimirFuncionariosIdadeDecrescente(e1);
        imprimirFuncionariosIdadeDecrescente(e2);


    }

    private static void imprimirFuncionariosNome(Empresa e) {
        e.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(e.getFuncionarios());
    }

    private static void imprimirFuncionariosIdadeDecrescente(Empresa e) {
        e.getFuncionarios().sort(Comparator.comparing(Funcionario::getDtNascimento).reversed());
        System.out.println(e.getFuncionarios());
    }

}
