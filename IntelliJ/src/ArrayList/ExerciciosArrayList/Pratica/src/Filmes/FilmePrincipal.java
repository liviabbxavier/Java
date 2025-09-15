package Filmes;

//Exercício 9 – Lista de Filmes
//Crie uma classe Filme com os atributos titulo, genero e avaliacao.
//Adicione filmes à lista e imprima os com avaliação acima de 8.

import java.util.ArrayList;

public class FilmePrincipal {
    public static void main(String[] args) {
        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("Demon Slayer - O Castelo Infinito", "ação", 9.7));
        filmes.add(new Filme("Quando as luzes se apagam", "terror", 7.9));
        filmes.add(new Filme("Anjos e Demônios", "mistério", 6.7));
        filmes.add(new Filme("O Castelo Animado", "fantasia", 8.2));

        System.out.println("Lista de filmes:");
        for (Filme filme : filmes) {
            System.out.println(filme);
        }

        System.out.println("///////////////////////////////////////////////////////////////");

        System.out.println("Filmes com avaliação maior que 8");
        for (Filme filme : filmes) {
            if (filme.getAvaliacao() > 8) {
                System.out.println(filme);
            }
        }
    }
}
