package model;
import model.Funcionario;
public class Gerente extends Funcionario implements Investidor {

    protected String ticker;
    protected int quantidade;

    public Gerente(String nome, double salario, String ticker, int quantidade) {
        super(nome, salario);
        this.ticker = ticker;
        this.quantidade = quantidade;
    }

    public Gerente() {
    }

    public double getBonus() {
        return this.getSalario() * 0.1;
    }

    @Override
    public String getTicker() {
        return this.ticker;
    }

    @Override
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public int getQuantidade() {
        return this.quantidade;
    }

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\nGerente{" +
                "ticker='" + ticker + '\'' +
                ", quantidade=" + quantidade +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
