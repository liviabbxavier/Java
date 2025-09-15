package Viagens;

//Exercício 7 – Lista de Viagens
//Crie uma classe Viagem com os atributos destino e duracaoDias.
//Adicione viagens à lista e imprima as que duram mais de 7 dias.

import java.util.ArrayList;

public class ViagemPrincipal {
    public static void main(String[] args) {
        ArrayList<Viagem> travels = new ArrayList<>();
        travels.add(new Viagem("Italia", 1));
        travels.add(new Viagem("Europa", 7));
        travels.add(new Viagem("Japão", 3));
        travels.add(new Viagem("Bali", 10));

        System.out.println("Lista de viagens: ");
        for (Viagem travel : travels) {
            System.out.println(travel);
        }

        System.out.println("Viagens com 7 dias ou mais de duração: ");
        for (Viagem travel : travels) {
            if (travel.getDuracaoDias() >= 7) {
                System.out.println(travel);
            }
        }
    }
}
