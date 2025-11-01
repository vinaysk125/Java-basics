package Week2.app;

import Week2.packagesDemo.Account;

public class AccountDemo {
public static void main(String [] args) {
    Account a = new Account(1001, 2000,"Saving", "Pass@123");
    System.out.println("Balance for account number = " + a.accountNo + " is = " + a.getBalance());
    a.deposit(1000);
    System.out.println("After deposit balance for account number = " + a.accountNo + " is = " + a.getBalance());
}
}
