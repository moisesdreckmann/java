package controller;

import model.Modelo;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class ModeloController {
    public static void main(String[] args) {
        Modelo m1 = new Modelo(1L,"descrição 1");
        System.out.println(m1 + "\n");


        Modelo m2 = new Modelo();
        m2.setId(2L);
        m2.setDescricao("descrição 2");
        System.out.println("descrição: " + m2.getDescricao() + "\n");


        Modelo m3 = new Modelo(3L,"descricao3");
        Modelo m4 = new Modelo(3L,"descricao4");
        Modelo m5 = new Modelo(4L,"descricao5");
        Modelo m6 = new Modelo(5L,"descricao6");
        Modelo m7 = new Modelo(6L,"descricao7");

        System.out.println(m3.hashCode());
        System.out.println(m4.hashCode());
        System.out.println(m3.equals(m4) + "\n");

        List<Modelo> modelos = new ArrayList<>();
        modelos.add(m3);
        modelos.add(m4);
        modelos.add(m5);
        modelos.add(m6);
        modelos.add(m7);
        System.out.println("Lista: " + modelos + "\n");

        modelos.sort(Comparator.comparing(Modelo::getId).reversed());
        System.out.println("Ordem Reversa: " + modelos + "\n");

        System.out.println("Modelos localizados: ");
        modelos.forEach(m -> {
            if (m.getId() == 3) {
                System.out.println(m);
            }
        });
        System.out.println("\n");

        Map<Long, Modelo> modelosMap = new HashMap<>();
        modelosMap.put(m1.getId(),m1);
        modelosMap.put(m2.getId(),m2);
        modelosMap.put(m5.getId(),m5);
        modelosMap.put(m6.getId(),m6);
        modelosMap.put(m7.getId(),m7);
        System.out.println("Coleção do tipo Map\n" + modelosMap);


    }
}