package model;

public class Telefone {
    private boolean ligar;
    private boolean desligar;
    private boolean atender;
    private boolean recusar;

    public Telefone(boolean ligar, boolean desligar, boolean atender, boolean recusar) {
        this.ligar = ligar;
        this.desligar = desligar;
        this.atender = atender;
        this.recusar = recusar;
    }

    public Telefone() {
    }

    public boolean isLigar() {
        return ligar;
    }

    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }

    public boolean isDesligar() {
        return desligar;
    }

    public void setDesligar(boolean desligar) {
        if(this.ligar = true) {
            this.desligar = desligar;
            this.ligar = false;
        }
     }

    public boolean isAtender() {
        return atender;
    }

    public void setAtender(boolean atender) {
        this.atender = atender;
    }

    public boolean isRecusar() {
        return recusar;
    }

    public void setRecusar(boolean recusar) {
        this.recusar = recusar;
    }

    @Override
    public String toString() {
        return "\nTelefone{" +
                "ligar=" + ligar +
                ", desligar=" + desligar +
                ", atender=" + atender +
                ", recusar=" + recusar +
                '}';
    }
}
