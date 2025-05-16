import java.util.UUID;

abstract class Veiculo {
    private UUID id;
    private int velocidadeAtual;
    private int velocidadeMaxima;
    private int precisaoEmCurvas;
    private boolean estaComFarolLigado;

    public Veiculo() {
        this.id = UUID.randomUUID();
    };

    public Veiculo(int velocidadeMaxima, int precisaoEmCurvas) {
        this.id = UUID.randomUUID();
        this.velocidadeMaxima = velocidadeMaxima;
        this.precisaoEmCurvas = precisaoEmCurvas;
    }

    public UUID getId() {
        return id;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getPrecisaoEmCurvas() {
        return precisaoEmCurvas;
    }

    public void setPrecisaoEmCurvas(int precisaoEmCurvas) {
        this.precisaoEmCurvas = precisaoEmCurvas;
    }

    public boolean isEstaComFarolLigado() {
        return estaComFarolLigado;
    }

    public void setEstaComFarolLigado(boolean estaComFarolLigado) {
        this.estaComFarolLigado = estaComFarolLigado;
    }

    abstract void habilidadeEspecial();
}
