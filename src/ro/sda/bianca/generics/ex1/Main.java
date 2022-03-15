package ro.sda.bianca.generics.ex1;

/**
 * Create a Person class that will implement a Comparable interface.
 * Person class should implement compareTo method, that will verify if one person is taller than another.
 */

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Marius", 1.78);
        Person person2 = new Person("Andrei", 1.83);

        int result = person1.compareTo(person2);

        if(result == 1){
            System.out.println(person1.getName() + " is taller than " + person2.getName());
        } else if (result == -1) {
            System.out.println(person1.getName() + " is shorter than " + person2.getName());
        } else{
            System.out.println(person1.getName() + " is as tall as " + person2.getName());
        }
        }

    }

