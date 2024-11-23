package ca.sheridancollege.project;

/**
 * A class that represents a player in the game.
 * Players have a unique name and can perform actions in the game.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Player {

    private String name; // The unique name of the player

    public Player(String name) {
        this.name = name;
    }

    /**
     * Get the name of the player.
     * 
     * @return the player's name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the player.
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A placeholder method to simulate a player taking an action. 
     * This should be overridden in specific player classes (e.g., HumanPlayer, AIPlayer).
     */
    public abstract void play();
}
