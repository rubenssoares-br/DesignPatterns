public class Singleton2 {
    private static Singleton2 instance;
    private boolean name;

    private static final Singleton2 reallyTrue = new Singleton2(true);
    private static final Singleton2 reallyFalse = new Singleton2(false);

    private Singleton2(boolean name) {
        this.name = name;
    }
    private Singleton2() {
    }

    public boolean isName() {
        return name;
    }

    public boolean getName() {
        return name;
    }

    public static  Singleton2 getInstance(boolean name) {
                if (name) {
                    return reallyTrue;
                } else {
                    return reallyFalse;
                }
        }

    public static  Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
        }







