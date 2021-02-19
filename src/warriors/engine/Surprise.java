package warriors.engine;

public class Surprise extends Event {
    protected String surpriseName;
    protected int bonusPoints;

    public Surprise (String name, String type, Integer points) {
        super(type);
        surpriseName = name;
        bonusPoints = points;
    }

    public String getName() {
        return surpriseName;
    }
    public int getBonusPoints() {
        return bonusPoints;
    }
}
