package ro.sda.bianca.inheritance.ex3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Person[] persons = new Person[5];

        persons[0] = new Employee("Virgil", new Date(), "male", 5000, "Emag", "Vanzari");
        persons[1] = new Employee("Virgil", new Date(), "male", 5000, "Emag", "Vanzari");
        persons[2] = new Student("George", new Date(), "male", "Politehnica", 8.2);
        persons[3] = new Student("George", new Date(), "male", "Politehnica", 8.2);
        persons[4] = new Student("George", new Date(), "male", "Politehnica", 8.2);

        for (Person person : persons) {
            System.out.println(person);
            System.out.println(person.getName());
        }
    }
}
