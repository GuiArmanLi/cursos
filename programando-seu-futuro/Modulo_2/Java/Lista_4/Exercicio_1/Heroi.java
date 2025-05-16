public class Heroi {
    private String nome;
    private int vida;
    private int mana;
    private int nivel;
    private Classes classe;

    public Heroi() {
    }

    public Heroi(String nome, int vida, int mana, Classes classe) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.nivel = 0;
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Classes getClasse() {
        return classe;
    }

    public void setClasse(Classes classe) {
        this.classe = classe;
    }

}

enum Classes {
    ESPADACHIM(Armas.ESPADA), TANQUE(Armas.ESCUDO), ARQUEIRO(Armas.ARCO), MAGO(Armas.CAJADO), ASSASSINO(Armas.ADAGA),
    BARBARO(Armas.MACHADO), GOBLIN(Armas.PICARETA), SUPORTE(Armas.VARINHA);

    private Armas arma;

    Classes(Armas arma) {
        this.arma = arma;
    }

    public Armas getArma() {
        return arma;
    }
}
