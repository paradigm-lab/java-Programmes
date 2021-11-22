package Draw_staircases;

public class staircases {
    /*
     Draw staircases
     -> Given number of steps and step width
     -> Draw steps using for loops
     -> Steps = 5 and width = 3
     */
    public static void main(String[] args) {
        int numSteps = 5;
        int stepWidth = 3;

        //Printing the rows
        for (int i = 0; i < numSteps; i++) {
            //Printing the column
            for (int j = 0; j < (i + 1) * stepWidth; j++) {
                System.out.print("*");
            }
            // Change the row
            System.out.println();
        }

    }
}
