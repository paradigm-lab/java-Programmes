package Game_of_dice;

import java.util.Random;
import java.util.Scanner;

public class Game {
    int numDice, trials;
    Random rand;
    Scanner scan;  // For "Enter" key

    public Game(int numDice, int trials) {
        this.numDice = numDice;
        this.trials = trials;
        rand = new Random();
        scan = new Scanner(System.in);
    }

    public int play(String who, int target) {
         int[] dice = new int[numDice];
         int points = 0;
         for (int i = 0; i < trials; i++) {
             for (int j = 0; j < numDice; j++) {
                 dice[j] = rand.nextInt(6) + 1; //1 to 6
             }
             System.out.println("Press Enter");
             scan.nextLine();
             for (int j : dice) {
                 System.out.print(j + " ");
             }
             System.out.println();
             for (int j = 0; j < numDice; j++) {
                 if (dice[j] == target) {
                     points++;
                 }
             }
         }
         System.out.println(who + " got " + points + " points");
         return points;
    }

}
