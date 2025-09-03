import java.util.ArrayList;

public class PessoaPrincipal {
    public static void main(String[] args) {

        Pessoa primeiraPessoa = new Pessoa();
        primeiraPessoa.setNome("Hwang Hyunjin");
        primeiraPessoa.setIdade(25);

        Pessoa segundaPessoa = new Pessoa();
        segundaPessoa.setNome("Yang Jeongin");
        segundaPessoa.setIdade(24);

        Pessoa terceiraPessoa = new Pessoa();
        terceiraPessoa.setNome("Christopher Bang");
        terceiraPessoa.setIdade(27);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(primeiraPessoa);
        listaDePessoas.add(segundaPessoa);
        listaDePessoas.add(terceiraPessoa);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("toString das pessoas: " + listaDePessoas.get(0).toString());
        System.out.println(listaDePessoas);
    }
}
