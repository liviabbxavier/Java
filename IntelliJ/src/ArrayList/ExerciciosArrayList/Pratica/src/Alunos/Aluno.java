package Alunos;

public class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public boolean isAprovado() {
        return nota >= 7.0;
    }

    @Override
    public String toString() {
        return "Nome do aluno: " + getNome() + " Nota: " + getNota();
    }

}
