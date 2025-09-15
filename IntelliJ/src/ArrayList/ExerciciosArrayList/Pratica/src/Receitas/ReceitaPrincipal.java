package Receitas;

//Exercício 8 – Lista de Receitas
//Crie uma classe Receita com os atributos nome e tempoPreparo.
//Adicione receitas à lista e imprima as que levam menos de 30 minutos.

import java.util.ArrayList;

public class ReceitaPrincipal {
    public static void main(String[] args) {
        ArrayList<Receita> receitas = new ArrayList<>();
        receitas.add(new Receita("Brownie", 35));
        receitas.add(new Receita("Pizza", 20));
        receitas.add(new Receita("Feijoada", 45));
        receitas.add(new Receita("Sanduíche", 7));

        System.out.println("Lista de receitas:");
        for (Receita receita : receitas) {
            System.out.println(receita);
        }

        System.out.println("//////////////////////////////////////////");
        System.out.println("Estas receitas tem 30 minutos ou mais de duração:");
        for (Receita receita : receitas) {
            if (receita.getTempoPreparo() > 30) {
                System.out.println(receita);
            }
        }
    }
}
