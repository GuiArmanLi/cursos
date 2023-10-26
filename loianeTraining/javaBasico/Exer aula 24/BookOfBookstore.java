import java.util.UUID;

public class BookOfBookstore {
    UUID id = UUID.randomUUID();
    String title;
    String author;
    String gender;
    int pages;
    int release;
    int price;

    public static void main(String[] args) {
        BookOfBookstore theBeginningAfterTheEnd = new BookOfBookstore();

        System.out.println("Codigo do livro: " + theBeginningAfterTheEnd.id);
        theBeginningAfterTheEnd.title = "The Beginning After the End";
        theBeginningAfterTheEnd.author = "TurtleMe";
        theBeginningAfterTheEnd.gender = "Acao";
        theBeginningAfterTheEnd.pages = 4000;
        theBeginningAfterTheEnd.release = 2012;
        theBeginningAfterTheEnd.price = 2000;

        System.out.println("Titulo: " + theBeginningAfterTheEnd.title);
        System.out.println("Autor: " + theBeginningAfterTheEnd.author);
        System.out.println("Genero: " + theBeginningAfterTheEnd.gender);
        System.out.println("Paginas: " + theBeginningAfterTheEnd.pages);
        System.out.println("Ano de lancamento: " + theBeginningAfterTheEnd.release);
        System.out.println("Preco: " + theBeginningAfterTheEnd.price);
    }
}
