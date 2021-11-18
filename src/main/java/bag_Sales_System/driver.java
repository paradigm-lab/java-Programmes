package bag_Sales_System;

public class driver {

    public static void main(String[] args) {
    /*
        Bag sales system
        -> Create Bag class, an abstract class
        -> Create concrete PaperBag and PlasticBag classes from Bag
        -> Set selling price according to size, materials and tax
    */

        System.out.println("\t \t The Bag sales system. \n");

        //We never make the constructor for any of the class, so we use the default constructor
        paperBag Paperbag = new paperBag();

        Paperbag.setLength(10.0);
        Paperbag.setWidth(10.0);
        System.out.println("The price for the Paper Bag: " + Paperbag.getPrice());

        PlasticBag plasticBag = new PlasticBag();
        plasticBag.setLength(40.0);
        plasticBag.setWidth(10.0);
        plasticBag.setTax(0.2);
        System.out.println("The tax is: " + plasticBag.getTax() + " The total price is: " + plasticBag.getPrice());


    }
}
