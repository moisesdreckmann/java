package model;

public class ContaPoupança extends Conta{
    public ContaPoupança(double saldo) {
        super(saldo);
    }

    public ContaPoupança() {
    }

    @Override
    public String toString() {
        return "\nContaPoupança{" +
                "saldo=" + saldo +
                '}';
    }
}
