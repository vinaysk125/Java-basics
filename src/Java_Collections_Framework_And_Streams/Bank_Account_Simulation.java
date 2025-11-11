package Java_Collections_Framework_And_Streams;

import java.util.Scanner;
// ✅ Custom Exceptions

class NegativeDepositException extends Exception {
    NegativeDepositException (String msg) {
        super(msg);
    }
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException (String msg) {
        super(msg);
    }
}

// ✅ Bank class
class SimpleBank {
    private double balance = 0;

    void deposit(double amount) throws NegativeDepositException {
        if (amount <= 0) {
            throw new NegativeDepositException("Deposit amount must be positive!");
        } else {
            balance += amount;
            System.out.println("Deposited: " + amount + " | Balance: " + balance);
        }
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (balance < amount) {
            throw new InsufficientBalanceException("Not enough funds. Balance: " + balance);
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
public class Bank_Account_Simulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SimpleBank bank = new SimpleBank();

        try {
            System.out.print("Enter deposit amount: ");
            bank.deposit(sc.nextDouble());

            System.out.print("Enter withdrawal amount: ");
            bank.withdraw(sc.nextDouble());

        } catch (NegativeDepositException | InsufficientBalanceException e) {
            System.out.println("❌ " + e.getMessage());

        } finally {
            bank.checkBalance();
            System.out.println("Execution completed");
            sc.close();
        }
    }
}
