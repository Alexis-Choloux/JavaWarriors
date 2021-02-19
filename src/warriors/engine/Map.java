package warriors.engine;
import java.util.ArrayList;
import java.util.List;

public class Map implements warriors.contracts.Map {
    private String mapName;
    private int numberOfSquares;

    private List<Square> mapSquares;

    public Map (String name, Integer squares) {
        mapName = name;
        numberOfSquares = squares;
        this.mapSquares = new ArrayList<>();
    }

    @Override
    public String getName() {
        return mapName;
    }
    @Override
    public int getNumberOfSquares() {
        return numberOfSquares;
    }

    public void addToMap(Square square, int index) {
        mapSquares.add(index, square);
    }

    public Square getSquareContent(int index) {
        return mapSquares.get(index);
    }
}
