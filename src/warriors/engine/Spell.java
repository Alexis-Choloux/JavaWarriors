package warriors.engine;

public class Spell extends Surprise {

    public Spell(String name, int attackLevel) {
        this.name = name;
        this.attackLevel = attackLevel;
        this.type = "sort";
    }

    @Override
    public String toString() {
        return "      . Type : " + name + ". Bonus : +" + attackLevel + " point d'attaque !";
    }
}
