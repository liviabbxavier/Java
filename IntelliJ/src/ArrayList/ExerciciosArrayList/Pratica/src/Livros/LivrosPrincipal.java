package Livros;

//📚 Exercício 3 – Lista de Livros
//Crie uma classe Livro com os atributos titulo, autor e anoPublicacao.
//Adicione livros à lista, imprima todos e filtre os publicados após 2010.

import java.util.ArrayList;

public class LivrosPrincipal {
    public static void main(String[] args) {
        ArrayList<Livro> listaDeLivros = new ArrayList<>();
        listaDeLivros.add(new Livro("Você ligou para o Sam", "Dustin Thao", 2022));
        listaDeLivros.add(new Livro("A Biblioteca da Meia-Noite", "Matt Haig", 2020));
        listaDeLivros.add(new Livro("Dracula", "Bram Stoker", 1897));
        listaDeLivros.add(new Livro("Crime e Castigo", "Fiódor Dostoiévski", 1866));

        System.out.println("Lista completa de livros:");
        for (Livro livro : listaDeLivros) {
            System.out.println(livro);
        }

        System.out.println("//////////////////////////////////////////");

        System.out.println("Livros publicados após 2010:");
        for (Livro livro : listaDeLivros) {
            if (livro.getAnoPublicacao() > 2010) {
                System.out.println(livro);
            }
        }

    }
}
