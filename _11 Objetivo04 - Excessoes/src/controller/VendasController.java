package controller;

import exceptions.EstoqueInsuficienteException;
import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Produto;

public class VendasController {
    public static void main(String[] args) throws EstoqueInsuficienteException {

        Produto p1 = new Produto(1, "arroz", 50, 5.50);
        Produto p2 = new Produto(2, "feijao", 300, 7.50);
        Produto p3 = new Produto(2, "feijao", 40, 7.50);
        Produto p4 = new Produto(1, "arroz", 50, 5.50);

        Item i1 = new Item(1, 0.0, 5, p1, p1.getPreco()*5);
        Item i2 = new Item(2, 0.0, 2, p2, p2.getPreco()*2);
        Item i3 = new Item(4, 0.0, 10, p2, p2.getPreco()*10);

        Vendedor v1 = new Vendedor();
        v1.setNome("marcos");
        v1.setLocal("loja1");

        LocalDate data1 = LocalDate.of(2023,10,15);
        LocalDate data2 = LocalDate.of(2023,10,25);
        double valor1 = calcularValorTotal(List.of(i1,i2));
        double valor2 = calcularValorTotal(List.of(i3));
        Pedido pedido1 = new Pedido(1L, data1, valor1, Tipo.atendido, v1, List.of(i1,i2));
        Pedido pedido2 = new Pedido(2L, data2, valor2, Tipo.pendente, v1, List.of(i3));

        List<Pedido> pedidoList = new ArrayList<>();
        pedidoList.add(pedido1);
        pedidoList.add(pedido2);
        imprimirPedido(pedidoList);

        p1.atualizarEstoque(List.of(i1));
        p2.atualizarEstoque(List.of(i2,i3));
        System.out.println("Estoque de "+p1.getNome()+": "+p1.getQuantidade());
        System.out.println("Estoque de "+p2.getNome()+": "+p2.getQuantidade());
        System.out.println("\n");

        Fornecedor fornecedor = new Fornecedor(123, "111222333", "fornecedor1", List.of(p4,p3));
        p1.entradaDeEstoque(List.of(fornecedor));
        p2.entradaDeEstoque(List.of(fornecedor));

        LocalDate dataFornecimento1 = LocalDate.of(2023, 2,2);
        double valorTotal = valorTotalFornecimento(fornecedor);
        Fornecimento fornecimento = new Fornecimento(dataFornecimento1, valorTotal, List.of(fornecedor));

        List<Fornecimento> fornecimentoList = new ArrayList<>();
        fornecimentoList.add(fornecimento);
        System.out.println(fornecimentoList);
        valorCadaRecebimento(fornecedor);
        System.out.println("\n");

        //pedido3 para praticar exceptions
        p2.setQuantidade(0);
        Item i4 = new Item(4, 0.0, 10, p2, p2.getPreco()*10);
        Pedido pedido3 = new Pedido(3L, data2, valor2, Tipo.pendente, v1, List.of(i4));
        pedido3.verificarEstoque(List.of(i4));

    }

    private static double calcularValorTotal(List<Item> items) {
        double valorTotal = 0;
        for(Item item : items) {
            valorTotal+=item.getPreco();
        }
        return valorTotal;
    }

    private static void imprimirPedido(List<Pedido> pedidoList) {
        for(Pedido pedido : pedidoList) {
            System.out.println("pedido: "+pedido.getNumero());
            System.out.println(pedido.getItems());
            for(Item item : pedido.getItems()) {
                System.out.println("valor do item "+item.getCodItem() +": " + item.getPreco());
            }
            System.out.println(pedido);
            System.out.println("valor total do pedido: "+pedido.getValor());
            System.out.println("\n");
        }
    }

    private static double valorTotalFornecimento(Fornecedor fornecedor) {
        List<Produto> produtos = fornecedor.getProdutos();
        double valorTotal = 0;
        for(Produto produto : produtos) {
            valorTotal += produto.getQuantidade() * produto.getPreco();
        }
        return valorTotal;
    }

    private static void valorCadaRecebimento(Fornecedor fornecedor) {
        List<Produto> produtos = fornecedor.getProdutos();
        double valorTotal = 0;
        for(Produto produto : produtos) {
            System.out.println("valor " + produto.getNome() + ": R$ " + produto.getPreco() * produto.getQuantidade());
        }
    }
}

