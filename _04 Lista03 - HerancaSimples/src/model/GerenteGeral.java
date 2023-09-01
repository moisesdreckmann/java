package model;
import model.Gerente;
public class GerenteGeral extends Gerente {
    public GerenteGeral(String nome, double salario) {
        super(nome, salario);
    }
    public GerenteGeral() {
    }

    public double getBonus() {
        return this.salario * 0.4;
    }

    @Override
    public String toString() {
        return "\nGerenteGeral{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
