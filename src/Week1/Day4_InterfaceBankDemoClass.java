package Week1;
// Abstract class
abstract class Day4_InterfaceBankDemoClass {
    int accountNo;
    int balance;

    Day4_InterfaceBankDemoClass(int accountNo, int balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void deposite(int amount){
        balance = balance + amount;
        System.out.println("Your amount = " + amount + " Total balance after deposite = " + balance);
    }

    public abstract void withdraw(int amount);
}
// Interface class
interface InterestCalculator{
    void calculateInterest();
}
// Child class 1
class SavingAccount extends Day4_InterfaceBankDemoClass implements InterestCalculator{
    double interest;
    SavingAccount(int accountNo, int balance, double interest){
        super(accountNo, balance);
        this.interest = interest;
    }

    public void withdraw(int amount){
        balance = balance - amount;
        System.out.println("Your amount = " + amount + " Total balance after withdraw = " + balance);
    }

    public void calculateInterest(){
        interest = balance * (interest / 100);
        System.out.println("Your interest = " + interest);
    }
}
class CurrentAccount extends Day4_InterfaceBankDemoClass {

    CurrentAccount(int accountNo, int balance){
        super(accountNo, balance);
    }

    public void withdraw(int amount){
        balance = balance - amount;
        System.out.println("Your amount = " + amount + " After withdraw on current account  = " + balance);
    }
}