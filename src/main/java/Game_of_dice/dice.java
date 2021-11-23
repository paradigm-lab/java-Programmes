package Game_of_dice;

import java.util.Scanner;
import java.util.Random;

public class dice {
    public static void main(String[] args){
        /*
        Game of 3 dice
        -> You choose a number and remember it
        -> Throw 3 dice for five times => 15 numbers
        -> Count the number of occurrences of your chosen number
        -> Computer takes your role and play the same game
        -> If you get more chosen numbers that the computer does, you win
         */

        int numDice = 3, trials = 5;
        int playerPoints = 0, computerPoints = 0;
        Random choice = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your target number: ");
        int playerTarget = scan.nextInt();

        // Creating the game object
        Game player = new Game(numDice, trials);
        playerPoints = player.play("Player", playerTarget);

        int computerTarget = choice.nextInt(6) + 1;  //1 to 6
        System.out.println("Computer's target is " + computerTarget);
        Game computer = new Game(numDice, trials);
        computerPoints = computer.play("Computer", computerTarget);

        if (playerPoints > computerPoints){
            System.out.println("You win");
        }
        else if(playerPoints < computerPoints) {
            System.out.println("Computer wins");
        }
        else {
            System.out.println("Draw");
        }
        scan.close();
    }
}
