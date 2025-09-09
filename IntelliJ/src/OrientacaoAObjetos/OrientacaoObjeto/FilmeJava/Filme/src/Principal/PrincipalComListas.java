package Principal;

import Modelos.Filme;
import Modelos.Serie;
import Modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Castelo Animado", 2005);
        meuFilme.avalia(9);
        Filme meuFilme2 = new Filme("O Rei Leão 2", 1998);
        meuFilme2.avalia(7);
        Filme novoFilme = new Filme("Power Rangers", 2017);
        novoFilme.avalia(8);
        Serie oVeraoQMudouMinhaVida = new Serie("O Verão Que Mudou Minha Vida", 2022);
        oVeraoQMudouMinhaVida.avalia(8);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(novoFilme);
        lista.add(meuFilme);
        lista.add(meuFilme2);
        lista.add(oVeraoQMudouMinhaVida);
        for (Titulo item: lista) {
            System.out.println(item.getNome());

        }

    }
}
