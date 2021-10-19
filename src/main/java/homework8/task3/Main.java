package homework8.task3;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new SimpleThread());
        Thread thread2 = new Thread(new SimpleThread());
        Thread thread3 = new Thread(new SimpleThread());
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
