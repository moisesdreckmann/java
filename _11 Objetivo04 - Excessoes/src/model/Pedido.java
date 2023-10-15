package model;

import exceptions.EstoqueInsuficienteException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Long numero;
    private LocalDate data;
    private double valor;
    private Tipo tipo;
    private Vendedor vendedor;
    private List<Item> items = new ArrayList<>();

    public Pedido(Long numero, LocalDate data, double valor, Tipo tipo, Vendedor vendedor, List<Item> items) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
        this.vendedor = vendedor;
        this.items = items;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public boolean manterPedido(Long numero) {
        return this.numero == numero ? true : false;
    }

    public boolean removerItem(Item codItem, List<Item> itens) {
       itens.remove(codItem);
       return true;
    }

    public void verificarEstoque(List<Item> items) throws EstoqueInsuficienteException {
        try {
            for (Item item : items) {
                Produto produto = item.getProduto();
                if(produto.getQuantidade() == 0) {
                    throw new EstoqueInsuficienteException("Estoque Insuficiente");
                } else {
                    this.tipo = tipo.atendido;
                }
            }
        } catch (EstoqueInsuficienteException e) {
                System.err.println("Erro: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" + valor +
                ", tipo=" + tipo +
                ", vendedor=" + vendedor +
                ", items=" + items +
                '}';
    }
}
