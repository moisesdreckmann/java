package orgMoises._PadraoDeProjeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Endereco {
    @Id
    private String cep;
    private String bairro;
    private String uf;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUF() {
        return uf;
    }

    public void setUF(String UF) {
        this.uf = UF;
    }

    @Override
    public String toString() {
        return "\nEndereco{" +
                "cep='" + cep + '\'' +
                ", bairro='" + bairro + '\'' +
                ", UF='" + uf + '\'' +
                '}';
    }
}
