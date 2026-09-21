package tuf.DesignPatterns.BehaviouralDesignPatterns.ObserverPattern;

public class ObserverMain {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.addObserver(new EmailObserver());
        orderService.addObserver(new SmsObserver());
        orderService.addObserver(new AuditObserver());

        orderService.createOrder(123);
    }
}
