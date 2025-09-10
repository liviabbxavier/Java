package Produto2;

public class Produto {
    private String nome;
    private int preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " Preço: " + getPreco();
    }

}
