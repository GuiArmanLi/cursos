import java.util.UUID;

class Lamp {
    UUID id;
    String name = "Lampada";
    String describe = "";
    double price;

    public static void main(String[] args) {
        Lamp lampada = new Lamp();

        lampada.name = "Pisca Pisca";
        lampada.describe = "Perfeita para enfeitar seu natal";
        lampada.price = 12;

        System.out.println("Nome: " + lampada.name);
        System.out.println("Descricao: " + lampada.describe);
        System.out.println("Preco: " + lampada.price);
    }
}