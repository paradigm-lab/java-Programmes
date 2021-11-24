package gift_box_weight;

import java.util.ArrayList;

public class gift {
    public static void main(String[] args) {
        /*
        Gift box Weight checker
        -> Create Biscuits, Chocolate instance
        -> Put a number of these instance into a GiftBox instance using ArrayLists
        -> Check if the gift box is overweight
            -> Return the content of the overweight gift boxes
         */

        ArrayList<GiftBox> boxes = new ArrayList<GiftBox>();

        // The first biscuits, chocolate and the chocolate Flavors
        double[] biscuitsWeights1 = {200.0, 100.0};         // 2 Biscuit set
        double[] chocolateWeights1 = {200.0, 100.0};        // 2 Chocolate sets
        String[] chocolateFlavors1 = {"Mint", "Orange"};    // Chocolate Flavours
        // Adding the array list into the GiftBox constructor
        boxes.add(new GiftBox(biscuitsWeights1, chocolateWeights1, chocolateFlavors1));

        double[] biscuitsWeights2 = {300.0, 100.0, 100.0};
        double[] chocolateWeights2 = {200.0, 100.0, 300.0};
        String[] chocolateFlavors2 = {"Milk", "Coffee", "Vanilla"};

        boxes.add(new GiftBox(biscuitsWeights2, chocolateWeights2, chocolateFlavors2));

        //  Checking the weight of each gift box object
        for(GiftBox box : boxes) {
            if(box.getWeight() > 1000.0) {
                System.out.println("The box with " + box.getNumBiscuits() + " biscuits and " + box.getNumChocolate() + " chocolate is overweight");
                System.out.print("The biscuit weights are: ");
                box.showBiscuitsWeights();
                System.out.println("The chocolate weight are: ");
                box.showChocolateWeights();
                System.out.print("The chocolate flavors are: ");
                box.showChocolateFlavors();
                System.out.println();
            }
        }

    }
}
