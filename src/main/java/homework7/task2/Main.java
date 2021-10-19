package homework7.task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("H:\\Malyshkin_Java_Professional2\\src\\main\\java\\homework7\\task2\\some.txt");
        SomeClass sm = new SomeClass("test", 10);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream objectInputStream = new ObjectInputStream((new FileInputStream(file)))) {
            objectOutputStream.writeObject(sm);
            sm = null;
            sm = (SomeClass) objectInputStream.readObject();
            System.out.println(sm);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
