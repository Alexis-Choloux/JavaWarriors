package warriors.engine;

import warriors.contracts.*;
import warriors.contracts.GameState;
import warriors.contracts.Hero;
import warriors.contracts.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Warriors implements WarriorsAPI {
    private List<Hero> heroesList;
    private List<Map> mapList;
    warriors.engine.GameState gameState;
    int diceResult;

    public Warriors() {
        this.heroesList = new ArrayList<>();
        Hero nouveauHeros1 = new Warrior("Alexios", 7, 10);
        Hero nouveauHeros2 = new Warrior("Joanus", 8, 9);
        Hero nouveauHeros3 = new Wizard("ProfesseurHugo", 5, 14);
        Hero nouveauHeros4 = new Wizard("MaitreYoda", 4, 15);
        heroesList.add(nouveauHeros1);
        heroesList.add(nouveauHeros2);
        heroesList.add(nouveauHeros3);
        heroesList.add(nouveauHeros4);

        this.mapList = new ArrayList<>();

        warriors.engine.Map newMap1 = new warriors.engine.Map("Pepinieros", 64);

        Enemy goblin = new Enemy(6,1);
        Square squareGoblin = new Square(goblin);
        Enemy sorcerer = new Enemy(9,2);
        Square squareSorcerer = new Square(sorcerer);
        Enemy dragon = new Enemy(9,2);
        Square squareDragon = new Square(dragon);

//        Weapon arc = new Weapon("arc", 1);

        newMap1.addToMap(squareGoblin,3);
        newMap1.addToMap(squareGoblin,6);
        newMap1.addToMap(squareGoblin,9);
        newMap1.addToMap(squareGoblin,12);
        newMap1.addToMap(squareGoblin,15);
        newMap1.addToMap(squareGoblin,18);
        newMap1.addToMap(squareGoblin,21);
        newMap1.addToMap(squareGoblin,24);
        newMap1.addToMap(squareGoblin,27);
        newMap1.addToMap(squareGoblin,30);
        newMap1.addToMap(squareSorcerer,10);
        newMap1.addToMap(squareSorcerer,20);
        newMap1.addToMap(squareSorcerer,25);
        newMap1.addToMap(squareSorcerer,32);
        newMap1.addToMap(squareSorcerer,35);
        newMap1.addToMap(squareSorcerer,36);
        newMap1.addToMap(squareSorcerer,37);
        newMap1.addToMap(squareSorcerer,40);
        newMap1.addToMap(squareSorcerer,44);
        newMap1.addToMap(squareSorcerer,47);
        newMap1.addToMap(squareDragon,45);
        newMap1.addToMap(squareDragon,52);
        newMap1.addToMap(squareDragon,56);
        newMap1.addToMap(squareDragon,62);

        mapList.add(newMap1);
    }


    @Override
    public List<Hero> getHeroes() {
        return heroesList;
    }

    @Override
    public List<Map> getMaps() {
        return mapList;
    }

    @Override
    public GameState createGame(String playerName, Hero hero, Map map) {
        gameState = new warriors.engine.GameState(playerName, hero, map);
        return gameState;
    }

    @Override
    public GameState nextTurn(String gameID) {

        //générer un résultat de dé entre 1 et 6               pas de system out, stocker dans lastlog
        diceResult = diceRoll();
        //déplacer le perso et afficher la case actuelle
        gameState.setCurrentSquare(gameState.getCurrentSquare() + diceResult);
        if (gameState.getCurrentSquare() >= 64) {
            gameState.setCurrentSquare(64);
            gameState.setLastLog("Vous avez fait un " + diceResult + " et vous êtes sur la case " + gameState.getCurrentSquare() + ", vous êtes arrivés");
            gameState.setGameStatus(GameStatus.FINISHED);
        } else {
            gameState.setLastLog("Vous avez fait un " + diceResult + " et vous êtes sur la case " + gameState.getCurrentSquare());
        }
        return gameState;
    }

    private int diceRoll() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
}