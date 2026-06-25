package tuf.DesignPatterns.StructuralDesignPatterns.AdapterPattern;

public class RazorpayAdapter implements PaymentGateway{
    RazorpayAPI razorpayAPI;

    public RazorpayAdapter(){
        this.razorpayAPI = new RazorpayAPI();
    }
    @Override
    public boolean pay(int orderId, double amount) {
        razorpayAPI.makePayment(orderId, amount);
        return true;
    }
}
