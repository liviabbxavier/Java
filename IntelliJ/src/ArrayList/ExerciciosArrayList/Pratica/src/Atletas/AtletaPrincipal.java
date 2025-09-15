package Atletas;

//Exercício 10 – Lista de Atletas
//Crie uma classe Atleta com os atributos nome, modalidade e pontuacao.
//Adicione atletas à lista e imprima o campeão (maior pontuação).

import java.util.ArrayList;

public class AtletaPrincipal {
    public static void main(String[] args) {
        ArrayList<Atleta> atletas = new ArrayList<>();
        atletas.add(new Atleta("Sae Itoshi", "Futebol", 9.7));
        atletas.add(new Atleta("Tetsuro Kuroo", "Vôleibol", 10.0));
        atletas.add(new Atleta("Kageyama Tobio", "Vôleibol", 8.9));

        System.out.println("Lista de Atletas:");
        for (Atleta atleta : atletas) {
            System.out.println(atleta);
        }

        System.out.println("/////////////////////////////////////////////");

        Atleta campeao = atletas.get(0);
        for (Atleta atleta : atletas) {
            if (atleta.getPontuacao() > campeao.getPontuacao()) {
                campeao = atleta;
            }
        }
        System.out.println("Campeão:");
        System.out.println(campeao);
    }
}
