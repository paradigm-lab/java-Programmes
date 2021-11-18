package bag_Sales_System;

//We don't use abstract after the access modifier because the paperBag class is the concrete class
//The meaning of the concrete class it means we can create an object within the class

public class paperBag extends Bag{

    //We extend to the abstract class, so we need to implement the getPrice() method
    public double getPrice(){
        //The length and width are private to bag class(Encapsulated)
        //We need getter method to obtain them because there access modifier are public
        double area = getLength() * getWidth();
        if (area > 300.0) {
            price = 10000;
        } else {
            price = 9000;
        }
        return price;
    }

}
