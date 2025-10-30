package Week2;

public class Encapsulation_BankAccount1 {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public void getAccountInfo() {
        System.out.println("Account number = " + accountNumber);
        System.out.println("Account name = " + accountHolderName);
        System.out.println("Account balance = " + balance);
    }

    public void setAccountInfo(String number, String name, double bal) {
        this.accountNumber = number;
        this.accountHolderName = name;
        this.balance = bal;
    }

    public void deposit(int amount){
        if (amount < 0) {
            System.out.println("Please add at least 1 rupees to deposit");
        } else {
            balance = balance + amount;
        }
    }

    public void withdraw(int amount) {
        if (amount > balance && amount < 0) {
            System.out.println("Please add less than or equal amount to your available balance to withdraw");
        } else {
            balance = balance - amount;
        }
    }

public static void main(String[] args) {
        Encapsulation_BankAccount1 eb1 = new Encapsulation_BankAccount1();
        eb1.setAccountInfo("1001", "Bam", 2000);
        eb1.getAccountInfo();
        eb1.deposit(1000);
        eb1.getAccountInfo();
        eb1.withdraw(1000);
        eb1.getAccountInfo();
}
}
