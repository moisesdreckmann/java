package model;
import model.Funcionario;
import controller.FuncionarioController1;
import controller.FuncionarioController2;
public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    public Desenvolvedor() {
    }

    public double getBonus() {
        return this.salario * 0.05;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
