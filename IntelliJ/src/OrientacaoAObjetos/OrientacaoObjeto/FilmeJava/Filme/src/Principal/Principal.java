package Principal;

import Calculos.CalculadoraDeTempo;
import Calculos.FiltroRecomendacao;
import Modelos.Episodio;
import Modelos.Filme;
import Modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Castelo Animado", 2005);
        meuFilme.setDuracaoEmMinutos(120);

        meuFilme.exibeFichaTecnica();
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos() + " minutos.");

        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Filme meuFilme2 = new Filme("Rei Leão 2", 1998);
        meuFilme2.setDuracaoEmMinutos(80);

        meuFilme2.exibeFichaTecnica();
        System.out.println("Duração do filme: " + meuFilme2.getDuracaoEmMinutos() + " minutos.");

        meuFilme2.avalia(5);
        meuFilme2.avalia(7);
        meuFilme2.avalia(8);

        System.out.println("Total de avaliações: " + meuFilme2.getTotalDeAvaliacoes());
        System.out.println(meuFilme2.pegaMedia());

        Serie oVeraoQMudouMinhaVida = new Serie("O Verão Que Mudou Minha Vida", 2022);
        oVeraoQMudouMinhaVida.exibeFichaTecnica();
        oVeraoQMudouMinhaVida.setTemporadas(3);
        oVeraoQMudouMinhaVida.setTotalDeEpisodios(10);
        oVeraoQMudouMinhaVida.setMinutosPorEpisodios(50);
        System.out.println("Duração para maratonar a série: " + oVeraoQMudouMinhaVida.getDuracaoEmMinutos());

        Filme novoFilme = new Filme("Power Rangers", 2017);
        novoFilme.setDuracaoEmMinutos(120);
        novoFilme.avalia(10);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(novoFilme);
        calculadora.inclui(oVeraoQMudouMinhaVida);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(10);
        episodio.setSerie(oVeraoQMudouMinhaVida);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(novoFilme);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(meuFilme2);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
    }
}
