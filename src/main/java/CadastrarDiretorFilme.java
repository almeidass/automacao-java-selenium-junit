import java.util.ArrayList;

public class CadastrarDiretorFilme {
    public static void main(String[] args) {

        ArrayList<String> diretor = new ArrayList<String>();
        diretor.add("Joe Russo;8 de julho de 1971");
        System.out.println(diretor);

        ArrayList<String> filmes = new ArrayList<String>();
        filmes.add("Vingadores: Ultimato;2019");
        filmes.add("Vingadores: Guerra Infinita;2018");
        System.out.println(filmes);
    }
}
