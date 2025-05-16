import java.util.UUID;

public class Heroi {
    private UUID id;
    private String nome;
    private int quantidadeMoedasDeOuro;

    public Heroi() {
        this.id = UUID.randomUUID();
    }

    public Heroi(String nome, int quantidadeMoedasDeOuro) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.quantidadeMoedasDeOuro = quantidadeMoedasDeOuro;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeMoedasDeOuro() {
        return quantidadeMoedasDeOuro;
    }

    public void setQuantidadeMoedasDeOuro(int quantidadeMoedasDeOuro) {
        this.quantidadeMoedasDeOuro = quantidadeMoedasDeOuro;
    }

    @Override
    public String toString() {
        return "Heroi [id=" + id + ", nome=" + nome + ", quantidadeMoedasDeOuro=" + quantidadeMoedasDeOuro + "]";
    }
}
