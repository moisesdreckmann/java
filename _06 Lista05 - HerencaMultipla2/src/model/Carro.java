package model;

public class Carro extends Veiculo implements Automovel {

    protected int capacidadePortaMalas;
    protected String renavam;
    protected String chassi;
    protected String placa;

    public Carro(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadePortaMalas, String renavam, String chassi, String placa) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadePortaMalas = capacidadePortaMalas;
        this.renavam = renavam;
        this.chassi = chassi;
        this.placa = placa;
    }

    public Carro() {
    }

    public int getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public void setCapacidadePortaMalas(int capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
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
        return "\nCarro{" +
                "capacidadePortaMalas=" + capacidadePortaMalas +
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
