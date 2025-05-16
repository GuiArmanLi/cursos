import java.util.ArrayList;
import java.util.List;

public class Masmorra {
    private String nome;
    private Ranks rank;
    List<Heroi> herois;

    public Masmorra() {
        this.herois = new ArrayList<>();
    }

    public Masmorra(String nome, Ranks rank) {
        this.nome = nome;
        this.rank = rank;
        this.herois = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Ranks getRank() {
        return rank;
    }

    public void setRank(Ranks rank) {
        this.rank = rank;
    }

    public List<Heroi> getHerois() {
        return herois;
    }

    public void setHerois(List<Heroi> herois) {
        this.herois = herois;
    }
}

enum Ranks {
    C(1), B(2), A(3), S(4);

    private int value;

    Ranks(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}