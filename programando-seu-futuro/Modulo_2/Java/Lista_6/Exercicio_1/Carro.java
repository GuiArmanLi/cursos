public class Carro extends Veiculo {
    public Carro() {
    }

    public Carro(int velocidadeMaxima, int precisaoEmCurvas) {
        super(velocidadeMaxima, precisaoEmCurvas);
    }

    @Override
    void habilidadeEspecial() {
        System.out.println("Atirador sai da janela e começa a atirar nos inimigos!!!");
    }
}
