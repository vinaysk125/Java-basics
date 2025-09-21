package Week1;

interface Day4_InterfacePaymentGateway {

    void processPayment(double amount);

}
class CreditCardPayment implements Day4_InterfacePaymentGateway{

    public void processPayment(double amount){
        System.out.println("Card payment = " + amount);
    }
}
class UPIPayment implements Day4_InterfacePaymentGateway{

    public void processPayment(double amount){
        System.out.println("UPI payment = " + amount);
    }
}