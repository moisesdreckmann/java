package model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private Long codigo;
    private String disciplina;
    private List<Aluno> alunos = new ArrayList<>();

    public Disciplina(Long codigo, String disciplina, List<Aluno> alunos) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.alunos = alunos;
    }

    public Disciplina(Long codigo, String disciplina) {
        this.codigo = codigo;
        this.disciplina = disciplina;
    }

    public Disciplina() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "\nDisciplina{" +
                "codigo=" + codigo +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}
