package controller;

import model.Aluno;
import model.Disciplina;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AlunoController {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(123L, "Moisés", "Dreckmann");
        Aluno a2 = new Aluno(345L,"Tiago", "Santos");

        Disciplina d1 = new Disciplina(1L, "programacao");
        Disciplina d2 = new Disciplina(2L, "animaçao");
        Disciplina d3 = new Disciplina(3L, "java");

        a1.setDisciplinas(List.of(d1,d2));
        a2.setDisciplinas(List.of(d1, d2, d3));

        imprimirDisciplinas(List.of(a1,a2));

        a2.setDisciplinas(Collections.emptyList());
        imprimirDisciplinas(List.of(a1,a2));
    }

    private static void imprimirDisciplinas(List<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            System.out.println("Disciplinas para o aluno " + aluno.getNome());
            List<Disciplina> disciplinas = new ArrayList<>(aluno.getDisciplinas());
            disciplinas.sort(Comparator.comparing(Disciplina::getDisciplina));
            for (Disciplina disciplina : disciplinas) {
                System.out.println(disciplina.getDisciplina());
            }
            System.out.println();
        }
    }

}
