package Animais;

import java.util.ArrayList;

//Exercício 6 – Lista de Animais
//Crie uma classe Animal com os atributos nome e especie.
//Adicione animais à lista e imprima os da espécie "gato".

public class AnimalPrincipal {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Tigresa", "Gato"));
        animals.add(new Animal("Mika", "Cachorro"));
        animals.add(new Animal("Ice", "Gato"));
        animals.add(new Animal("Perry", "Ornitorrinco"));
        animals.add(new Animal("Black", "Gato"));

        System.out.println("Lista de animais:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println("Animais da espécie gato:");
        for (Animal animal : animals) {
            if (animal.getEspecie().equalsIgnoreCase("Gato")) {
                System.out.println(animal);
            }
        }
    }
}
