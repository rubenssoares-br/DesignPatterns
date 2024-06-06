public class SingletonMultiThread {
    private static SingletonMultiThread instance;
    public String value;

    private SingletonMultiThread(String value) {
        this.value = value;
    }

    public static SingletonMultiThread getInstance(String value) {
        if (instance == null) {
            instance = new SingletonMultiThread(value);
        }
        return instance;
    }
}
