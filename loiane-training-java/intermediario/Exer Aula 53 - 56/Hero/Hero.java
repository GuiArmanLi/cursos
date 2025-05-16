package Hero;

public class Hero {

    long health;
    long experience;
    long damage;
    long defense;
    Armas arma;

    public Hero() {
    }

    public Hero(long health, long experience, long damage, long defense, Armas arma) {
        this.health = health;
        this.experience = experience;
        this.damage = damage;
        this.defense = defense;
        this.arma = arma;
    }

    public long getHealth() {
        return health;
    }

    public void setHealth(long health) {
        this.health = health;
    }

    public long getExperience() {
        return experience;
    }

    public void setExperience(long experience) {
        this.experience = experience;
    }

    public long getDamage() {
        return damage;
    }

    public void setDamage(long damage) {
        this.damage = damage;
    }

    public long getDefense() {
        return defense;
    }

    public void setDefense(long defense) {
        this.defense = defense;
    }

    public Armas getArmas() {
        return arma;
    }

    public void setArmas(Armas arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Hero [health=" + health + ", experience=" + experience + ", damage=" + damage + ", defense=" + defense
                + ", arma=" + arma + "]";
    }
}
