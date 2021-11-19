package Bank_account;

public class bankAccount {
    private double balance;
    //We use the name instead of the account number
    private String name;

    //Having a constructor for the bank account object to get the name of the account
    public bankAccount(String name){
        this.name = name;
        balance = 0.0; //Not necessary
    }

    //Creating the methods to obtain the instance variable which are set to be private.(Getter and setter method)
    public double getBalance() {
        return balance;
    }
    public String getName(){
        return name;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println(name + "has Tsh." + balance);
    }

    public void withdraw(double amount){
        if (amount <= balance) {
            balance -= amount;
            System.out.println(name + " has $" + balance);
        } else {
            System.out.println("Withdrawal by" + name + " fails");
        }
    }

    public void transfer(double amount, bankAccount acc){
            if (this.balance < amount) {
                System.out.println("Transfer fails");
            } else {
                this.balance -= amount;
                acc.balance += amount;
                System.out.println("Account of " + this.name + " becomes Tsh" + this.balance);
                System.out.println("Account of " + acc.name + " becomes Tsh" + acc.balance);
            }
    }

}
