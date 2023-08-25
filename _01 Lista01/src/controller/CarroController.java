package controller;

import model.Carro;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class CarroController {
    public static void main(String[] args) {
        Carro c1 = new Carro(1L,"Gol","Branco",2020);
        System.out.println(c1 + "\n");

        Carro c2 = new Carro();
        c2.setId(2L);
        c2.setMarca("Gol");
        c2.setModelo("Preto");
        c2.setAnoFabricacao(2022);
        System.out.println("Marca:" + c2.getMarca());
        System.out.println("Modelo:" + c2.getModelo());
        System.out.println("Fabricação:" + c2.getAnoFabricacao() + "\n");


        Carro c3 = new Carro(3L,"Gol","Branco",2020);
        Carro c4 = new Carro(3L, "Gol","Branco",2020);
        Carro c5 = new Carro(4L,"Fiat","Preto",2021);
        Carro c6 = new Carro(5L,"Ford","Cinza",2022);
        Carro c7 = new Carro(6L,"Gol","Azul",2023);

        System.out.println(c4.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.equals(c3) + "\n");

        List<Carro> carros = new ArrayList<>();
        carros.add(c3);
        carros.add(c4);
        carros.add(c5);
        carros.add(c6);
        carros.add(c7);
        System.out.println("Coleção do tipo Lista: " + carros + "\n");

        carros.sort(Comparator.comparing(Carro::getId).reversed());
        System.out.println(carros + "\n");

        System.out.println("Carros Localizadas: ");
        carros.forEach(c -> {
            if (c.getId() == 3) {
                System.out.println(c);
            }
        });
        System.out.println("\n");

        Map<Long, Carro> carrosMap = new HashMap<>();
        carrosMap.put(c1.getId(),c1);
        carrosMap.put(c2.getId(),c2);
        carrosMap.put(c5.getId(),c5);
        carrosMap.put(c6.getId(),c6);
        carrosMap.put(c7.getId(),c7);
        System.out.println("Coleção do tipo Map\n" + carrosMap);
    }
}
