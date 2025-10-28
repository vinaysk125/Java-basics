package Week2;
import java.util.Scanner;

public class BankOperations1_Simple {
    static class BankAccount {
        int accountNumber;
        String accountHolderName;
        double balance;
        String accountType;

        BankAccount() {
            accountNumber = 00000;
            accountHolderName = "Unknown";
            balance = 00.00;
            accountType = "NULL";
        }

        BankAccount (int accNumber, String accHolderName, double bal, String accType) {
            this.accountNumber = accNumber;
            this.accountHolderName = accHolderName;
            this.balance = bal;
            this.accountType = accType;
        }

        BankAccount (BankAccount CopyAccount) {
            this.accountNumber = CopyAccount.accountNumber;
            this.accountHolderName = CopyAccount.accountHolderName;
            this.balance = CopyAccount.balance;
            this.accountType = CopyAccount.accountType;
        }

        void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Please enter more than 0 to deposit");
            } else {
                balance = balance + amount;
                System.out.println(amount + " Added in your account. And total balance is = " + balance);
            }
        }

        void withdraw(double amount) {
            if(balance == 0 && amount > balance) {
                System.out.println("You don't have enough balance to withdraw");
            } else {
                balance = balance - amount;
                System.out.println("You withdraw = " + amount + " Your total balance after withdraw = " + balance);
            }
        }

        void displayAccountInfo() {
            System.out.println("your account type = " + accountType);
            System.out.println("your accountNumber = " + accountNumber);
            System.out.println("your account holderName = " + accountHolderName);
            System.out.println("your account balance = " + balance);
        }
    }

public static void main(String[] args) {
//        BankAccount BankAccount1 = new BankAccount();
//        BankAccount1.displayAccountInfo();
//
//        BankAccount BankAccount2 = new BankAccount(10001, "Vinay", 100000, "Saving");
//        System.out.println();
//        BankAccount2.displayAccountInfo();
//
//        BankAccount BankAccount3 = new BankAccount(BankAccount2);
//        System.out.println("\n It is copy of BankAccount2 information to BankAccount3");
//        BankAccount3.displayAccountInfo();
//
//        BankAccount2.deposit(20000);
//        BankAccount2.withdraw(20000);

    // User input

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter accountType = ");
    String accountType = sc.nextLine();
    System.out.println("Enter account holder name = ");
    String accountHolderName = sc.nextLine();
    System.out.println("Enter account number = ");
    int accountNumber = sc.nextInt();
    System.out.println("Enter initial account opening balance = ");
    double balance = sc.nextDouble();

    BankAccount bankPerson1 = new BankAccount(accountNumber, accountHolderName, balance, accountType);
    bankPerson1.displayAccountInfo();

    bankPerson1.deposit(1000);
    bankPerson1.withdraw(1000);
}
}
