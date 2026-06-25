public class BillPugh {
    private BillPugh() {
        // Private constructor to prevent external instantiation
    }

    private static class SingletonHelper {
        private static final BillPugh INSTANCE = new BillPugh();
    }

    public static BillPugh getInstance() {
        return SingletonHelper.INSTANCE;
    }
}


//understanding --->

//The Singleton instance is not created until getInstance() is called.
//The static inner class (Holder) is not loaded until referenced, thanks to Java's class loading mechanism.
//It ensures thread safety, lazy loading, and high performance without synchronization overhead.

//pros ->

//No need of volatile or synchronized