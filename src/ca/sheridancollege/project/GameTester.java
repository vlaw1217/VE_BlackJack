package ca.sheridancollege.project;
import java.util.Scanner;
/**
 * This Class +++INsert Description Here+++
 *
 * @author Vicky Law
 * @since Jul 2020
 */
public class GameTester {

    public static void main(String[] args) {
        
        // Create Scanner //
        Scanner in = new Scanner (System.in);
        
        // Prompt user to enter their name //
        System.out.print("Please enter your name: ");
        
        // Read the user enter name //
        String playerName = in.nextLine(); 
        
        // Greeting //
        System.out.println(playerName + ", " + " Welcome to VE_blackjack!");
        
        // Ask player to start the game //
        System.out.print("Ready to start the game? ? Y/N ");
        char answer = in.next().charAt(0);
        
        
        
        
    }
}
