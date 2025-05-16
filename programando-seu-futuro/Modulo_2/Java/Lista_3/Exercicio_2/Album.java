import java.util.List;
import java.util.ArrayList;

public class Album {
    String nome;
    String nomeArtista;
    List<Musica> musicas = new ArrayList<>();

    public Musica getMusicaMaiorPopularidade() {
        int maiorPopularidade = Integer.MIN_VALUE;
        int aux = 0;

        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).getPopularidade() > maiorPopularidade) {
                maiorPopularidade = musicas.get(i).getPopularidade();
                aux = i;
            }
        }

        return musicas.get(aux);
    }

    public Musica getMusicaMenorDuracao() {
        int musicaMenorDuracao = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).getDuracaoEmSegundos() < musicaMenorDuracao) {
                musicaMenorDuracao = musicas.get(i).getDuracaoEmSegundos();
                index = i;
            }
        }

        return musicas.get(index);
    }
}