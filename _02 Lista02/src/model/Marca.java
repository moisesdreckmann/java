package model;

import java.util.Objects;

public class Marca {
    private long id;
    private String descricao;

    public Marca(long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Marca() {

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

        Marca marca = (Marca) o;

        return id == marca.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "\nMarca{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
