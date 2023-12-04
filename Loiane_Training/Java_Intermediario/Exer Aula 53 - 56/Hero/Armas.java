package Hero;

public enum Armas {
    ESPADA(10), ARCO(15), ESCUDO(5);

    Armas(long damage) {
        this.damage = damage;
    }

    private long damage;

    public long getDamage() {
        return damage;
    }
}
