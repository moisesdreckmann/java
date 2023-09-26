package model;

public abstract class Conta {
    protected double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public Conta() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double saldo) {
        this.saldo += saldo;
    }

    public void sacar(double saldo) {
        this.saldo -= saldo;
    }

    public void atualizar(double taxa) {
        this.saldo -= (saldo* taxa);
    }

    @Override
    public String toString() {
        return "\nConta{" +
                "saldo=" + saldo +
                '}';
    }
}
