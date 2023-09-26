package model;

public class Passaro extends Animal{

    private double z;

    public Passaro(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Passaro() {

    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void mover(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void desenhar() {
        System.out.println("desenhando um passaro");
    }

    @Override
    public String toString() {
        return "\nPassaro{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
