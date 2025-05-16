public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();

        fabrica.addOperarios(new Dobrador());
        fabrica.addOperarios(new Cortador());
        fabrica.addOperarios(new Prensador());
        
        fabrica.escravizar();
    }
}