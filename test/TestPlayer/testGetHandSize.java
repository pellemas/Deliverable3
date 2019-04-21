/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPlayer;


import ca.sheridancollege.project.Card;
import ca.sheridancollege.project.GroupOfCards;
import ca.sheridancollege.project.Player;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MP-_-44
 */
public class testGetHandSize {
    
    @Test
    public void testGetHandSize() {
        System.out.println("test getHandSize");
        GroupOfCards deck = new GroupOfCards();
        ArrayList<Card> testHand = new ArrayList<>(deck.playerOneDeck());
        Player testPlayer = new Player(testHand);
        int expResult = 25;
        int result = testPlayer.getHandSize();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPlayCard() {
        System.out.println("test playCard");
        GroupOfCards deck = new GroupOfCards();
        ArrayList<Card> testHand = new ArrayList<>(deck.playerOneDeck());
        Player testPlayer = new Player(testHand);
        Card card = testPlayer.playCard();
        int expResult = 24;
        int result = testPlayer.getHandSize();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPlayerDeck() {
        System.out.println("test getPlayerDeck");
        GroupOfCards deck = new GroupOfCards();
        ArrayList<Card> testHand = new ArrayList<>(deck.playerOneDeck());
        int expResult = 25;
        int result = testHand.size();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPlayWar() {
        System.out.println("test playCard");
        GroupOfCards deck = new GroupOfCards();
        ArrayList<Card> testHand = new ArrayList<>(deck.playerOneDeck());
        Player testPlayer = new Player(testHand);
        testPlayer.playWar();
        Card card = testPlayer.playCard();
        int expResult = 21;
        int result = testPlayer.getHandSize();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRoundScore() {
        System.out.println("test roundScore");
        GroupOfCards deck = new GroupOfCards();
        ArrayList<Card> testHand = new ArrayList<>(deck.playerOneDeck());
        Player testPlayer = new Player(testHand);
        testPlayer.roundScore();
        int expResult = 1;
        int result = testPlayer.getScore();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testWarScore() {
        System.out.println("test warScore");
        GroupOfCards deck = new GroupOfCards();
        ArrayList<Card> testHand = new ArrayList<>(deck.playerOneDeck());
        Player testPlayer = new Player(testHand);
        testPlayer.warScore();
        int expResult = 3;
        int result = testPlayer.getScore();
        assertEquals(expResult, result);
    }
}
