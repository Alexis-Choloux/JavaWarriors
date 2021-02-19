package warriors.engine;

public class Potion extends Surprise {

    public Potion(String name, int lifeLevel) {
        this.name = name;
        this.lifeLevel = lifeLevel;
        this.type = "potion";
    }

    @Override
    public String toString() {
        return "      . Type : " + name + ". Bonus : +" + lifeLevel + " point de vie !";
    }

}
