package model;

public class Cliente implements Associado{

    private String nome;
    private int quantidadeDeCotas;
    private double valorCota;
    private double lucros;


    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        return "\nCliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
