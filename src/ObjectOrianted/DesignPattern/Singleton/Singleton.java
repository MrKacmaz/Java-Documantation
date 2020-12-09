package ObjectOrianted.DesignPattern.Singleton;

public class Singleton {

    private volatile static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class){
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}

