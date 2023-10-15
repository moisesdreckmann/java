package controller;

import model.Fornecedor;
import model.Fornecimento;
import model.Produto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FornecimentoController {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "arroz", 50, 5.50);
        Produto p2 = new Produto(2, "feijao", 250, 7.50);
        Produto p3 = new Produto(3, "farinha", 30, 4.00);

        Fornecedor f1 = new Fornecedor(123,"111", "f1");
        f1.getProdutos().add(p1);
        f1.getProdutos().add(p2);
        Fornecedor f2 = new Fornecedor(321,"222", "f2");
        f2.getProdutos().add(p3);

        LocalDate data1 = LocalDate.of(2023,1,1);
        LocalDate data2 = LocalDate.of(2023,2,2);
        double valorTotal1 = (p1.getQuantidade() * p1.getPreco()) + (p2.getQuantidade() * p2.getPreco());
        double valorTotal2 = (p3.getQuantidade()* p3.getPreco());

        Fornecimento fo1 = new Fornecimento(data1, valorTotal1, List.of(f1));
        Fornecimento fo2 = new Fornecimento(data2, valorTotal2, List.of(f2));

        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(fo1);
        fornecimentos.add(fo2);
        System.out.println(fornecimentos);
    }
}
