package Week1.AccessModifiersBanking;

public class Account {
    // Field/variable
    public int accountNumber;
    protected double balance;
    String type;
    private String password;

    // Constructor to define fields
    public Account(int accountNumber, double balance, String type, String password){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.type = type;
        this.password = password;
    }
    public void displayDetails(){
        System.out.println("Account " + accountNumber + " has balance = ₹" + balance);
    }
}
