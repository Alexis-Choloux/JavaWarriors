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

        Weapon arc = new Weapon("arc", 1);
        Square caseArc = new Square(arc);
        Weapon massue = new Weapon("massue", 3);
        Square caseMassue = new Square(massue);
        Weapon epee = new Weapon("epee", 5);
        Square caseEpee = new Square(epee);
        Spell eclair = new Spell("eclair", 2);
        Square caseEclair = new Square(eclair);
        Spell bouledefeu = new Spell("boule de feu", 7);
        Square caseBouleDeFeu = new Square(bouledefeu);
        Potion potionMineure = new Potion("potion mineure", 1);
        Square casePotionMineure = new Square(potionMineure);
        Potion potionStandard = new Potion("potion standard", 2);
        Square casePotionstandard = new Square(potionStandard);
        Potion potionGrande = new Potion("grande potion", 5);
        Square caseGrandePotion = new Square(potionGrande);

        Event empty = new Event();
        Square EmptySquare = new Square(empty);

        newMap1.addToMap(EmptySquare, 0);
        newMap1.addToMap(caseEclair, 1);
        newMap1.addToMap(caseArc, 2);
        newMap1.addToMap(new Square(new Enemy("gobelin", 1, 6)), 3);
        newMap1.addToMap(caseEclair, 4);
        newMap1.addToMap(caseMassue, 5);
        newMap1.addToMap(new Square(new Enemy("gobelin", 1, 6)), 6);
        newMap1.addToMap(casePotionMineure, 7);
        newMap1.addToMap(caseEclair, 8);
        newMap1.addToMap(new Square(new Enemy("gobelin", 1, 6)), 9);
        newMap1.addToMap(new Square(new Enemy("sorcier", 2, 9)), 10);
        newMap1.addToMap(caseArc, 11);
        newMap1.addToMap(new Square(new Enemy("gobelin", 1, 6)), 12);
        newMap1.addToMap(casePotionMineure, 13);
        newMap1.addToMap(caseArc, 14);
        newMap1.addToMap(new Square(new Enemy("gobelin", 1, 6)), 15);
        newMap1.addToMap(EmptySquare, 16);
        newMap1.addToMap(caseEclair, 17);
        newMap1.addToMap(new Square(new Enemy("gobelin", 1, 6)), 18);
        newMap1.addToMap(caseArc, 19);
        newMap1.addToMap(new Square(new Enemy("sorcier", 2, 9)), 20);
        newMap1.addToMap(new Square(new Enemy("gobelin", 1, 6)), 21);
        newMap1.addToMap(caseMassue, 22);
        newMap1.addToMap(caseEclair, 23);
        newMap1.addToMap(new Square(new Enemy("gobelin", 1, 6)), 24);
        newMap1.addToMap(new Square(new Enemy("sorcier", 2, 9)), 25);
        newMap1.addToMap(caseArc, 26);
        newMap1.addToMap(new Square(new Enemy("gobelin", 1, 6)), 27);
        newMap1.addToMap(casePotionMineure, 28);
        newMap1.addToMap(casePotionMineure, 29);
        newMap1.addToMap(new Square(new Enemy("gobelin", 1, 6)), 30);
        newMap1.addToMap(casePotionstandard, 31);
        newMap1.addToMap(new Square(new Enemy("sorcier", 2, 9)), 32);
        newMap1.addToMap(casePotionMineure, 33);
        newMap1.addToMap(EmptySquare, 34);
        newMap1.addToMap(new Square(new Enemy("sorcier", 2, 9)), 35);
        newMap1.addToMap(new Square(new Enemy("sorcier", 2, 9)), 36);
        newMap1.addToMap(new Square(new Enemy("sorcier", 2, 9)), 37);
        newMap1.addToMap(caseMassue, 38);
        newMap1.addToMap(casePotionstandard, 39);
        newMap1.addToMap(new Square(new Enemy("sorcier", 2, 9)), 40);
        newMap1.addToMap(caseGrandePotion, 41);
        newMap1.addToMap(caseEpee, 42);
        newMap1.addToMap(casePotionstandard, 43);
        newMap1.addToMap(new Square(new Enemy("sorcier", 2, 9)), 44);
        newMap1.addToMap(new Square(new Enemy("dragon", 4, 15)), 45);
        newMap1.addToMap(EmptySquare, 46);
        newMap1.addToMap(new Square(new Enemy("sorcier", 2, 9)), 47);
        newMap1.addToMap(caseBouleDeFeu, 48);
        newMap1.addToMap(caseBouleDeFeu, 49);
        newMap1.addToMap(EmptySquare, 50);
        newMap1.addToMap(EmptySquare, 51);
        newMap1.addToMap(new Square(new Enemy("dragon", 4, 15)), 52);
        newMap1.addToMap(caseEpee, 53);
        newMap1.addToMap(EmptySquare, 54);
        newMap1.addToMap(EmptySquare, 55);
        newMap1.addToMap(new Square(new Enemy("dragon", 4, 15)), 56);
        newMap1.addToMap(EmptySquare, 57);
        newMap1.addToMap(EmptySquare, 58);
        newMap1.addToMap(EmptySquare, 59);
        newMap1.addToMap(EmptySquare, 60);
        newMap1.addToMap(EmptySquare, 61);
        newMap1.addToMap(new Square(new Enemy("dragon", 4, 15)), 62);
        newMap1.addToMap(EmptySquare, 63);
        newMap1.addToMap(EmptySquare, 64);

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

        String message = "";

        //générer un résultat de dé entre 1 et 6               pas de system out, stocker dans lastlog
        diceResult = diceRoll();

        warriors.engine.Map map = (warriors.engine.Map) gameState.getMap();

        //déplacer le perso et afficher la case actuelle
        gameState.setCurrentSquare(gameState.getCurrentSquare() + diceResult);


        if (gameState.getCurrentSquare() >= 64) {
            gameState.setCurrentSquare(64);
            gameState.setLastLog("Vous avez fait un " + diceResult + " et vous êtes sur la case " + gameState.getCurrentSquare() + ", vous êtes arrivés");
            gameState.setGameStatus(GameStatus.FINISHED);
        } else {
            Square currentSquare = map.getSquareContent(gameState.getCurrentSquare());
            String squareType = currentSquare.getEvent().getType();

            switch (squareType) {
                case "ennemi":
                    Event enemy = currentSquare.getEvent();

                break;
                case "potion":

                break;
                case "sort":

                    break;
                case "arme":

                    break;
                default:

                    break;
            }
            gameState.setLastLog(message);
//            "Vous avez fait un " + diceResult + " et vous êtes sur la case " + gameState.getCurrentSquare() + "\nC'est une case " +  squareType
        }
        return gameState;
    }

    private int diceRoll() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
}