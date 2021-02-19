package warriors.engine;

public class Weapon extends Surprise {

    public Weapon(String name, int attackLevel) {
        this.name = name;
        this.attackLevel = attackLevel;
        this.type = "arme";
    }

    @Override
    public String toString() {
        return "      . Type : " + name + ". Bonus : +" + attackLevel + " point d'attaque !";
    }
}