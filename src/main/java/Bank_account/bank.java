package Bank_account;

public class bank {
    public static void main(String[] args) {
        /*
            Bank Account with transfer
            -> Create a BankAccount object
            -> A bank account and sava and withdraw money
            -> It can transfer money to other accounts
        */

        bankAccount collins = new bankAccount("Collins");
        collins.deposit(50000);

        bankAccount matt = new bankAccount("Matt");
        matt.deposit(100000);

        collins.transfer(10000, matt);
        matt.withdraw(100000);
        matt.withdraw(20000);

        System.out.println(matt.getBalance());


    }

}
