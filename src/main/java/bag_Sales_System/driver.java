package bag_Sales_System;

public class driver {

    public static void main(String[] args) {
    /*
        Bag sales system
        -> Create Bag class, an abstract class
        -> Create concrete PaperBag and PlasticBag classes from Bag
        -> Set selling price according to size, materials and tax
    */

        //We never make the constructor for any of the class, so we use the default constructor
        paperBag Paperbag = new paperBag();

        Paperbag.setLength(10.0);
        Paperbag.setWidth(10.0);
        System.out.println(Paperbag.getPrice());

    }
}
