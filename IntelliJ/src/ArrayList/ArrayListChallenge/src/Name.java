import java.util.ArrayList;
import java.util.Scanner;

public class Name {
    ArrayList<String> newNames = new ArrayList<>();
    String read = """
                === Escolha uma das opções abaixo ===
                1 - Adicionar um nome
                2 - Verificar a Lista de nomes
                3 - Remover um nome 
                4 - Sair
                """;

    Scanner read1 = new Scanner(System.in);
    int choice;
    public void menu() {

        while (true) {
            System.out.println(read);
            choice = read1.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Qual nome você deseja adicionar?");
                    String newName = read1.next();

            }
        }
    }
}
