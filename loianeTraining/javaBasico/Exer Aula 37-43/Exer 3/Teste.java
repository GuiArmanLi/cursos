public class Teste {
    public static void main(String[] args) {
        Mammal camelo = new Mammal("Camelo", 150, 4, "Amarelo", 2);
        Fish tubarao = new Fish("Tubarao", 300, 1.5, "Barbatanas e Cauda");
        Mammal urso = new Mammal("Urso-do-canada", 180, 4, "Vermeho", 0.5, "Mel");

        System.out.println("Casa do Paulo:");
        camelo.displayObject();
        tubarao.displayObject();
        urso.displayObject();
    }
}
