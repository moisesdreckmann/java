package model;
import model.Gerente;

public class GerenteDesenvolvimento extends Gerente{
    public GerenteDesenvolvimento(String nome, double salario) {
        super(nome, salario);
    }

    public GerenteDesenvolvimento() {
    }

    @Override
    public String toString() {
        return "\nGerenteDesenvolvimento{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}

