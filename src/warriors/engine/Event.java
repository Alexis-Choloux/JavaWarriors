package warriors.engine;

public class Event {
    protected String type;

    public Event(){
        this.type ="vide";
    }

    public Event (String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
