package Atletas;

public class Atleta {
    private String nome;
    private String modalidade;
    private double pontuacao;

    public Atleta(String nome, String modalidade, double pontuacao) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public String getModalidade() {
        return modalidade;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                " Nome: '" + nome + '\'' +
                ", modalidade: '" + modalidade + '\'' +
                ", pontuaçâo: " + pontuacao +
                "}";
    }
}
