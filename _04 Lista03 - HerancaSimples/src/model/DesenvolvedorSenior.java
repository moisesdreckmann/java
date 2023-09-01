package model;
import model.Desenvolvedor;
public class DesenvolvedorSenior extends Desenvolvedor {
    public DesenvolvedorSenior(String nome, double salario) {
        super(nome, salario);
    }

    public DesenvolvedorSenior() {
    }

    public double getBonus() {
        return this.salario * 0.1;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedorSenior{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
