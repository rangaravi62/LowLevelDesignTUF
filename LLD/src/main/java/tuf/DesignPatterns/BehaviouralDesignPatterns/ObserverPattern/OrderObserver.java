package tuf.DesignPatterns.BehaviouralDesignPatterns.ObserverPattern;

public interface OrderObserver {
    public void update(int orderId);
}

class EmailObserver implements OrderObserver {
    @Override
    public void update(int orderId) {
        System.out.println("Sending the email");
    }
}

class SmsObserver implements OrderObserver {
    @Override
    public void update(int orderId) {
        System.out.println("Sending SMS");
    }
}

class AuditObserver implements OrderObserver {
    @Override
    public void update(int orderId) {
        System.out.println("Adding the Audit Entry");
    }
}




