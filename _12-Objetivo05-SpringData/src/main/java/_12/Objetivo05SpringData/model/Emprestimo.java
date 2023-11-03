package _12.Objetivo05SpringData.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import _12.Objetivo05SpringData.model.Alunos;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@ToString


@Table(name = "emprestimos")
@Entity
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmprestimo;
    @Column(length = 8, nullable = false)
    private LocalDate dataEmprestimo;
    @Column(length = 8, nullable = false)
    private LocalDate dataDevolucao;
    @OneToOne
    private Alunos aluno;
    @OneToOne
    private Exemplares exemplar;

    public void realizarEmprestimo() {

    }

    public void realizarDevolucao() {

    }
    public Emprestimo() {

    }
}

