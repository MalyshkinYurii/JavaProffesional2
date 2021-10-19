package homework7.task3;

public class Animal implements Cloneable {
    String type;
    int age;
    String legs;

    public Animal(String type, int age, String legs) {
        this.type = type;
        this.age = age;
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", age=" + age +
                ", legs='" + legs + '\'' +
                '}';
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
