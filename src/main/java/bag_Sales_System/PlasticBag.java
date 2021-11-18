package bag_Sales_System;


//We don't use abstract after the access modifier because the paperBag class is the concrete class
//The meaning of the concrete class it means we can create an object within the class

public class PlasticBag extends Bag{

    // Instance variable specific to PlasticBag
    private double tax;

    public void setTax(double tax){
        this.tax = tax;
    }
    public double getTax(){
        return tax;
    }

    public double getPrice(){
        double area = getLength() * getWidth();
        if (area > 250) {
            price = 3000;
        } else {
            price = 2000;
        }

        return price + tax;
    }

}
