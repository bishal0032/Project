package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A class representing a base game. Extend this class to define specific games with game rules and logic.
 * Students can define more specific games by overriding methods like play() and declareWinner().
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Game {

    private final String name; // The name of the game
    private ArrayList<Player> players; // List of players in the game

    public Game(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    /**
     * Get the name of the game.
     * 
     * @return the name of the game
     */
    public String getName() {
        return name;
    }

    /**
     * Get the list of players in this game.
     * 
     * @return a list of players
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * Add a player to the game.
     * 
     * @param player the player to be added
     */
    public void addPlayer(Player player) {
        this.players.add(player);
    }

    /**
     * Set the players for the game.
     * 
     * @param players the list of players to set
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Start the game. This is just a placeholder method to be overridden in specific game types.
     */
    public abstract void play();

    /**
     * Declare the winner of the game once it's over.
     */
    public abstract void declareWinner();

}
