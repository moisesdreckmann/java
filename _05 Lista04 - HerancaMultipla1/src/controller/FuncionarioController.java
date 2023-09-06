package controller;
import model.Funcionario;
import model.Cliente;
import model.Gerente;
import model.Desenvolvedor;
import model.Investidor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class FuncionarioController {
    public static void main(String[] args) {
        Desenvolvedor d1 = new Desenvolvedor("moises",10000);
        Desenvolvedor d2 = new Desenvolvedor("ana",4000);
        Desenvolvedor d3 = new Desenvolvedor("maria",4000);
        Desenvolvedor d4 = new Desenvolvedor("joão",4000);
        Desenvolvedor d5 = new Desenvolvedor("pedro",4000);
        Desenvolvedor d6 = new Desenvolvedor("rafael",4000);

        Gerente g1 = new Gerente("marta", 25000,"AXWS",1000);
        Gerente g2 = new Gerente("anna", 20000,"AXWS",4000);
        Gerente g3 = new Gerente("josé", 20000,"AXWS",50);
        Gerente g4 = new Gerente("gustavo", 20000,"AXWS",500);
        Gerente g5 = new Gerente("ana clara", 20000,"AXWS",700);
        Gerente g6 = new Gerente("roberto", 20000,"AXWS",200);

        Cliente c1 = new Cliente("alberto","dos santos", "AXWS", 500);
        Cliente c2 = new Cliente("augusto","da silva", "AXWS", 4600);
        Cliente c3 = new Cliente("alice","sauro", "AXWS", 800);
        Cliente c4 = new Cliente("rosa","ferreira", "AXWS", 1000);
        Cliente c5 = new Cliente("margarida","oliveira", "AXWS", 5500);
        Cliente c6 = new Cliente("hortencia","leite", "AXWS", 50);

        System.out.println(d1 + "Bonus: " + d1.getBonus());
        System.out.println(d2 + "Bonus: " + d2.getBonus());
        System.out.println(d3 + "Bonus: " + d3.getBonus());
        System.out.println(d4 + "Bonus: " + d4.getBonus());
        System.out.println(d5 + "Bonus: " + d5.getBonus());
        System.out.println(d6 + "Bonus: " + d6.getBonus());
        System.out.println(g1 + "Bonus: " + g1.getBonus());
        System.out.println(g2 + "Bonus: " + g2.getBonus());
        System.out.println(g3 + "Bonus: " + g3.getBonus());
        System.out.println(g4 + "Bonus: " + g4.getBonus());
        System.out.println(g5 + "Bonus: " + g5.getBonus());
        System.out.println(g6 + "Bonus: " + g6.getBonus());
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6+"\n\n");

        List<Funcionario> funcionarioList = new ArrayList<>();
        funcionarioList.add(d1);
        funcionarioList.add(d2);
        funcionarioList.add(d3);
        funcionarioList.add(d4);
        funcionarioList.add(d5);
        funcionarioList.add(d6);
        funcionarioList.add(g1);
        funcionarioList.add(g2);
        funcionarioList.add(g3);
        funcionarioList.add(g4);
        funcionarioList.add(g5);
        funcionarioList.add(g6);

        List<Investidor> investidorList = new ArrayList<>();
        investidorList.add(g1);
        investidorList.add(g2);
        investidorList.add(g3);
        investidorList.add(g4);
        investidorList.add(g5);
        investidorList.add(g6);
        investidorList.add(c1);
        investidorList.add(c2);
        investidorList.add(c3);
        investidorList.add(c4);
        investidorList.add(c5);
        investidorList.add(c6);

        System.out.println(funcionarioList);
        System.out.println("\n\n");
        System.out.println(investidorList);
        System.out.println("\n\n");

        funcionarioList.sort(Comparator.comparing(Funcionario::getSalario).reversed());
        System.out.println(funcionarioList);
        System.out.println("\n\n");

        investidorList.sort(Comparator.comparing(Investidor::getQuantidade).reversed());
        System.out.println(investidorList);
        System.out.println("\n\n");

        Funcionario maiorSalario = funcionarioList.stream()
                .max(Comparator.comparing(Funcionario::getSalario))
                .orElse(null);
        System.out.println(maiorSalario);
        System.out.println("\n\n");

        Investidor maiorQuantidadeDeTickers = investidorList.stream()
                .max(Comparator.comparing(Investidor::getQuantidade))
                .orElse(null);
        System.out.println(maiorQuantidadeDeTickers);


    }

}
