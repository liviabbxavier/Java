package Produto2;

import java.util.ArrayList;

public class ProdutoPrincipal {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.setNome("Cama");
        produto1.setPreco(700);

        Produto produto2 = new Produto();
        produto2.setNome("Guarda-Roupa");
        produto2.setPreco(1000);

        Produto produto3 = new Produto();
        produto3.setNome("Cômoda");
        produto3.setPreco(400);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println(listaDeProdutos);
        System.out.println("O produto mais caro é: " + produto2.getNome() + " Que está pelo preço de: " + produto2.getPreco());
    }
}
