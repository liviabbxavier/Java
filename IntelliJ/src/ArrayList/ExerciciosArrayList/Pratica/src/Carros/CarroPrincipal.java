package Carros;

import java.util.ArrayList;

//Exercício 5 – Lista de Carros
//Crie uma classe Carro com os atributos modelo, ano e cor.
//Adicione carros à lista e imprima os que são da cor "vermelha".

public class CarroPrincipal {
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<>();
        carros.add(new Carro("Chevrolet Opala", 1968, "Preto"));
        carros.add(new Carro("Ford Belina", 1970, "Vermelho"));
        carros.add(new Carro("Volkswagen T-Cross", 2019, "Marrom"));
        carros.add(new Carro("Renault Sandero", 2023, "Vermelho"));
        carros.add(new Carro("Mitsubishi Eclipse Cross", 2019, "Cinza"));

        System.out.println("Lista de carros:");
        for (Carro carro : carros) {
            System.out.println(carro);
        }

        System.out.println("/////////////////////////////////////");

        System.out.println("Carros vermelhos:");
        for (Carro carro : carros) {
            if (carro.getCor().equalsIgnoreCase("vermelho")) {
                System.out.println(carro);
            }
        }
    }
}
