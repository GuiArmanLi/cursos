import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        Mapa antKing = new Mapa("Ant King", Ranks.S, false);

        antKing.getHerois().add(
                new Heroi(r.nextInt(5, 10), r.nextInt(5, 10), r.nextInt(5, 10), r.nextInt(5, 10)));
        antKing.getInimigos().add(
                new Inimigo(r.nextInt(5, 10), r.nextInt(5, 10), r.nextInt(5, 10), r.nextInt(5, 10)));
        antKing.getInimigos().add(
                new Inimigo(r.nextInt(5, 10), r.nextInt(5, 10), r.nextInt(5, 10), r.nextInt(5, 10)));
        antKing.getInimigos().add(
                new Inimigo(r.nextInt(5, 10), r.nextInt(5, 10), r.nextInt(5, 10), r.nextInt(5, 10)));

        System.out.println("Maior ataque inimigo: " + antKing.verificaMaiorAtaqueInimigo());
        System.out.println("Portal de Rank " + antKing.getRank() +
                ", equivalente ao nível " + antKing.getRank().getValue() + " de dificuldade!");

    }
}