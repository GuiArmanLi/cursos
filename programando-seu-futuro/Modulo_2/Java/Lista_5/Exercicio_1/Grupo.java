import java.util.List;
import java.util.ArrayList;

public class Grupo {
    private List<Heroi> herois;
    private int totalDeMoedas;

    public Grupo() {
        this.herois = new ArrayList<>();
    }

    public int getTotalDeMoedas() {
        this.totalDeMoedas = 0;

        for (Heroi heroi : herois) {
            this.totalDeMoedas += heroi.getQuantidadeMoedasDeOuro();
        }

        return totalDeMoedas;
    }

    public List<Heroi> getHerois() {
        return herois;
    }

    public void setHerois(List<Heroi> herois) {
        this.herois = herois;
    }

    public String recrutar(Heroi heroi) {
        for (Heroi i : herois) {
            if (heroi.getId().equals(i.getId())) {
                return "O herói já está no grupo!";
            }
        }

        this.herois.add(heroi);
        return "Heroi " + heroi.getNome() + " foi adicionado ao grupo!";
    }

    public String removerHeroi(Heroi iHeroi) {
        for (Heroi heroi : herois) {
            if (heroi.getId().equals(iHeroi.getId())) {
                herois.remove(heroi);
                return "Heroi " + iHeroi.getNome() + " foi removido do grupo!";
            }
        }
        return "Erro!";
    }
}
