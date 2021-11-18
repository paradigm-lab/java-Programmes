package bag_Sales_System;

public abstract class Bag {
    private double length;
    private double width;

    // Subclass can access "Price" directly
    protected double price;

    //Getter and Setter method to handle the length and the width
    //The getter and setter method for the length
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    //The getter and setter method for the width
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    // Abstract method
    public abstract double getPrice();

}
