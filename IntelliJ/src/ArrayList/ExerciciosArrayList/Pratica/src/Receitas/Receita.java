package Receitas;

public class Receita {
    private String nome;
    private int tempoPreparo;

    public Receita(String nome, int tempoPreparo) {
        this.nome = nome;
        this.tempoPreparo = tempoPreparo;
    }

    public String getNome() {
        return nome;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    @Override
    public String toString() {
        return "Receita{" +
                " Nome: '" + nome + '\'' +
                ", Tempo de preparo: " + tempoPreparo +
                "' Minutos}";
    }
}
