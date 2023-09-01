package model;
import model.Desenvolvedor;
public class DesenvolvedorPleno extends Desenvolvedor{
    public DesenvolvedorPleno(String nome, double salario) {
        super(nome, salario);
    }

    public DesenvolvedorPleno() {
    }

    @Override
    public String toString() {
        return "\nDesenvolvedorPleno{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
