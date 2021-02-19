package warriors.engine;

public class Potion extends Surprise {

    public Potion(String name, Integer points) {
        super(name, "potion", points);
    }

    @Override
    public String toString() {
        return "Vous avez trouvé une " + type + ". Type : " + surpriseName + " Bonus : +" + bonusPoints + " point de vie !";
    }
}
