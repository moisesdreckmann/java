package controller;
import model.Funcionario;
import model.Gerente;
import model.Desenvolvedor;
public class FuncionarioController1 {
    public static void main(String[] args) {
        Desenvolvedor d1 = new Desenvolvedor("ana",1000);
        Desenvolvedor d2 = new Desenvolvedor();
        d2.setNome("maria");
        d2.setSalario(1000);

        Gerente g1 = new Gerente("josé", 4000);
        Gerente g2 = new Gerente();
        g2.setNome("alberto");
        g2.setSalario(4000);


        System.out.println(d1 + " Bonus: "+ d1.getBonus());
        System.out.println(d2 + " Bonus: "+ d2.getBonus());
        System.out.println(g1 + " Bonus: "+ g1.getBonus());
        System.out.println(g2 + " Bonus: "+ g2.getBonus());

        d1.setSalario(1200);
        g1.setSalario(4500);

        System.out.println(d1 + " Bonus: "+ d1.getBonus());
        System.out.println(d2 + " Bonus: "+ d2.getBonus());
        System.out.println(g1 + " Bonus: "+ g1.getBonus());
        System.out.println(g2 + " Bonus: "+ g2.getBonus());
    }
}

// Responda as seguintes questões:
//
//    1. Foi possível criar instâncias da classe Funcionario? Justifique
//    sua resposta.
//   2. Onde você deve inserir estas regras de negócio? Na classe
//   xxController ou nas classes Gerente e Desenvolvedor? Justifique sua resposta

//1. Não é possivel alterar a class Funcionario pois ela é abstract
//2. Em Gerente/Desenvolvedor, pois lá fica a implementação.
//No controller apenas manipulação.
