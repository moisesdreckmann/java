package orgMoises._springData.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_user") //resolve problema no bd para cadastro da coluna user
//o nome user(classe e nume da tabela) da atrito no postgresql
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;
    @Column(name = "user_name", length = 50, nullable = false)
    private String name;

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "id=" + id +
                ", nome='" + name + '\'' +
                '}';
    }
}
