/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HangmanApplication;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author juneau
 */
public class HangmanApplication {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to hangman! I will pick a word and you will try to gess "
                + "by character"
                + ".\n If you guess wrong 6 times, then I win. If you can guess it before then, you win. "
                + "Are you ready? I hope so because I am");
        System.out.println();
        System.out.println("I have picked my word. Below is a picture, and below "
                + "that is your current guess, which starts of as nothing.\n Every time you "
                + "guess incorrectly, I add a body part to the picture.\n When there is a full "
                + "person, you lose");
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay) {
            // setting up the game
            System.out.println("Alright! Let's play!");
            Hangman game = new Hangman();
            
            do {
                // Draw the things...
                System.out.println();
                System.out.println(game.drawPicture());
                System.out.println();
                System.out.println(game.getFormalCurrentGuess());
                System.out.println(game.mysteryWord);
                System.out.println();
                
                // Get the guess
                System.out.println("Enter a character that you think is in the word");
                char guess = (sc.next().toLowerCase()).charAt(0);
                System.out.println();
                // Check if the character is guessed already
                while (game.isGuessedAlready(guess)) {
                    System.out.println("Try again! you already guessed that charactor.");
                    guess = (sc.next().toLowerCase()).charAt(0);
                }
                
                // Play the guess
                if (game.playGuess(guess)) {
                    System.out.println("Great guess! That character is in the word!");
                } else {
                    System.out.println("Unfortunately that character is not in the word");
                }
                // Play the game
                
            }
            
            while (!game.gameOver()); // Keep playing until the game is over
            
            
            System.out.println();
            System.out.println("Do you want to play another game? Enter Y if you do.");
            Character response = (sc.next().toUpperCase()).charAt(0);
            doYouWantToPlay = (response == 'Y');
        }
    }
    
}
