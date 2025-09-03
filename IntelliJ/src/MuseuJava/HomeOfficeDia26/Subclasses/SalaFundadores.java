package HomeOfficeDia26.Subclasses;

import HomeOfficeDia26.Sala;

public class SalaFundadores extends Sala {

    public SalaFundadores(){
        super("Sala dos fundadores", "Criadores da linguagem", 2025);
    }

    @Override
    public void exibirConteudo() {
        System.out.println("Seja bem-vindo(a) à " + getNome());
        System.out.println("Esta sala foi criada no ano de " + getAnoCiacao());
        System.out.println("""
    Os fundadores da linguagem Java são James Gosling, Patrick Naughton, e Mike Sheridan, que faziam parte da equipa 
    "Green Team" da Sun Microsystems. O projeto, iniciado em 1991, visava criar uma nova tecnologia para dispositivos 
    eletrónicos, mas o desenvolvimento da linguagem de programação que se tornaria o Java foi a consequência mais importante.
    """);
    }
}
