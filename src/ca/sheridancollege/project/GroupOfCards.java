/*
 * Title: War Card Game
 * Date: April 19, 2019
 * Program: GroupOfCards.java
 * Description: A class that assigns the cards to a deck and 
 * divides the deck in half for two players.
 */
package ca.sheridancollege.project;

import java.util.*;

/**
 *
 * @author Edmund
 */
public class GroupOfCards {

    //The playing deck will have 52 cards
    private final static int DECK_SIZE = 52;
    private Card[] cards = new Card[DECK_SIZE];
    private ArrayList<Card> cardDeck;

    //Assigning each card with a suit and rank
    public GroupOfCards() {
        int i = 0;
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards[i] = (new Card(suit, rank));
                i++;
            }
        }
        
        //Using the shuffle method to rearrange the deck
        cardDeck = new ArrayList<>(Arrays.asList(cards));
        Collections.shuffle(cardDeck);
    }

    //Assigning first half of the deck to playerOne
    public List<Card> playerOneDeck() {
        return cardDeck.subList(0, 25);
    }

    //Assigning second half of the deck to playerTwo
    public List<Card> playerTwoDeck() {
        return cardDeck.subList(26, 51);
    }
    
}
