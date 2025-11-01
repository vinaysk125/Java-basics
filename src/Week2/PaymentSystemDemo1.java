package Week2;

abstract class PaymentProcessor {
    abstract void processPayment(double amount);

    void generateInvoice() {
        System.out.println("Your invoice generated successfully.");
    }
}

interface Refundable {
    void refund(double amount);
}

class CreditCardPayment extends PaymentProcessor implements Refundable {
    @Override
    void processPayment(double amount) {
        System.out.println("Processed Credit Card payment of ₹" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded ₹" + amount + " to Credit Card.");
    }
}

class UpiPayment extends PaymentProcessor implements Refundable {
    @Override
    void processPayment(double amount) {
        System.out.println("Processed UPI payment of ₹" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded ₹" + amount + " to UPI ID.");
    }
}

public class PaymentSystemDemo1 {
    public static void main(String[] args) {
        // Using abstract class reference
        PaymentProcessor cc = new CreditCardPayment();
        cc.processPayment(1500);
        cc.generateInvoice();

        // Using abstract class reference for UPI
        PaymentProcessor upi = new UpiPayment();
        upi.processPayment(800);
        upi.generateInvoice();

        // Using interface reference to call refund
        Refundable refundUpi = new UpiPayment();
        refundUpi.refund(100);

        Refundable refundCc = new CreditCardPayment();
        refundCc.refund(250);
    }
}
