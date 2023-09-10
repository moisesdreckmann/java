package orgMoises._PadraoDeProjeto.model;

import jakarta.persistence.*;
import orgMoises._PadraoDeProjeto.model.Endereco;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String nome;
    @ManyToOne
    private Endereco endereço;

    public Cliente(Long id, String nome, Endereco endereço) {
        this.id = id;
        this.nome = nome;
        this.endereço = endereço;
    }

    public Cliente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereco endereço) {
        this.endereço = endereço;
    }

    @Override
    public String toString() {
        return "\nCliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereço=" + endereço +
                '}';
    }
}
