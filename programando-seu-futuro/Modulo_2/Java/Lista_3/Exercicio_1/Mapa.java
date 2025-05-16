import java.util.ArrayList;
import java.util.List;

public class Mapa {
    private String nome;
    private Ranks rank;
    private boolean ehVermelho;

    private List<Heroi> herois = new ArrayList<>();
    private List<Inimigo> inimigos = new ArrayList<>();

    public Mapa() {
    }

    public Mapa(String nome, Ranks rank, boolean ehVermelho) {
        this.nome = nome;
        this.rank = rank;
        this.ehVermelho = ehVermelho;
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

    public boolean isEhVermelho() {
        return ehVermelho;
    }

    public void setEhVermelho(boolean ehVermelho) {
        this.ehVermelho = ehVermelho;
    }

    public List<Heroi> getHerois() {
        return herois;
    }

    public void setHerois(List<Heroi> herois) {
        this.herois = herois;
    }

    public List<Inimigo> getInimigos() {
        return inimigos;
    }

    public void setInimigos(List<Inimigo> inimigos) {
        this.inimigos = inimigos;
    }

    public int verificaMaiorAtaqueInimigo() {
        int maiorAtaque = 0;
        for (Inimigo inimigo : inimigos) {
            if (inimigo.getAtaque() > maiorAtaque) {
                maiorAtaque = inimigo.getAtaque();
            }
        }
        return maiorAtaque;
    }
}

enum Ranks {
    F(7), E(6), D(5), C(4), B(3), A(2), S(1);

    private int value;

    Ranks(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}