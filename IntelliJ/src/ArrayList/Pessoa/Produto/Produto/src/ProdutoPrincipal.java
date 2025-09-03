import java.util.ArrayList;

public class ProdutoPrincipal {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Chaveiro",  5.00,  50);
        Produto produto2 = new Produto("Pelúcia",  10.00,  5);
        Produto produto3 = new Produto("Caderno",  15.00,  7);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println("Produtos: " + listaDeProdutos.toString());


    }
}
