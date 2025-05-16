import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Album playGay = new Album();

        playGay.musicas.add(new Musica("Vitin", random.nextInt(0, 1000), random.nextInt(100, 360)));
        playGay.musicas.add(new Musica("Vito", random.nextInt(0, 1000), random.nextInt(100, 360)));
        playGay.musicas.add(new Musica("Vitao", random.nextInt(0, 1000), random.nextInt(100, 360)));

        System.out.println("Musica mais popular: " + playGay.getMusicaMaiorPopularidade().getNome());
        System.out.println("Musica mais curta: " + playGay.getMusicaMenorDuracao().getNome());
    }
}