package Java_Collections_Framework_And_Streams.Exception_Handling_And_Debugging_in_Java;



// Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);  // Pass message to the parent Exception class
    }
}

// Using the custom exception in a bank account class
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            // Throw the custom exception
            throw new InsufficientFundsException("Insufficient funds for withdrawal!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: " + balance);
        }
    }
}

public class Custom_Exception {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);

        try {
            account.withdraw(600);  // Try to withdraw more than the balance
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
