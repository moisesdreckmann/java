package model;
import controller.AutomovelController;

import java.util.Objects;

public class Automovel {
    private long id;
    private String renavan;
    private String placa;
    private String cor;
    private int num_rodas;
    private String combustivel;
    private int quilometragem;
    private String chassi;
    private double valor_locação;

    public Automovel(long id, String renavan, String placa, String cor, int num_rodas, String combustivel, int quilometragem, String chassi, double valor_locação) {
        this.id = id;
        this.renavan = renavan;
        this.placa = placa;
        this.cor = cor;
        this.num_rodas = num_rodas;
        this.combustivel = combustivel;
        this.quilometragem = quilometragem;
        this.chassi = chassi;
        this.valor_locação = valor_locação;
    }

    public Automovel() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRenavan() {
        return renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNum_rodas() {
        return num_rodas;
    }

    public void setNum_rodas(int num_rodas) {
        this.num_rodas = num_rodas;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public double getValor_locação() {
        return valor_locação;
    }

    public void setValor_locação(double valor_locação) {
        this.valor_locação = valor_locação;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Automovel automovel = (Automovel) o;

        return id == automovel.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "\nAutomovel{" +
                "id=" + id +
                ", renavan='" + renavan + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", num_rodas=" + num_rodas +
                ", combustivel='" + combustivel + '\'' +
                ", quilometragem=" + quilometragem +
                ", chassi='" + chassi + '\'' +
                ", valor_locação=" + valor_locação +
                '}';
    }
}
