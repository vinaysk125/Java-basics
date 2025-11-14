package Java_Collections_Framework_And_Streams;

import java.util.Scanner;
// ✅ Custom Exceptions

class NegativeDepositException1 extends Exception {
    NegativeDepositException1 (String msg) {
        super(msg);
    }
}

class InsufficientBalanceException1 extends Exception {
    InsufficientBalanceException1 (String msg) {
        super(msg);
    }
}

// ✅ Bank class
class SimpleBank1 {
    private double balance = 0;

    void deposit(double amount) throws NegativeDepositException1 {
        if (amount <= 0) {
            throw new NegativeDepositException1("Deposit amount must be positive!");
        } else {
            balance += amount;
            System.out.println("Deposited: " + amount + " | Balance: " + balance);
        }
    }

    void withdraw(double amount) throws InsufficientBalanceException1 {
        if (balance < amount) {
            throw new InsufficientBalanceException1("Not enough funds. Balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount + " | Balance: " + balance);
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

}
// ✅ Main class
public class Bank_Account_Simulation1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SimpleBank1 bank = new SimpleBank1();

        try {
            System.out.print("Enter deposit amount: ");
            bank.deposit(sc.nextDouble());

            System.out.print("Enter withdrawal amount: ");
            bank.withdraw(sc.nextDouble());

        } catch (NegativeDepositException1 | InsufficientBalanceException1 e) {
            System.out.println("❌ " + e.getMessage());

        } finally {
            bank.checkBalance();
            System.out.println("Execution completed");
            sc.close();
        }
    }
}
