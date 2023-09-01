package model;
import model.Funcionario;
import controller.FuncionarioController1;
import controller.FuncionarioController2;
public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public Gerente() {
    }

    public double getBonus() {
        return this.salario * 0.2;
    }

    @Override
    public String toString() {
        return "\nGerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
