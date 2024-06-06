

public class Program {
    public static void main(String[] args) throws InterruptedException {

        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);

        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);

        System.out.println("\n---------------------\n");

        Singleton2 s21 = Singleton2.getInstance(false);
        Singleton2 s22 = Singleton2.getInstance(true);
        Singleton2 s23 = Singleton2.getInstance(false);
        Singleton2 s24 = Singleton2.getInstance(true);

        System.out.println("\n---------t------------\n");

        System.out.println(s21);
        System.out.println(s22);
        System.out.println(s23);
        System.out.println(s24);

        System.out.println("\n----------t-----------\n");
       Singleton2 x1 = Singleton2.getInstance();
       Singleton2 x2 = Singleton2.getInstance();

       if (x1 == x2) {
           System.out.println("BRAZILLL");
       }

        if (s21 == s22) {
            System.out.println("TETRAA");
        }

        System.out.println("\n---------------------\n");


        System.out.println(s21);
        System.out.println(s22);
        System.out.println(s23);


        System.out.println("\n---------------------\n");

        Thread threadOne = new Thread(new ThreadOne());
        Thread threadTwo = new Thread(new ThreadTwo());
        Thread threadThree = new Thread(new ThreadThree());
        Thread threadFour = new Thread(new ThreadFour());
        threadTwo.start();
        threadOne.start();
        threadThree.start();
        threadFour.start();

    }

     static class ThreadOne implements Runnable {
        @Override
        public void run() {
            SingletonMultiThread singleton = SingletonMultiThread.getInstance("THREAD ONE");
            System.out.println(singleton.value);
        }
    }

    static class ThreadTwo implements Runnable {
        @Override
        public void run() {
            SingletonMultiThread singleton = SingletonMultiThread.getInstance("THREAD TWO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadThree implements Runnable {
        @Override
        public void run() {
            SingletonMultiThread singleton = SingletonMultiThread.getInstance("THREAD THREE");
            System.out.println(singleton.value);
        }
    }

    static class ThreadFour implements Runnable {
        @Override
        public void run() {
            SingletonMultiThread singleton = SingletonMultiThread.getInstance("THREAD FOUR");
            System.out.println(singleton.value);
        }
    }

}
