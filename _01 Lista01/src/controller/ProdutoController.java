package controller;

import model.Produto;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class ProdutoController {
    public static void main(String[] args) {
        Produto p1 = new Produto(1L,"Arroz", "Tipo1", 3.5, 240);
        System.out.println(p1 + "\n");

        Produto p2 = new Produto();
        p2.setId(2L);
        p2.setNome("Arroz");
        p2.setDescricao("Tipo1");
        p2.setValor(3.5);
        p2.setEstoque(240);

        System.out.println("Nome:" + p2.getNome());
        System.out.println("Descrição:" + p2.getDescricao());
        System.out.println("Valor:" + p2.getValor());
        System.out.println("Estoque:" + p2.getEstoque() + "\n");

        Produto p3 = new Produto(3L,"Arroz", "Tipo1", 3.5, 240);
        Produto p4 = new Produto(3L, "Arroz", "Tipo1", 3.5, 240);
        Produto p5 = new Produto(4L, "Feijão", "Tipo2", 7.5, 500);
        Produto p6 = new Produto(5L, "Açucar", "Refinado", 2.8, 600);
        Produto p7 = new Produto(6L, "Lentilha", "Lentilha", 6.9, 130);

        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());
        System.out.println(p3.equals(p4) + "\n");

        List<Produto> produtos = new ArrayList<>();
        produtos.add(p3);
        produtos.add(p4);
        produtos.add(p5);
        produtos.add(p6);
        produtos.add(p7);
        System.out.println("Coleção do tipo Lista: " + produtos + "\n");

        produtos.sort(Comparator.comparing(Produto::getId).reversed());
        System.out.println(produtos + "\n");

        System.out.println("Produtos Localizadas: ");
        produtos.forEach(p -> {
            if (p.getId() == 3) {
                System.out.println(p);
            }
        });
        System.out.println("\n");

        Map<Long, Produto> produtosMap = new HashMap<>();
        produtosMap.put(p1.getId(),p1);
        produtosMap.put(p2.getId(),p2);
        produtosMap.put(p5.getId(),p5);
        produtosMap.put(p6.getId(),p6);
        produtosMap.put(p7.getId(),p7);
        System.out.println("\nColeção do tipo Map\n" + produtosMap);
    }
}
