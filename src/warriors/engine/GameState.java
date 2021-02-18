package warriors.engine;

import warriors.contracts.GameStatus;
import warriors.contracts.Hero;
import warriors.contracts.Map;

public class GameState implements warriors.contracts.GameState {

    private GameStatus gameStatus;
    private Hero hero;
    private Map map;

    private String playerName;
    private String lastLog;
    private int currentSquare;

    public GameState(String playerName, Hero hero, Map map) {
        this.playerName = playerName;
        this.hero = hero;
        this.map = map;

        this.lastLog = "Debut de partie !";
        this.currentSquare = 1;
        this.gameStatus = GameStatus.IN_PROGRESS;
    }

    @Override
    public String getPlayerName() {
        return playerName;
    }

    @Override
    public String getGameId() {
        return "thisIsAGameID";
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    @Override
    public Hero getHero() {
        return hero;
    }

    @Override
    public Map getMap() {
        return map;
    }

    @Override
    public String getLastLog() {
        return lastLog;
    }

    @Override
    public int getCurrentSquare() {
        return currentSquare;
    }

    public void setGameStatus(GameStatus newState) {
        this.gameStatus = newState;
    }
    public void setLastLog(String newState) {
        this.lastLog = newState;
    }
    public void setCurrentSquare(Integer newState) {
        this.currentSquare = newState;
    }
}

