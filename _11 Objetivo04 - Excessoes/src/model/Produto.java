package model;

import exceptions.EstoqueInsuficienteException;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private double preco;
    private List<Item> itens = new ArrayList<>();
    private List<Fornecedor> fornecedores = new ArrayList<>();

    public Produto(int codigo, String nome, int quantidade, double preco, List<Item> itens, List<Fornecedor> fornecedores) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.itens = itens;
        this.fornecedores = fornecedores;
    }

    public Produto(int codigo, String nome, int quantidade, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }

    public boolean manterProduto(int codigo) {
        return this.codigo == codigo ? true : false;
    }

    public void atualizarEstoque(List<Item> itens) {
        for(Item item : itens) {
            this.quantidade -= item.getQuantidade();
        }
    }

    public void entradaDeEstoque(List<Fornecedor> fornecedores) {
        for (Fornecedor fornecedor : fornecedores) {
            List<Produto> produtos = fornecedor.getProdutos();
            for (Produto produto : produtos) {
                if (this.getCodigo() == produto.getCodigo()) {
                    this.quantidade += produto.getQuantidade();
                }
            }
        }
    }



    @Override
    public String toString() {
        return "\nProduto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
