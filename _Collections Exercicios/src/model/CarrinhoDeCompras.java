package model;

import java.util.List;

public class CarrinhoDeCompras implements Comparable<CarrinhoDeCompras> {

    private String nome;
    private int quantidade;

    public CarrinhoDeCompras(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public CarrinhoDeCompras() {

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\nCarrinhoDeCompras{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override //implementação de ordenação set
    public int compareTo(CarrinhoDeCompras obj) {
        return this.nome.compareToIgnoreCase(obj.nome);
    }
}
