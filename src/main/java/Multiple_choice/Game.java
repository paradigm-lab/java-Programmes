package Multiple_choice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private ArrayList<question> questionSet;

    public Game() {
        questionSet = new ArrayList<question>();

        String q = "Where does the Sun rise? ";

        //We don't use the new keyword because the array is initialized to compile time of the program
        String[] a = {"East", "South", "West", "North"};
        questionSet.add(new question(q, a, "East"));

        //We use the same q variable and the mechanism of the java garbage collection will remove the q
        q = "Who invented the telephone? ";
        //We use the new String keyword to initialize another new String array
        //Must reuse variable with new String[]
        //Array constants can only be used during initialization
        a = new String[]{"Thomas Edison", "Michael Faraday", "James Watt", "Alexander Bell"};
        questionSet.add(new question(q, a, "Alexander Bell"));


        //The third Question
        q = "Where is the capital city of Japan? ";
        a = new String[]{"Beijing", "Tokyo", "Seoul", "Bangkok"};
        questionSet.add(new question(q, a, "Tokyo"));

        Collections.shuffle(questionSet, new Random());
    }

        public void start() {
            Scanner scan = new Scanner(System.in);
            int numCorrect = 0;
            // Show questions from questionSet
            for (int question = 0; question < questionSet.size(); question++) {
                System.out.println(questionSet.get(question).getQuestion());
                int numChoices = questionSet.get(question).getChoices().size();
                //Show the choices from questions in questionSet

                for (int choice = 0; choice < numChoices; choice++) {
                    System.out.println((choice + 1) + ": " + questionSet.get(question).getChoices().get(choice));
                }
                int playerAnswer = scan.nextInt();
                ArrayList<String> choiceSet = questionSet.get(question).getChoices();
                String correctAnswer = questionSet.get(question).getAnswer();
                int correctAnswerIndex = choiceSet.indexOf(correctAnswer);
                if (playerAnswer == correctAnswerIndex + 1) {
                    numCorrect++;
                }
            }
            scan.close();
            System.out.println("You got " + numCorrect + " correct answer(s).");
        }
}
