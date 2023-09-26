package model;

public class ContaCorrente extends Conta implements Associado{

    private int quantidadeDeCotas;
    private double valorCota;
    private double lucros;

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public ContaCorrente() {
    }
    @Override
    public int getQuantidadeDeCotas() {
        return quantidadeDeCotas;
    }

    @Override
    public void setQuantidadeDeCotas(int quantidadeDeCotas) {
        this.quantidadeDeCotas = quantidadeDeCotas;
    }

    @Override
    public double getValorCota() {
        return valorCota;
    }

    @Override
    public void setValorCota(double valorCota) {
        this.valorCota = valorCota;
    }

    @Override
    public double getLucros() {
        return lucros;
    }

    @Override
    public void setLucros(double lucros) {
        this.lucros = lucros;
    }

    @Override
    public double lucros(int quantidadeDeCotas, double valorCota) {
        this.quantidadeDeCotas = quantidadeDeCotas;
        this.valorCota = valorCota;
        this.lucros = quantidadeDeCotas * valorCota;
        return lucros;
    }

    @Override
    public String toString() {
        return "\nContaCorrente{" +
                "saldo=" + saldo +
                '}';
    }
}
