package Carros;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;

    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Modelo do carro: " + getModelo() + "(" + getAno() + ")" + " Cor: " + getCor();
    }
}
