package Week1.AccessModifiersBanking;

public class AccountDemo {
    public static void main(String... args){ // or (String[] args)
        Account account = new Account(101, 10000, "Saving", "pass123");
        account.displayDetails();
        System.out.println(account.accountNumber); // ✅ public
        System.out.println(account.balance);   // ✅ protected (same package)
        System.out.println(account.type);      // ✅ default (same package)
        //System.out.println(account.password); private not accessible outside class but accessible using getter and setter
    }
}
