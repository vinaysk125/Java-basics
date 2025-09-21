package Week1;

public class Day4_InterfacePaymentGatewayClassMain {
    public static void main(String[] args) {

        CreditCardPayment card = new CreditCardPayment();
        card.processPayment(2000);

        UPIPayment upi = new UPIPayment();
        upi.processPayment(1000);
    }
}