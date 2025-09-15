package Viagens;

public class Viagem {
    private String destino;
    private int duracaoDias;

    public Viagem(String destino, int duracaoDias) {
        this.destino = destino;
        this.duracaoDias = duracaoDias;
    }

    public String getDestino() {
        return destino;
    }

    public int getDuracaoDias() {
        return duracaoDias;
    }

    @Override
    public String toString() {
        return "Viagem{" +
                " Destino: '" + destino + '\'' +
                ", Duração da viagem: '" + duracaoDias +
                "'}";
    }
}
