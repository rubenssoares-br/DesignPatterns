public class Singleton {
    private static Singleton instance;
    private String name;


    private Singleton() {
    }

    private Singleton(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static  Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
