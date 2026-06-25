package tuf.DesignPatterns.StructuralDesignPatterns.AdapterPattern;

public class Paypal implements PaymentGateway{
    @Override
    public boolean pay(int orderId, double amount) {
        System.out.println("Paypal Payment of "+amount+" successful for the order "+ orderId);
        return false;
    }
}
