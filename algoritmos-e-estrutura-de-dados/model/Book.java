package model;

public class Book {
    private String name;
    private String isbn;
    private int yearOfRelease;
    private String author;

    public Book() {
    }

    public Book(String nome, String isbn, int anoLancamento, String autor) {
        this.name = nome;
        this.isbn = isbn;
        this.yearOfRelease = anoLancamento;
        this.author = autor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + name + ", isbn=" + isbn + ", anoLancamento=" + yearOfRelease + ", autor=" + author + "]";
    }
}