package model;
import controller.ContaBancariaController;
public class ContaBancaria {
    private int numero;
    private String agencia;
    private String nome;
    private double saldo;

    public ContaBancaria(int numero, String agencia, String nome, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public ContaBancaria() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\nContaBancaria{" +
                "numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
