package homework8.task3;

public class SimpleThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " - " + Thread.currentThread().getName() + "(Priority: " + Thread.currentThread().getPriority() + ")");
        }
    }
}
