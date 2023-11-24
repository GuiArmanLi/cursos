import java.util.UUID;

public class Book {
    UUID id = UUID.randomUUID();
    String title;
    String author;
    String gender;
    int pages;
    int release;

    public static void main(String[] args) {
        Book talesOfDemonsAndGods = new Book();

        System.out.println("Codigo do livro: " + talesOfDemonsAndGods.id);
        talesOfDemonsAndGods.title = "Tales of Demons and Gods";
        talesOfDemonsAndGods.author = "Mad snail";
        talesOfDemonsAndGods.gender = "Aventura";
        talesOfDemonsAndGods.pages = 2000;
        talesOfDemonsAndGods.release = 2015;

        System.out.println("Titulo: " + talesOfDemonsAndGods.title);
        System.out.println("Autor: " + talesOfDemonsAndGods.author);
        System.out.println("Genero: " + talesOfDemonsAndGods.gender);
        System.out.println("Paginas: " + talesOfDemonsAndGods.pages);
        System.out.println("Ano de lancamento: " + talesOfDemonsAndGods.release);
    }
}
