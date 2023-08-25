package controller;

import model.Marca;
import model.Modelo;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class MarcaController {
    public static void main(String[] args) {
        Marca m1 = new Marca(1L,"Marca1");
        System.out.println(m1 + "\n");


        Marca m2 = new Marca();
        m2.setId(2L);
        m2.setDescricao("marca2");
        System.out.println("Descricao: " + m2.getDescricao() + "\n");


        Marca m3 = new Marca(3L,"marca3");
        Marca m4 = new Marca(3L,"marca4");
        Marca m5 = new Marca(4L,"marca5");
        Marca m6 = new Marca(5L,"marca6");
        Marca m7 = new Marca(6L,"marca7");

        System.out.println(m3.hashCode());
        System.out.println(m4.hashCode());
        System.out.println(m3.equals(m4) + "\n");

        List<Marca> marcas = new ArrayList<>();
        marcas.add(m3);
        marcas.add(m4);
        marcas.add(m5);
        marcas.add(m6);
        marcas.add(m7);
        System.out.println("Lista: " + marcas + "\n");

        marcas.sort(Comparator.comparing(Marca::getId).reversed());
        System.out.println("Ordem Reversa: " + marcas + "\n");

        System.out.println("Marcas localizados: ");
        marcas.forEach(m -> {
            if (m.getId() == 3) {
                System.out.println(m);
            }
        });
        System.out.println("\n");

        Map<Long, Marca> marcasMap = new HashMap<>();
        marcasMap.put(m1.getId(),m1);
        marcasMap.put(m2.getId(),m2);
        marcasMap.put(m5.getId(),m5);
        marcasMap.put(m6.getId(),m6);
        marcasMap.put(m7.getId(),m7);
        System.out.println("Coleção do tipo Map\n" + marcasMap);

    }
}