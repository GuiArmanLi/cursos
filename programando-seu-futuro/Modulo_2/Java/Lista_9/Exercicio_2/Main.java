public class Main {
    public static void main(String[] args) {
        Liquidificador<Alimentos> liquidificador = new Liquidificador<>();

        liquidificador.setAlimento(new Jabuticaba());
        String vitamina = liquidificador.bater();
        System.out.println(vitamina);

        liquidificador.setAlimento(new Banana());
        vitamina = liquidificador.bater();
        System.out.println(vitamina);

        // liquidificador.setAlimento(new Garafa());
        // Erro, pois pode colocar apenas classes que extends Alimentos
    }
}
