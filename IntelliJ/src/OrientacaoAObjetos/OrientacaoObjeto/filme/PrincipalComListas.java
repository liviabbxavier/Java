package Principal;

import sub.Filme;
import sub.Serie;
import sub.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Castelo Animado", 2005);
        Filme meuFilme2 = new Filme("O Rei Leão 2", 1998);
        Filme novoFilme = new Filme("Power Rangers", 2017);
        Serie oVeraoQMudouMinhaVida = new Serie("O Verão Que Mudou Minha Vida", 2022);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(novoFilme);
        lista.add(meuFilme);
        lista.add(meuFilme2);
        lista.add(oVeraoQMudouMinhaVida);

    }
}
