/*
 * Title: War Card Game
 * Date: April 19, 2019
 * Program: Card.java
 * Description: A class that represents the Card assigned to a rank and suit.
 */
package ca.sheridancollege.project;

/**
 *
 * @author Edmund
 */
public class Card {
    public enum Rank {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
    public enum Suit {DIAMONDS, CLUBS, HEARTS, SPADES};
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
