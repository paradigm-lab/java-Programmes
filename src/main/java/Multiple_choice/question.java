package Multiple_choice;

import java.util.ArrayList;
import java.util.Collections;

public class question {
    private String question;
    private ArrayList<String> choices;
    private String answer;

    public question(String question, String[] choices, String answer) {
        this.question = question;
        this.choices = new ArrayList<String>();
        for (int i = 0; i < choices.length; i++) {
            this.choices.add(choices[i]);
        }
        // Make sure each game shows question in different order
        Collections.shuffle(this.choices);
        this.answer = answer;
    }


    // The getter method for the question class
    public String getQuestion() {
        return question;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public String getAnswer() {
        return answer;
    }

}
