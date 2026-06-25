public class DoubleCheck {
    private static volatile DoubleCheck instance;

    private DoubleCheck() {
        // Private constructor to prevent external instantiation
    }

    public static DoubleCheck getInstance() {
        if (instance == null) {
            synchronized (DoubleCheck.class) {
                if (instance == null) {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}


//This is a more efficient way to achieve thread safety. The idea is to check if the instance is null before acquiring the lock.
//If it is, then we synchronize the block and check again. This reduces the overhead of synchronization after the instance has been created.


//Understanding  --->

//The outer if check avoids synchronization once the instance is created.
//The inner if inside synchronized ensures that only one thread creates the instance.
//volatile keyword ensures changes made by one thread are visible to others. Without volatile, one thread might create the Singleton instance,
//but other threads may not see the updated value due to caching. volatile ensures that the instance is always read from the main memory,
//so all threads see the most up-to-date version.


//Pros

//Efficient: Synchronization only happens once, when the instance is created.
//Safe and fast in concurrent environments.

//Cons

//Slightly more complex than the synchronized method.
//Requires Java 1.5 or above due to reliance on volatile.

