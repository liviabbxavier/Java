package HomeOfficeDia26;

import java.util.Scanner;

public class Sala {
    private String nome;
    private String descricao;
    private int anoCiacao;
    Scanner leitura = new Scanner(System.in);

    public Sala (String nome, String descricao, int anoCiacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.anoCiacao = anoCiacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAnoCiacao() {
        return anoCiacao;
    }

    public void setAnoCiacao(int anoCiacao) {
        this.anoCiacao = anoCiacao;
    }

    public void exibirConteudo () {
    }
}
