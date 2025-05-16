import java.util.List;
import java.util.ArrayList;

public class Grupo {

    private List<Heroi> herois;

    public Grupo() {
        this.herois = new ArrayList<>();
    }

    public List<Heroi> getHerois() {
        return herois;
    }

    @Override
    public String toString() {
        return "Grupo [herois=" + herois + "]";
    }

    public void adicionarHeroi(Heroi novoHeroi) throws NomeRepetidoException {
        for (Heroi heroi : this.getHerois()) {
            if (heroi.getNome().equalsIgnoreCase(novoHeroi.getNome())) {
                throw new NomeRepetidoException();
            }
        }
        this.getHerois().add(novoHeroi);
    }
}
