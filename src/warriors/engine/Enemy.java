package warriors.engine;

public class Enemy extends Event {

    public Enemy (String name, Integer lifeLevel, Integer attackLevel) {
        super(name, lifeLevel, attackLevel, "ennemi");
    }

    @Override
    public String toString() {
        return "      C'est un " + name + ", il a " + attackLevel + " points d'attaque et " + lifeLevel + " points de vie !";
    }
}
