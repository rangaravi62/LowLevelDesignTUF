public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        // Private constructor to prevent external instantiation
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

//pros ->

//Saves memory if the instance is never used.
// Not thread safe as multiple threads can create multiple instances during run time

//cons ->

//Lazy Loading is Not thread-safe by default, multiple threads can create multiple instances during run time
//Thus, it requires synchronization in multithreaded environments.



//to make it thread safe we can use synchronization but it will decrease the performance not that efficient
//Performance overhead: Every call to getInstance() is synchronized, even after the instance is created.
//May slow down the application in high-concurrency scenarios.

//public static synchronized LazySingleton getInstance() {
//    if (instance == null) {
//        instance = new LazySingleton();
//    }
//    return instance;
//}