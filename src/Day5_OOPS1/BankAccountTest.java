package Day5_OOPS1;

// This program is linked with BankAccount.java all the class, constructor, methods are written there, and it can be accessed from here

 public class BankAccountTest {
    public static void main(String[] args){


        BankAccount b1 = new BankAccount("Vinay", 1000);

        if (BankAccount.isValidOpening(1000)) {
            System.out.println("Valid account opening for Vinay");
        } else {
            System.out.println("Not a valid account opening for Vinay");
        }

        BankAccount b2 = new BankAccount("Binod", 750);

        if (BankAccount.isValidOpening(750)) {
            System.out.println("Valid account opening for Binod");
        } else {
            System.out.println("Not a valid account opening for Binod");
        }

        b1.deposite(500);
        b2.withdraw(250);

        System.out.println("b1.checkBalance = " + b1.checkBalance());
        System.out.println("b2.checkBalance = " + b2.checkBalance());

        System.out.println("Total accounts in bank = " + BankAccount.getTotalAccounts());
    }
}
