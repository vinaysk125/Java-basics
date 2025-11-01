package Week2.packagesDemo;

public class Account {
    public int accountNo;
    protected double balance;
    String type;
    private String password;

    public Account (int accountNo, double balance, String type, String password) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.type = type;
        this.password = password;
    }

    public void deposit (int amount) {
        balance = balance + amount;
    }
    public double getBalance () {
        return balance;
    }
    private String getPassword () {
        return password;
    }
}
