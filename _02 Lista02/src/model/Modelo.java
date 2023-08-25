package model;
import controller.ModeloController;

import java.util.Objects;

public class Modelo {
    private long id;
    private String descricao;

    public Modelo(long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Modelo() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Modelo modelo = (Modelo) o;

        return id == modelo.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "\nModelo{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
