package controller;

import model.Automovel;
import model.Cliente;
import model.Modelo;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class AutomovelController {
    public static void main(String[] args) {
        Automovel a1 = new Automovel(1L,"renavan", "56DSA", "preto", 4,"sim",6000,"56dkad3",29.90);
        System.out.println(a1 + "\n");


        Automovel a2 = new Automovel();
        a2.setId(2L);
        a2.setRenavan("renavan");
        a2.setPlaca("6754sdokf");
        a2.setCor("azul");
        a2.setNum_rodas(4);
        a2.setCombustivel("sim");
        a2.setQuilometragem(4000);
        a2.setChassi("435fgsdfs2354r34");
        a2.setValor_locação(56.20);
        System.out.println("renavan: " + a2.getRenavan());
        System.out.println("placa: " + a2.getPlaca());
        System.out.println("Cor: " + a2.getCor());
        System.out.println("Rodas: " + a2.getNum_rodas());
        System.out.println("Combustivel: " + a2.getCombustivel());
        System.out.println("Quilometragem: " + a2.getQuilometragem());
        System.out.println("Chassi: " + a2.getChassi());
        System.out.println("Valor locação: " + a2.getValor_locação() + "\n");


        Automovel a3 = new Automovel(3L,"renavan", "56DSA", "preto", 4,"sim",6000,"56dkad3",29.90);
        Automovel a4 = new Automovel(3L,"renavan", "56DSA", "preto", 4,"sim",6000,"56dkad3",29.90);
        Automovel a5 = new Automovel(4L,"renavan", "6RFH5", "azul", 4,"sim",4000,"asdasg5r",29.90);
        Automovel a6 = new Automovel(5L,"renavan", "633DG", "vermelho", 4,"sim",5000,"jhgjhr",29.90);
        Automovel a7 = new Automovel(6L,"renavan", "2468G", "amarelo", 4,"sim",6000,"645yfhfd4",29.90);

        System.out.println(a3.hashCode());
        System.out.println(a4.hashCode());
        System.out.println(a3.equals(a4) + "\n");

        List<Automovel> automoveis = new ArrayList<>();
        automoveis.add(a3);
        automoveis.add(a4);
        automoveis.add(a5);
        automoveis.add(a6);
        automoveis.add(a7);
        System.out.println("Lista: " + automoveis + "\n");

        automoveis.sort(Comparator.comparing(Automovel::getId).reversed());
        System.out.println("Ordem Reversa: " + automoveis + "\n");

        System.out.println("Clientes localizados: ");
        automoveis.forEach(a -> {
            if (a.getId() == 3) {
                System.out.println(a);
            }
        });
        System.out.println("\n");

        Map<Long, Automovel> automovelMap = new HashMap<>();
        automovelMap.put(a1.getId(),a1);
        automovelMap.put(a2.getId(),a2);
        automovelMap.put(a5.getId(),a5);
        automovelMap.put(a6.getId(),a6);
        automovelMap.put(a7.getId(),a7);
        System.out.println("Coleção do tipo Map\n" + automovelMap);

    }
}
