import java.util.ArrayList;

public class ProdutoPrincipal {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Chaveiro",  5.00,  50);
        Produto produto2 = new Produto("Pelúcia",  10.00,  5);
        Produto produto3 = new Produto("Caderno",  15.00,  7);
        ProdutoPerecivel perecivel1 = new ProdutoPerecivel("Pão", 7.00, 10);
        ProdutoPerecivel perecivel2 = new ProdutoPerecivel("Biscoito", 4.50, 5);
        ProdutoPerecivel perecivel3 = new ProdutoPerecivel("Torta", 15.0, 3);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        ArrayList<ProdutoPerecivel> listaPereciveis = new ArrayList<>();
        listaPereciveis.add(perecivel1);
        listaPereciveis.add(perecivel2);
        listaPereciveis.add(perecivel3);

        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println("Produtos: " + listaDeProdutos.toString());

        System.out.println("Tamanho da lista: " + listaPereciveis.size());
        System.out.println("Perecíveis: " + listaPereciveis.toString());
    }
}
