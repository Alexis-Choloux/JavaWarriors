package warriors.engine;

public class Weapon extends Surprise {

    public Weapon(String name, Integer points) {
        super(name, "arme", points);
    }

    @Override
    public String toString() {
        return "Vous avez trouvé une " + type + ". Type : " + surpriseName + " Bonus : +" + bonusPoints + " point d'attaque !";
    }
}