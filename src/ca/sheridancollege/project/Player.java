/*
 * Title: War Card Game
 * Date: April 19, 2019
 * Program: Player.java
 * Description: A Player class that allows each player
 * to play a card and accounts for score.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Edmund
 */
public class Player {

    private int score;
    ArrayList<Card> playerHand = new ArrayList<>();

    public Player(ArrayList<Card> list) {
        playerHand.addAll(list);
    }

    public int getHandSize() {
        return playerHand.size();
    }

    public int getScore() {
        return score;
    }

    public Card playCard() {
        Card c1 = playerHand.get(playerHand.size() - 1);
        playerHand.remove(playerHand.size() - 1); 
        return c1;
    }
    
    //In a case of war, player removes three cards
    public void playWar() {
        for (int i = 0; i < 3; i++) {
            playerHand.remove(playerHand.size() - 1);
        }
    }

    //Scoring point for one round
    public void roundScore() {
        score += 1;
    }

    //Scoring point for winning war
    public void warScore() {
        score += 3;
    }
}
