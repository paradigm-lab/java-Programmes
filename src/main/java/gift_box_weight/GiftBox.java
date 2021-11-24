package gift_box_weight;

import java.util.ArrayList;

public class GiftBox {
    private ArrayList<Biscuits> biscuitsSet;
    private ArrayList<Chocolate> ChocolateSet;
    private double weight;


    public GiftBox(double[] biscuitsWeights, double[] chocolatesWeight, String[] chocolateFlavours) {
        biscuitsSet = new ArrayList<Biscuits>();
        ChocolateSet = new ArrayList<Chocolate>();
        for (int i = 0; i < biscuitsWeights.length; i++) {
            Biscuits pack = new Biscuits(biscuitsWeights[i]);
            biscuitsSet.add(pack);
            weight += pack.getWeight();
        }

        for (int i = 0; i < chocolatesWeight.length; i++) {
            Chocolate pack = new Chocolate(chocolatesWeight[i], chocolateFlavours[i]);
            ChocolateSet.add(pack);
            weight += pack.getWeight();
        }
    }

    //The getter method for the ArrayList and the weight
    public int getNumBiscuits() {
        return biscuitsSet.size();
    }

    public int getNumChocolate() {
        return ChocolateSet.size();
    }

    public double getWeight() {
        return weight;
    }

    public void showBiscuitsWeights() {
        for (Biscuits biscuit : biscuitsSet){
            System.out.print(biscuit.getWeight() + " ");
        }
    }

    public void showChocolateWeights() {
        for (Chocolate chocolate : ChocolateSet) {
            System.out.print(chocolate.getWeight() + " ");
        }
    }

    public void showChocolateFlavors() {
        for (Chocolate chocolate : ChocolateSet) {
            System.out.print(chocolate.getFlavor() + " ");
        }
    }
}
