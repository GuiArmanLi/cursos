import java.util.UUID;

public class Pokemon {
    private UUID codigoIdentificador;
    private String nome;
    private String tipo;

    public Pokemon() {
        this.codigoIdentificador = UUID.randomUUID();
    }

    public Pokemon(String nome, String tipo) {
        this.codigoIdentificador = UUID.randomUUID();
        this.nome = nome;
        this.tipo = tipo;
    }

    public UUID getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pokemon [codigoIdentificador=" + codigoIdentificador + ", nome=" + nome + ", tipo=" + tipo + "]\n";
    }
}
