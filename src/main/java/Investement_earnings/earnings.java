package Investement_earnings;

import java.util.Scanner;

public class earnings {
    public static void main(String[] args) throws Exception {
        /*
        Investment earning
        -> Enter the buying price per share
        -> Enter closing price on subsequent days
        -> Calculate aggregate earnings/losses after each
        -> Leave program when closing price is negative
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your buying price per share: ");
        double buyingPrice = 0.0;
        buyingPrice = scan.nextDouble();
        int day = 1;

        double closingPrice = 0.1;
        while (true) {
            System.out.println("Enter the closing price for day: " + day + " (any negative value to leave: ");
            closingPrice = scan.nextDouble();
            if (closingPrice < 0.0) {
                break;
            }
            double earnings = closingPrice - buyingPrice;
            if (earnings > 0.0) {
                System.out.println("After day " + day + ", you earned" + earnings + " per share.");
            }
            else if (earnings < 0.0) {
                System.out.println("After day " + day + ", you lost " + (-earnings) + " per share");
            }
            else {
                System.out.println("After day " + day + ", you have " + " no earnings per share.");
            }
            day++;
        }
        scan.close();
    }
}
