package Principal;

import Modelos.MinhasPreferidas;
import Modelos.Musica;
import Modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Christmas EveL");
        minhaMusica.setCantor("Stray Kids");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Aprendendo com uma Java Champion");
        podcast.setApresentador("Loiane Groner");

        for (int i = 0; i < 5000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(minhaMusica);

    }
}
