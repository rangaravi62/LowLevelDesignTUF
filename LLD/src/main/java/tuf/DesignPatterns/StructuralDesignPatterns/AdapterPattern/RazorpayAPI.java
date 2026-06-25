package tuf.DesignPatterns.StructuralDesignPatterns.AdapterPattern;

public class RazorpayAPI {
    boolean makePayment(int orderId, double amount) {
        System.out.println("Razorpay Payment of "+amount+" successful for the order "+ orderId);
        return true;
    }
}
