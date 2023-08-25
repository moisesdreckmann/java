package model;
import controller.ContaController;

import java.util.Objects;

public class Conta {
    private long id;
    private double saldo;

    public Conta(long id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public Conta() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setDeposita(double valor) {this.saldo += valor;}
    public void setSacar(double valor) {
        if(this.saldo > 0 && this.saldo > valor) {
            this.saldo -= valor;
        } else {
            System.out.println("você não possui saldo suficiente");
        }
    }
    public void setAtualiza(double taxa) {this.saldo -=taxa;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Conta conta = (Conta) o;

        return id == conta.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "\nConta{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
