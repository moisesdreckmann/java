package model;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private int codItem;
    private double desconto;
    private int quantidade;
    private List<Pedido> pedidos = new ArrayList<>();
    private Produto produto;

    private double preco;

    public Item(int codItem, double desconto, int quantidade, List<Pedido> pedidos, Produto produto, double preco) {
        this.codItem = codItem;
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.pedidos = pedidos;
        this.produto = produto;
        this.preco = preco;
    }

    public Item(int codItem, double desconto, int quantidade, Produto produto, double preco) {
        this.codItem = codItem;
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.produto = produto;
        this.preco = preco;
    }

    public int getCodItem() {
        return codItem;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\nItem{" +
                "codItem=" + codItem +
                ", desconto=" + desconto +
                ", quantidade=" + quantidade +
                ", produto=" + produto +
                '}';
    }
}
