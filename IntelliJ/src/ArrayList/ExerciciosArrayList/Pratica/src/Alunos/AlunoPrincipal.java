package Alunos;

//Exercício 4 – Lista de Alunos
//Crie uma classe Aluno com os atributos nome e nota
//Adicione alunos, calcule a média das notas e imprima os aprovados (nota ≥ 7).

import java.util.ArrayList;

public class AlunoPrincipal {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Isabel", 8.5));
        alunos.add(new Aluno("Jeremiah", 4.3));
        alunos.add(new Aluno("Conrad", 10.0));
        alunos.add(new Aluno("Taylor", 7.1));
        alunos.add(new Aluno("Steve", 3.2));

        System.out.println("Alunos: " + alunos);

        double soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.getNota();
        }

        double media = soma / alunos.size();
        System.out.println("Média da turma: " + media);

        System.out.println("Alunos aprovados:");
        for (Aluno aluno : alunos) {
            if (aluno.isAprovado()) {
                System.out.println(aluno.getNome() + " - Nota: " + aluno.getNota());
            }
        }
    }
}
