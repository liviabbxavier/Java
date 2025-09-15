package Filmes;

public class Filme {
    private String titulo;
    private String genero;
    private double avaliacao;

    public Filme(String titulo, String genero, double avaliacao) {
        this.titulo = titulo;
        this.genero = genero;
        this.avaliacao = avaliacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    @Override
    public String toString() {
        return "Filme {" +
                " Titulo: '" + titulo + '\'' +
                ", gênero: '" + genero + '\'' +
                ", avaliação: " + avaliacao +
                "'}";
    }
}
