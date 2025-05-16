public class Main {
    public static void main(String[] args) {
        Masmorra masmorra = new Masmorra("Ilha de jeju", Ranks.S);

        masmorra.getHerois().add(new Heroi("Guilherme", 100, 80, Classes.MAGO));
        masmorra.getHerois().add(new Heroi("Paulo", 500, 12, Classes.TANQUE));
        masmorra.getHerois().add(new Heroi("Lucas", 120, 40, Classes.GOBLIN));
        masmorra.getHerois().add(new Heroi("Kauan", 200, 60, Classes.SUPORTE));

        for (Heroi heroi : masmorra.getHerois()) {
            System.out.println("O heroi " + heroi.getNome() + " entrou na " + masmorra.getNome());
            System.out.println("Classe: " + heroi.getClasse());
            System.out.println("Arma: " + heroi.getClasse().getArma());
            System.out.println("Dano: " + heroi.getClasse().getArma().getDano());
            System.out.println("Ataque especial: " + heroi.getClasse().getArma().efeitoEspecial() + "\n");
        }

        System.out.println("O rank da masmorra é " + masmorra.getRank() + ". Nivel: " + masmorra.getRank().getValue());

    }
}