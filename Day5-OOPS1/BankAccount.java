// This program will define Instance Vs Static with example of BankAccount


public class BankAccount {
    private String holderName;  // Instance field and with object create copy of each object
    private double balance;     // Instance field and with object create copy of each object

    private static int totalAccounts; // Static field and this will share with all objects of entire class

    // Constructor for account creation using Holdername and initial balance
    public BankAccount(String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;

        totalAccounts++;
    }

    // Static method to check account opening is valid or not
    public static boolean isValidOpening(double amount) {
       return amount >= 0;
    }

    // Deposite method
    public void deposite(double amount){
        if (amount > 0) balance += amount;
    }

    // Withdraw method
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    // to see total balance on individual user
    public double checkBalance() {
        return balance;
    }

    // Static method to get total account number created and not requred object to call it
    // Using className.method name it will call

    public static int getTotalAccounts() {
        return  totalAccounts;
    }
}
