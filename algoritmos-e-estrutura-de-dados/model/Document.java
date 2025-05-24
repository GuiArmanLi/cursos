package model;

public class Document {
    private String name;
    private int amountSheets;

    public Document() {
    }

    public Document(String nome, int quantidadeFolhas) {
        this.name = nome;
        this.amountSheets = quantidadeFolhas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountSheets() {
        return amountSheets;
    }

    public void setAmountSheets(int amountSheets) {
        this.amountSheets = amountSheets;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "nome='" + name + '\'' +
                ", quantidadeFolhas=" + amountSheets +
                '}';
    }
}
