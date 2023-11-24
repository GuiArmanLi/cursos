import java.util.UUID;

public class BookOfLibrary {
    UUID id = UUID.randomUUID();
    String title;
    String author;
    String gender;
    int pages;
    int release;
    boolean wasBorrowed;

    public static void main(String[] args) {
        BookOfLibrary cleandCode = new BookOfLibrary();

        cleandCode.title = "Clean Code";
        cleandCode.author = "Robert C. Martin";
        cleandCode.gender = "Informativo";
        cleandCode.pages = 431;
        cleandCode.release = 2008;
        cleandCode.wasBorrowed = true;

        System.out.println("Codigo do livro: " + cleandCode.id);
        System.out.println("Titulo: " + cleandCode.title);
        System.out.println("Autor: " + cleandCode.author);
        System.out.println("Genero: " + cleandCode.gender);
        System.out.println("Paginas: " + cleandCode.pages);
        System.out.println("Ano de lancamento: " + cleandCode.release);
        System.out.println("Disponivel? " + !cleandCode.wasBorrowed);
    }
}
