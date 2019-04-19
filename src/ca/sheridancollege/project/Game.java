/*
 * Title: War Card Game
 * Date: April 19, 2019
 * Program: Game.java
 * Description: A program that simulates a War Card Game 
 * between two players.
 */
package ca.sheridancollege.project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Edmund
 */
public class Game {

    public static void main(String[] args) throws IOException {

        boolean war = false;
        Scanner input = new Scanner(System.in);
        GroupOfCards deck = new GroupOfCards();
        ArrayList<Card> playerOneHand = new ArrayList<>(deck.playerOneDeck());
        ArrayList<Card> playerTwoHand = new ArrayList<>(deck.playerTwoDeck());
        Player playerOne = new Player(playerOneHand);
        Player playerTwo = new Player(playerTwoHand);
        Card card1 = playerOne.playCard();
        Card card2 = playerTwo.playCard();

            System.out.println("Player One: " + card1.toString() + "\n");
            System.out.println("Player Two: " + card2.toString() + "\n");

            if (card1.getRank().ordinal() == card2.getRank().ordinal()) {
                war = true;
                System.out.println("----------------WAR----------------\n");
                playerOne.playWar();
                playerTwo.playWar();
                card1 = playerOne.playCard();
                card2 = playerTwo.playCard();
                System.out.println("Player One: " + card1.toString() + "\n");
                System.out.println("Player Two: " + card2.toString() + "\n");

                if (card1.getRank().ordinal() > card2.getRank().ordinal()) {
                    playerOne.warScore();
                    System.out.println("Player One scores 3 point\n");
                } else if (card2.getRank().ordinal() > card1.getRank().ordinal()) {
                    playerTwo.warScore();
                    System.out.println("Player Two scores 3 point\n");
                }
            } else {
                war = false;
                if (card1.getRank().ordinal() > card2.getRank().ordinal()) {
                    playerOne.roundScore();
                    System.out.println("Player One scores 1 point\n");
                } else if (card2.getRank().ordinal() > card1.getRank().ordinal()) {
                    playerTwo.roundScore();
                    System.out.println("Player Two scores 1 point\n");
                }
            }
            
        System.out.println("End");
    }

}
