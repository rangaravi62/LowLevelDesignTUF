package tuf.DesignPatterns.StructuralDesignPatterns.AdapterPattern;

public class CheckoutService {
    PaymentGateway paymentGateway;

    public CheckoutService(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    public boolean payment(int orderId, double amount) {
        paymentGateway.pay(orderId, amount);
        return true;
    }
}
