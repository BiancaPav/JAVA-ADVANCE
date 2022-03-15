package ro.sda.bianca.interfaces.ex2;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(23);
        Person person2 = new Person(26);

        Comparator.compareTwoObjects(person1, person2);
    }
}
