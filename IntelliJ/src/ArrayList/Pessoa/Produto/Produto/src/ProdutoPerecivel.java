public class ProdutoPerecivel extends Produto{
    private double dataValidade;

   public ProdutoPerecivel(String nome, double preco, int quantidade) {
       super(nome, preco, quantidade);
   }

    public double getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(double dataValidade) {
        this.dataValidade = dataValidade;
    }
}
