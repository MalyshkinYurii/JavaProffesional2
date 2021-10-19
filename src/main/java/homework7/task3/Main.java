package homework7.task3;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("eagle" , 10, "2");
        try {
            Eagle copyEagle = (Eagle) eagle.clone();
            System.out.println(eagle);
            System.out.println(copyEagle);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
