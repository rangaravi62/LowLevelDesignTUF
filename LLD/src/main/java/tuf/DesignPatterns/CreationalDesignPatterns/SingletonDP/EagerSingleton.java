public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton(); // assigned while class loading

    // Private constructor to prevent external instantiation
    private EagerSingleton() {
        // Private constructor to prevent external instantiation
    }

    //get the global instance
    public static EagerSingleton getInstance() {
        return instance;
    }
}

//pros ->

//Thread safe since the object is created during class lading time

//cons ->

//Wastes memory if the instance is never used.
//Not suitable for heavy objects.