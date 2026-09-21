package tuf.DesignPatterns.CreationalDesignPatterns.SingletonDP;

public enum EnumSingleton {
    INSTANCE;
}

//this is equivalent to
//
//public class Singleton {
//    public static final Singleton INSTANCE = new Singleton();
//
//    private Singleton() {
//    }
//}
// constructors are not callable in enum
class EnumTest{
    public static void main(String[] args) {
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;
        System.out.println(singleton1==singleton2);
    }
}
