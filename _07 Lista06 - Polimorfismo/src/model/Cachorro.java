package model;

public class Cachorro extends Animal{

    public Cachorro(double x, double y) {
        super(x, y);
    }

    public Cachorro() {
    }

    @Override
    public void desenhar() {
        System.out.println("desenhando um cachorro");
    }

    @Override
    public String toString() {
        return "\nCachorro{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
