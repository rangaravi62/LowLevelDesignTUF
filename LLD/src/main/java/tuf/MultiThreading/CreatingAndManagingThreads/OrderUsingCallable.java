package CreatingAndManagingThreads;

import java.util.concurrent.Callable;

public class OrderUsingCallable {

}


class ETACalculationTask implements Callable<String> {
    public String call() throws InterruptedException {
        Thread.sleep(5000); // Simulate 5-second delay for ETA calculation
        System.out.println("Calculation ETA using Callable.");
        return "ETA: 25 minutes"; // Return the ETA result
    }
}

// Implementing Runnable to send SMS (no return value required)
class SMSTask implements Runnable {
    public void run() {
        try {
            Thread.sleep(2000); // Simulate 2-second delay for SMS
            System.out.println("SMS Sent using Runnable.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Implementing Runnable to send Email (no return value required)
class EmailTask implements Runnable {
    public void run() {
        try {
            Thread.sleep(3000); // Simulate 3-second delay for Email
            System.out.println("Email Sent using Runnable.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}