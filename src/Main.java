import br.com.alura.screenmatch.modelos.Filme;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // novo objeto do tipo br.com.alura.screenmatch.modelos.Filme
        Filme favorito = new Filme();
        // instanciando um objeto
        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();

        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Média de avaliações do Filme: " + favorito.pegaMedia());
        System.out.println("Total de avaliações do Filme: " + favorito.getTotalDeAvaliacoes());


    }
}
