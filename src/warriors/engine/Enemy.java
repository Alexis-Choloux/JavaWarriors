package warriors.engine;

public class Enemy extends Event {
    private String enemyName;
    private int enemyLife;
    private int enemyAttack;

    public Enemy (String name, Integer life, Integer attack) {
        super("ennemi");
        enemyName = name;
        enemyLife = life;
        enemyAttack = attack;
    }

    public String getName() {
        return enemyName;
    }

    public int getLife() {
        return enemyLife;
    }

    public int getAttackLevel() {
        return enemyAttack;
    }

    @Override
    public String toString() {
        return "C'est un " + enemyName + ", il a " + enemyAttack + " points d'attaque et " + enemyLife + " points de vie !";
    }
}
