package ro.sda.bianca.interfaces.ex2;

public class Person implements Comparable{
    private int age;
    public Person(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int compareToObject(Object o1){
        return Integer.compare(this.age, ((Person)o1).getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
