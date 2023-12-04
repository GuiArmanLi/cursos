public class DiaSemana {
    public static void main(String[] args) {
        System.out.println("Lista de dias na semana");

        for (DiaDaSemana dia : DiaDaSemana.values()) {
            System.out.println(dia.getValue() + " - " + dia);
        }
    }
}

enum DiaDaSemana {
    DOMINGO(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);

    private int value;

    DiaDaSemana(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}