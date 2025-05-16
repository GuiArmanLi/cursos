public class Moto extends Veiculo {
    public Moto() {
    }

    public Moto(int id, int velocidadeMaxima, int precisaoEmCurvas) {
        super(velocidadeMaxima, precisaoEmCurvas);
    }

    @Override
    void habilidadeEspecial() {
        System.out.println("Grau!!!");
    }
}
