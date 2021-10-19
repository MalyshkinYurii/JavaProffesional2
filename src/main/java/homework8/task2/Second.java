package homework8.task2;

public class Second extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("Завершение second потока");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
