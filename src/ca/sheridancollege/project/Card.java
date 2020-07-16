
/**
 * SYST 17796 Project Summer 2020 Group Project
 * This is the class card to set the total of card and the cards value,
 * shuffling the cards to distribute to the each player.
 */
package ca.sheridancollege.project;

/**
 * @author Vicky Law
 * @since Jul, 2020
 */

// Create abstract card //
//public abstract class Card {

    // Create abstract card method //
   // public abstract void cards();
 
    // Create an array for the cardValue which includes total 52 cards //
    //int [] cardValue = new int [52];
    
    // Create an array for storing the cards value after randomizing //
    //int [] randomNumArray = new int[14];
    
//}

// Create a hierarchy class of the class Card //
//class LoopForValue extends Card {
class Card extends Game {
    

    // Create a cards method //
    public void cards() {
        
        // To Loop the array cardValue which the values only between 1 to 13 //
        for (int cardValue = 1; cardValue <= 13; cardValue++) {
            
           // To Loop the cardValue each for four times //
           for (int repeatValue = 1; repeatValue <= 4; repeatValue++) {
                 
               System.out.print(cardValue + " "); // testing 
              
              // To random the cardValue and store it in the array randomNumArray //
             randomNumArray[cardValue] = (int)(Math.random() * cardValue) + 1;
            }
      
           System.out.println(randomNumArray[cardValue]); // testing
   
           }
           
           System.out.println(randomNumArray[9]);  // testing
           System.out.println(randomNumArray[10]); // testing
           System.out.println(randomNumArray[11]); // testing
           System.out.println(randomNumArray[12]); // testing
           System.out.println(randomNumArray[13]); // testing
                 
       }
     
   }

// Create a main class for printing //
class Main {

    public static void main(String[] args) {
        
        // Create new card //
        Game a = new Card();
        // Call the method cards //
         a.cards();

    }

}

//default modifier for child classes
/**
 * Students should implement this method for their specific children classes
 *
 * @return a String representation of a card. Could be an UNO card, a regular
 * playing card etc.
 */
//   @Override
//    public abstract String toString();
//    
//}