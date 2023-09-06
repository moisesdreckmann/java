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

        Gerente g1 = new Gerente("marta", 20000,"AXWS",1000);
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

        List<Object> pessoas = new ArrayList<>();
        pessoas.add(d1);
        pessoas.add(d2);
        pessoas.add(d3);
        pessoas.add(d4);
        pessoas.add(d5);
        pessoas.add(d6);
        pessoas.add(g1);
        pessoas.add(g2);
        pessoas.add(g3);
        pessoas.add(g4);
        pessoas.add(g5);
        pessoas.add(g6);
        pessoas.add(c1);
        pessoas.add(c2);
        pessoas.add(c3);
        pessoas.add(c4);
        pessoas.add(c5);
        pessoas.add(c6);

        for (Object lista : pessoas) {
            System.out.println(lista);
        }
        System.out.println("\n\n");

    }

}
