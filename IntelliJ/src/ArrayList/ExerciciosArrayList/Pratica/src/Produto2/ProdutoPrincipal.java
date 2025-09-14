package Produto2;

import java.util.ArrayList;

//🧮 Exercício 2 – Lista de Produtos
//Crie uma classe Produto com os atributos nome e preco.
//Adicione produtos a um ArrayList, imprima o total de produtos e o produto mais caro.

public class ProdutoPrincipal {
    public static void main(String[] args) {

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(new Produto("Smartphone", 2200.00));
        listaDeProdutos.add(new Produto("Fone de ouvido", 250.00));
        listaDeProdutos.add(new Produto("Monitor", 1200.00));


        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println(listaDeProdutos);

        Produto maisCaro = listaDeProdutos.get(0);
        for (Produto p : listaDeProdutos) {
            if (p.getPreco() > maisCaro.getPreco()) {
                maisCaro = p;
            }
        }

        System.out.println("Produto mais caro: " + maisCaro);
        }
}
