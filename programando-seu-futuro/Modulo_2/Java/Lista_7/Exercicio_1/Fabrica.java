import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

public class Fabrica {
    private UUID id;
    private List<Operario> operarios;

    public Fabrica() {
        this.id = UUID.randomUUID();
        this.operarios = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public List<Operario> getOperarios() {
        return operarios;
    }

    public void addOperarios(Operario operario) {
        this.operarios.add(operario);
    }

    public void escravizar() {
        for (Operario operario : operarios) {
            operario.produzir();
        }
    }
}
