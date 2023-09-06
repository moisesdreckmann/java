package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VeiculoController {
    public static void main(String[] args) {
        Bicicleta bike1 = new Bicicleta(200, "sim", "bike","bike", 1992,200,"ASODK4");
        Carro carro1 = new Carro(4,"sim","fiat", "gol", 2004,3, "renavam", "ASOIJDAS4", "SAO-294");
        Caminhao caminhao1 = new Caminhao(6, "sim","caminhao","caminhao", 2022, 4000,"renavam", "ASODK4", "455S-KKW");

        System.out.println(bike1);
        System.out.println(carro1);
        System.out.println(caminhao1);

        Bicicleta bike2 = new Bicicleta(200, "sim", "bike","bike", 1992,200,"ASODK4");
        Bicicleta bike3 = new Bicicleta(300, "sim", "bike","bike", 1998,200,"AS44K4");
        Bicicleta bike4 = new Bicicleta(400, "sim", "bike","bike", 1999,200,"ATTDK4");
        Bicicleta bike5 = new Bicicleta(100, "sim", "bike","bike", 2023,200,"ASOIK4");
        Carro carro2 = new Carro(4,"sim","fiat", "gol", 2004,3, "renavam", "ASOIJDAS4", "IAO-294");
        Carro carro3 = new Carro(4,"sim","ford", "ford", 2012,4, "renavam", "ASOIJDAS4", "SAO-294");
        Carro carro4 = new Carro(4,"sim","ferrari", "ferrari", 2023,5, "renavam", "ASOIJDAS4", "SAO-294");
        Carro carro5 = new Carro(4,"sim","fiat", "fiat", 2022,6, "renavam", "ASOIJDAS4", "IAO-294");
        Caminhao caminhao2 = new Caminhao(6, "sim","caminhao","caminhao", 2008, 4000,"renavam", "ASODK4", "455S-KKW");
        Caminhao caminhao3 = new Caminhao(6, "sim","caminhao","caminhao", 2009, 4000,"renavam", "ASODK4", "455S-KKW");
        Caminhao caminhao4 = new Caminhao(6, "sim","caminhao","caminhao", 2000, 4000,"renavam", "ASODK4", "455S-KKW");
        Caminhao caminhao5 = new Caminhao(6, "sim","caminhao","caminhao", 2022, 4000,"renavam", "ASODK4", "455S-KKW");

        List<Veiculo> veiculoList = new ArrayList<>();
        veiculoList.add(bike1);
        veiculoList.add(bike2);
        veiculoList.add(bike3);
        veiculoList.add(bike4);
        veiculoList.add(bike5);
        veiculoList.add(carro1);
        veiculoList.add(carro2);
        veiculoList.add(carro3);
        veiculoList.add(carro4);
        veiculoList.add(carro5);
        veiculoList.add(caminhao1);
        veiculoList.add(caminhao2);
        veiculoList.add(caminhao3);
        veiculoList.add(caminhao4);
        veiculoList.add(caminhao5);

        veiculoList.sort(Comparator.comparing(Veiculo::getAnoFabricacao).reversed());
        System.out.println(veiculoList);
        System.out.println("\n\n");

        List<Veiculo> automoveisList = new ArrayList<>();
        List<Veiculo> bicicletasList = new ArrayList<>();

        for(Veiculo i : veiculoList) {
            if (i instanceof Automovel) {
                automoveisList.add(i);
            } else {
                bicicletasList.add(i);
            }
        }
        automoveisList.sort(Comparator.comparing(Veiculo::getAnoFabricacao));
        System.out.println(automoveisList);
        System.out.println("\n\n");

        bicicletasList.sort(Comparator.comparing(Veiculo::getAnoFabricacao));
        System.out.println(bicicletasList);
        System.out.println("\n\n");

        for(Veiculo i : veiculoList) {
            if(i instanceof Automovel) {
                String definirPlaca = ((Automovel) i).getPlaca().toUpperCase();
                if(definirPlaca.startsWith("I")) {
                    System.out.println(i);
                }
            }
        }

    }
}
