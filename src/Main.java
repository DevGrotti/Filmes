import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // novo objeto do tipo Filme chamado "favorito"
        Filme favorito = new Filme("The Matrix");

        // instanciando um objeto
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();

        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        // exibindo a média e a quantidade total de avaliações do filme
        System.out.println("Média de avaliações do Filme: " + favorito.pegaMedia());
        System.out.println("Total de avaliações do Filme: " + favorito.getTotalDeAvaliacoes());

        Serie lost = new Serie();
        lost.setNome("Breaking Bad");
        System.out.println(lost.getNome());
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println("Você precisará de " + calculadora.getTempoTotal() + " minutos para assistir a todos os filmes.");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(favorito);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeQualquer = new Filme("Dogville");
        //filmeQualquer.setNome("Dogville");
        filmeQualquer.setDuracaoEmMinutos(200);
        filmeQualquer.setAnoDeLancamento(2003);
        filmeQualquer.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(favorito);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(filmeQualquer);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).toString() + "\n");
        System.out.println(listaDeFilmes);

    }
}
