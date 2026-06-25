public interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("[CREDIT CARD] Paid RS." +amount );
    }
}

class UPIPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("[UPI] Paid RS." +amount );
    }
}

class NetBankingPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("[NET BANKING] Paid RS." +amount );
    }
}

class PaymentFactory {
    public static Payment create(String type) {
        switch (type) {
            case "upi" : return new UPIPayment();
            case "credit card" : return new CreditCardPayment();
            case "net banking" : return new NetBankingPayment();
            default: throw new UnsupportedOperationException("unsupported payment type");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Payment pay = PaymentFactory.create("crypto");
        pay.pay(700.50);
    }
}
