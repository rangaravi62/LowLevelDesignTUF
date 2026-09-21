package tuf.DesignPatterns.BehaviouralDesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    List<OrderObserver> orderObservers = new ArrayList<>();

    public void addObserver(OrderObserver observer){
        orderObservers.add(observer);
    }

    public void removeObserver(OrderObserver observer){
        orderObservers.remove(observer);
    }

    public void notifyObservers(int orderId){
        for (OrderObserver observer : orderObservers){
            observer.update(orderId);
        }
    }

    public void createOrder(int orderId){
        System.out.println("Order created");

        notifyObservers(123);
    }
}
