package homework8.task2;

public class First extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Завершение first потока");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
