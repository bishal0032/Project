package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Represents a group of cards, such as a deck or discard pile. 
 * This class can be further extended to model specific card groups.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards {

    private ArrayList<Card> cards; // The list of cards in the group
    private int size; // The maximum size of the group of cards

    public GroupOfCards(int size) {
        this.size = size;
        this.cards = new ArrayList<>();
    }

    /**
     * Add a card to the group of cards.
     * 
     * @param card the card to add
     */
    public void addCard(Card card) {
        if (cards.size() < size) {
            cards.add(card);
        }
    }

    /**
     * Shuffle the cards in the group.
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * Get the list of cards in the group.
     * 
     * @return the list of cards
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    /**
     * Get the size of the group.
     * 
     * @return the size of the group
     */
    public int getSize() {
        return size;
    }

    /**
     * Set the maximum size of the group.
     * 
     * @param size the new size for the group
     */
    public void setSize(int size) {
        this.size = size;
    }
}
