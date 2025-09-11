package Modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 8) {
            System.out.println(audio.getTitulo() + " é considerado absulute sucess " +
                    "e preferido por todos!");
        } else {
            System.out.println(audio.getTitulo() + " também é um dos que todo mundo está " +
                    "curtindo");
        }
    }
}
