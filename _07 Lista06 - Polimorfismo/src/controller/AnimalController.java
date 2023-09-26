package controller;

import model.Cachorro;
import model.Passaro;
import model.Peixe;
import model.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public static void main(String[] args) {
        Peixe p1 = new Peixe(2,2,3);
        Peixe p2 = new Peixe(3,3,4);
        Peixe p3 = new Peixe(4,4,5);
        Cachorro c1 = new Cachorro(6,6);
        Cachorro c2 = new Cachorro(7,7);
        Cachorro c3 = new Cachorro(8,8);
        Passaro ps1 = new Passaro(10,10,11);
        Passaro ps2 = new Passaro(11,11,12);
        Passaro ps3 = new Passaro(12,12,13);

        List<Animal> animaislist = new ArrayList();
        animaislist.add(p1);
        animaislist.add(p2);
        animaislist.add(p3);
        animaislist.add(c1);
        animaislist.add(c2);
        animaislist.add(c3);
        animaislist.add(ps1);
        animaislist.add(ps2);
        animaislist.add(ps3);
        System.out.println(animaislist + "\n");

        animaislist.forEach(animal -> {
           animal.mover(2,2);
        });
        System.out.println(animaislist + "\n");

        animaislist.forEach(animal -> {
            if (animal instanceof Cachorro) {
                animal.mover(8,8);
                ((Cachorro) animal).desenhar();
            } else if(animal instanceof Peixe) {
                ((Peixe)animal).mover(5,5,5);
                ((Peixe) animal).desenhar();
            } else {
                ((Passaro)animal).mover(5,5,5);
                ((Passaro) animal).desenhar();
            }
        });
        System.out.println(animaislist + "\n");



    }
}
