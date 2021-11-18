package average_stock_price;

public class driver {

    public static void main(String[] args) {
        /*
            ->Create a Stock class
            ->Record buying and selling of stock
            ->Update the share capital
            ->Update the average price of stock
        */
        //Creating an object for the stock class
        Stock abcCompany = new Stock();

        //Using the stock object to use the method in the stock class
        abcCompany.buy(36.6, 2000);
        abcCompany.buy(39.7, 3000);
        abcCompany.sell(42.9, 1000);

        System.out.println(abcCompany.getShares());
        System.out.println(abcCompany.getPrice());
        System.out.println(abcCompany.getAveragePrice());

    }
}
