package homework8.task2;

public class Main extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Завершение main потока");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        First first = new First();
        Second second = new Second();
        main.start();
        first.start();
        second.start();


    }
}
