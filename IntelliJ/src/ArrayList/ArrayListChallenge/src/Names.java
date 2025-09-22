import java.util.ArrayList;
import java.util.Scanner;

public class Names {

    String header = """
            ==== Menu ====
            1 - Adicionar nome
            2 - Listar nomes
            3 - Remover nome
            4 - Sair""";

    public void menu() {
        ArrayList<String> names = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        System.out.println(header);
        int choice = 0;
        while (choice != 4) {
            choice = read.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Digite o nome: ");
                    read.nextLine();
                    String newName = read.nextLine();
                    names.add(newName);
                    System.out.println("Nome adicionado!");
                    System.out.println(header);
                    break;

                case 2:
                    if (names.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        System.out.println("Nomes na lista:");
                        for (int i = 0; i < names.size(); i++) {
                            System.out.println(i + " - " + names.get(i));
                        }
                    }
                    System.out.println(header);
                    break;

                case 3:
                    System.out.print("Digite o nome que você deseja remover: ");
                    read.nextLine();
                    String remove = read.nextLine();
                    names.remove(remove);
                    System.out.println(remove + "removido com sucesso!");
                    System.out.println(header);
                    break;

                case 4:
                    read.close();
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.println(header);
                    break;
            }
        }

    }
}