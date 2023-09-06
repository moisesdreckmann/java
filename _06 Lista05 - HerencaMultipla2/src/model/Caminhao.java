package model;

public class Caminhao extends Veiculo implements Automovel{
    protected int capacidadeDeCarga;
    protected String renavam;
    protected String chassi;
    protected String placa;

    public Caminhao(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadeDeCarga, String renavam, String chassi, String placa) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadeDeCarga = capacidadeDeCarga;
        this.renavam = renavam;
        this.chassi = chassi;
        this.placa = placa;
    }

    public Caminhao() {
    }

    public int getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(int capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public String getRenavam() {
        return this.renavam;
    }

    @Override
    public void setRenavam(String valor) {
        this.renavam = valor;
    }

    @Override
    public String getChassi() {
        return this.chassi;
    }

    @Override
    public void setChassi(String valor) {
        this.chassi = valor;
    }

    @Override
    public String getPlaca() {
        return this.placa;
    }

    @Override
    public void setPlaca(String valor) {
        this.placa = valor;
    }

    @Override
    public String toString() {
        return "\nCaminhao{" +
                "capacidadeDeCarga=" + capacidadeDeCarga +
                ", renavam='" + renavam + '\'' +
                ", chassi='" + chassi + '\'' +
                ", placa='" + placa + '\'' +
                ", numeroDeEixos=" + numeroDeEixos +
                ", propulsao='" + propulsao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
