package controller;
import model.CarrinhoDeCompras;

import java.util.*;

public class CarrinhoDeComprasController {
    public static void main(String[] args) {
        CarrinhoDeCompras p1 = new CarrinhoDeCompras("arroz",3);
        CarrinhoDeCompras p2 = new CarrinhoDeCompras("feijão",2);
        CarrinhoDeCompras p3 = new CarrinhoDeCompras("farinha",1);
        CarrinhoDeCompras p4 = new CarrinhoDeCompras("lentilha",1);
        CarrinhoDeCompras p5 = new CarrinhoDeCompras("açucar",4);

        //*LIST*

        //Adicionar
        List<CarrinhoDeCompras> carrinhoDeComprasList = new ArrayList<>();
        carrinhoDeComprasList.add(p1);
        carrinhoDeComprasList.add(p2);
        carrinhoDeComprasList.add(p2);
        carrinhoDeComprasList.add(p3);
        carrinhoDeComprasList.add(p4);
        carrinhoDeComprasList.add(p5);

        //Remover
        List<CarrinhoDeCompras> removerItens = new ArrayList<>();
        for(CarrinhoDeCompras i : carrinhoDeComprasList) {
            if(i.getNome() == "arroz") {
                removerItens.add(i);
            }
        }
        carrinhoDeComprasList.removeAll(removerItens);
        System.out.println(carrinhoDeComprasList);
        System.out.println("\n");

        //Verificar tamanho
        System.out.println(carrinhoDeComprasList.size());


        //Pesquisar
        for(CarrinhoDeCompras i : carrinhoDeComprasList) {
            if(carrinhoDeComprasList.isEmpty()) {
                System.out.println("A lista está vazia");
            } else {
                if("feijão".equalsIgnoreCase(i.getNome())) { //ignora maiuscula e minuscula
                    System.out.println(i);
                }
            }
        }
        System.out.println("\n");

        //Ordenação
        carrinhoDeComprasList.sort(Comparator.comparing(CarrinhoDeCompras::getNome));
        System.out.println(carrinhoDeComprasList);
        System.out.println("\n");

        //*SET* (ignora itens repetidos)

        //Adicionar
        Set<CarrinhoDeCompras> carrinhoDeComprasSet = new HashSet<>();
        carrinhoDeComprasSet.add(p1);
        carrinhoDeComprasSet.add(p2);
        carrinhoDeComprasSet.add(p3);
        carrinhoDeComprasSet.add(p4);
        carrinhoDeComprasSet.add(p5);

        System.out.println(carrinhoDeComprasSet);
        System.out.println("\n");

        //Remover
        CarrinhoDeCompras itemRemover = new CarrinhoDeCompras();
        for(CarrinhoDeCompras i : carrinhoDeComprasSet) {
            if("feijão".equalsIgnoreCase(i.getNome())) {
                itemRemover = i;
                break;
            }
        }
        carrinhoDeComprasSet.remove(itemRemover);
        System.out.println(carrinhoDeComprasSet);
        System.out.println("\n");

        //Verificar tamanho
        System.out.println(carrinhoDeComprasSet.size());
        System.out.println("\n");

        //Atualizar Quantidade
        for(CarrinhoDeCompras i : carrinhoDeComprasSet) {
            if(i.getNome().equalsIgnoreCase("arroz")) {
                i.setQuantidade(10);
            }
        }
        System.out.println(carrinhoDeComprasSet);
        System.out.println("\n");

        //Ordenação - hashSet não aceita ordenação
        Set<CarrinhoDeCompras> carrinhoDeComprasSet1 = new TreeSet<>();
        carrinhoDeComprasSet1.addAll(carrinhoDeComprasSet);
        System.out.println(carrinhoDeComprasSet1);
        /*a implementação da ordenação se deu dentro da propria classe
        onde estamos implementando o metodo comparable que já ordena
        automaticamente*
         */

        //*MAP* - trabalha com chave e valor

        //passa o tipo de uma chave principal, e o tipo que queremos
        //String = produto1, produto2, etc
        Map<String, CarrinhoDeCompras> carrinhoDeComprasMap = new HashMap<>();
        carrinhoDeComprasMap.put("produto1", p1);
        carrinhoDeComprasMap.put("produto2", p2);
        carrinhoDeComprasMap.put("produto3", p3);
        carrinhoDeComprasMap.put("produto4", p4);
        carrinhoDeComprasMap.put("produto5", p5);

        //faz todas as atividades pela chave
        carrinhoDeComprasMap.remove("produto1");
        //acessa diretamente a chave na memoria não necessitando do laço foreach
        System.out.println(carrinhoDeComprasMap.get("produto2"));
        System.out.println(carrinhoDeComprasMap.size());
        System.out.println(carrinhoDeComprasMap);
        System.out.println(carrinhoDeComprasMap.keySet()); //retorna todas as chaves
        //hashmap não póssui ordenação




    }

}
