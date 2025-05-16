import java.util.UUID;

public class Heroi {
    private UUID id;
    private String nome;
    private Arma arma;

    public Heroi() {
        this.id = UUID.randomUUID();
    }

    public Heroi(String nome, Arma arma) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.arma = arma;
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

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Heroi [id=" + id + ", nome=" + nome + ", arma=" + arma + "]";
    }
}

enum Arma {
    ESPADA, LANCA, MACHADO;
}
