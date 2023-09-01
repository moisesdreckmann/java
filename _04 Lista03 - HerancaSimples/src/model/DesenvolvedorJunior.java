package model;
import model.Desenvolvedor;
public class DesenvolvedorJunior extends Desenvolvedor{
    public DesenvolvedorJunior(String nome, double salario) {
        super(nome, salario);
    }

    public DesenvolvedorJunior() {
    }

    @Override
    public String toString() {
        return "\nDesenvolvedorJunior{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
