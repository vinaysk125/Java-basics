package Week1;

public class Day4_InterfaceBankDemoClassMain {
    public static void main(String[] args) {
        SavingAccount sAcc = new SavingAccount(101, 5000, 9);
        sAcc.withdraw(1000);
        sAcc.deposite(2000);
        sAcc.calculateInterest();

        CurrentAccount cAcc = new CurrentAccount(201, 10000);
        cAcc.deposite(5000);
        cAcc.withdraw(6000);
    }
}
