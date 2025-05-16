public class Main {
    public static void main(String[] args) {
        Grupo grupo = new Grupo();

        try {
            grupo.adicionarHeroi(new Heroi("Cavalcante", Arma.ESPADA));
            grupo.adicionarHeroi(new Heroi("Guilherme", Arma.LANCA));
            grupo.adicionarHeroi(new Heroi("Paulo", Arma.MACHADO));
            grupo.adicionarHeroi(new Heroi("Kauan", Arma.LANCA));
            
            System.out.println(grupo);

            grupo.adicionarHeroi(new Heroi("Kauan", Arma.LANCA));
        } catch (NomeRepetidoException error) {
            System.out.println(error.getMessage());
        }
    }
}