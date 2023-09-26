package model;

public interface Associado {

    int getQuantidadeDeCotas();
    void setQuantidadeDeCotas(int quantidadeDeCotas);
    double getValorCota();
    void setValorCota(double valorCota);
    double getLucros();
    void setLucros(double lucros);
    abstract double lucros(int quantidadeDeCotas, double valorCota);
}
