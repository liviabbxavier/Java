import java.util.ArrayList;
import java.util.Scanner;

public class NamePrincipal {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        int choice = read.nextInt();
        while (true) {
            System.out.println("""
                    === Escolha uma das opções abaixo ===
                    1 - Adicionar um nome
                    2 - Ver a lista de nomes
                    3 - Remover um nome
                    4 - Sair
                    """);
            switch (choice) {
                case 1:
                    System.out.println("Digite o nome que você deseja adicionar:");
                    String name = read.next();
                    list.add(name);
                    break;

                case 2:
                    System.out.println("""
                            Aqui está a lista de nomes adicionados:
                            """ +
                            list);
                    break;

                case 3:
                    System.out.println("Qual nome você deseja remover?");
                    break;

                case 4:
                    System.out.println("Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            } read.close();
        }

    }
}
