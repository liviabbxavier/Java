package HomeOfficeDia26;

import HomeOfficeDia26.Subclasses.SalaCuriosidades;
import HomeOfficeDia26.Subclasses.SalaFundadores;
import HomeOfficeDia26.Subclasses.SalaVersoes;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe seu nome");
        String nome = leitura.next();
        System.out.println("Informe sua idade");
        int idade = leitura.nextInt();

        SalaCuriosidades sala1 = new SalaCuriosidades();
        SalaFundadores sala2 = new SalaFundadores();
        SalaVersoes sala3 = new SalaVersoes();

        Visitantes visitante = new Visitantes();

        int escolha;

        do {
            System.out.println("Escolha a sala que você deseja explorar");
            System.out.println("1 - " + sala1.getNome());
            System.out.println("2 - " + sala2.getNome());
            System.out.println("3 - " + sala3.getNome());
            System.out.println("4 - Sair");
            escolha = leitura.nextInt();
            switch (escolha) {
                case 1:
                    sala1.exibirConteudo();
                    break;
                case 2:
                    sala2.exibirConteudo();
                    break;
                case 3:
                    sala3.exibirConteudo();
                    break;
                case 4:
                    System.out.println("Obrigada pela visita! Volte sempre! ^-^");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }while (escolha != 4);
    }
}
