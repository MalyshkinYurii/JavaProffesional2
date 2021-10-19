package homework7.task2;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class SomeClass implements Externalizable {
    private String name;
    private static int age;
    private int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        SomeClass.age = age;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public SomeClass() {

    }

    public SomeClass(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(count);
        out.writeObject(name);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        count = in.readInt();
        name = (String) in.readObject();


    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
