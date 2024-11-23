package ca.sheridancollege.project;

/**
 * A base class representing a card in any card game.
 * Students should subclass this class to create specific types of cards for their game.
 * For example, a card game like UNO or Poker might have different types of cards.
 *
 * @author dancye
 */
public abstract class Card {

    /**
     * @return a string representation of the card. Students should override this method in child classes.
     */
    @Override
    public abstract String toString();

    /**
     * Get the type of the card (e.g., "Heart", "Spade", "Action", etc.)
     * 
     * @return the type of card
     */
    public abstract String getCardType();
}
