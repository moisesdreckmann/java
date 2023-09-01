package controller;
import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FuncionarioController2 {
    public static void main(String[] args) {
        GerenteGeral gg = new GerenteGeral("antonio",6500);
        GerenteDesenvolvimento gd = new GerenteDesenvolvimento("gustavo", 4500);
        DesenvolvedorSenior ds1 = new DesenvolvedorSenior("ana", 3500);
        DesenvolvedorSenior ds2 = new DesenvolvedorSenior("maria", 3500);
        DesenvolvedorSenior ds3 = new DesenvolvedorSenior("augusto", 3500);
        DesenvolvedorSenior ds4 = new DesenvolvedorSenior("pedro", 3500);
        DesenvolvedorSenior ds5 = new DesenvolvedorSenior("joão", 3500);
        DesenvolvedorSenior ds6 = new DesenvolvedorSenior("moises", 3500);
        DesenvolvedorPleno dp1 = new DesenvolvedorPleno("miguel", 2500);
        DesenvolvedorPleno dp2 = new DesenvolvedorPleno("paulo", 2500);
        DesenvolvedorPleno dp3 = new DesenvolvedorPleno("sofia", 2500);
        DesenvolvedorPleno dp4 = new DesenvolvedorPleno("michel", 2500);
        DesenvolvedorPleno dp5 = new DesenvolvedorPleno("anderson", 2500);
        DesenvolvedorPleno dp6 = new DesenvolvedorPleno("marta", 2500);
        DesenvolvedorJunior dj1 = new DesenvolvedorJunior("timão", 1800);
        DesenvolvedorJunior dj2 = new DesenvolvedorJunior("pumba", 1800);
        DesenvolvedorJunior dj3 = new DesenvolvedorJunior("leão", 1800);
        DesenvolvedorJunior dj4 = new DesenvolvedorJunior("timoteo", 1800);
        DesenvolvedorJunior dj5 = new DesenvolvedorJunior("marcos", 1800);
        DesenvolvedorJunior dj6 = new DesenvolvedorJunior("marcia", 1800);

        List<Funcionario> funcionariosList = new ArrayList();
        funcionariosList.add(gg);
        funcionariosList.add(gd);
        funcionariosList.add(ds1);
        funcionariosList.add(ds2);
        funcionariosList.add(ds3);
        funcionariosList.add(ds4);
        funcionariosList.add(ds5);
        funcionariosList.add(ds6);
        funcionariosList.add(dp1);
        funcionariosList.add(dp2);
        funcionariosList.add(dp3);
        funcionariosList.add(dp4);
        funcionariosList.add(dp5);
        funcionariosList.add(dp6);
        funcionariosList.add(dj1);
        funcionariosList.add(dj2);
        funcionariosList.add(dj3);
        funcionariosList.add(dj4);
        funcionariosList.add(dj5);
        funcionariosList.add(dj6);

        System.out.println(funcionariosList);
        System.out.println("\n");

        for (Funcionario f : funcionariosList) {
            System.out.println(f + " Bonus: "+ f.getBonus());
        }
        System.out.println("\n");


        for(Funcionario f: funcionariosList) {
            System.out.println(f + " Salario Bruto: " + (f.getSalario()+ f.getBonus()) + " Bonus: " + f.getBonus());
        }
        System.out.println("\n");

        for(Funcionario f: funcionariosList) {
            double bonus5 = f.getSalario() * 0.05;
            double salarioReajustado = f.getSalario() + bonus5;
            System.out.println(f + " Salario Reajustado: " + salarioReajustado + " Bonus: " + bonus5);
        }




    }
}
