package tuf.DesignPatterns.StructuralDesignPatterns.AdapterPattern;

public class Main {
    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService(new Paypal());
        checkoutService.payment(21,20000);

//        CheckoutService checkoutService2 = new CheckoutService(new RazorpayAPI()); ->
//        CheckoutService expects any payment provider to implement the PaymentGateway interface.
//        Paypal fits this requirement and works correctly.
//        RazorpayAPI, however, uses a different method (makePayment) and does not implement PaymentGateway.
//        Due to this mismatch, RazorpayAPI cannot be used directly with CheckoutService.

//        Here, we created an adapter class RazorpayAdapter that implements the PaymentGateway interface.
//        The adapter internally uses the RazorpayAPI class and translates the method calls from the expected interface to the actual implementation.

        CheckoutService checkoutService1 = new CheckoutService(new RazorpayAdapter());
        checkoutService1.payment(25,25000);


    }
}
