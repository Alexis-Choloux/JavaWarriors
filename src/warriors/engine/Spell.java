package warriors.engine;

public class Spell extends Surprise {

    public Spell(String name, Integer points) {
        super(name, "sort", points);
    }

    @Override
    public String toString() {
        return "Vous avez trouvé un " + type + ". Type : " + surpriseName + " Bonus : +" + bonusPoints + " point d'attaque !";
    }
}
