package ro.sda.bianca.encapsulation;

//Create class Dog.
//a) Add private fields to the class, like name, age, gender, race, weight.
//b) Create constructor that accepts all of the class fields.
//c) Create additional constructor, that will accept only gender and race. It should call main constructor with default values.
//d) Create getters and setters for age and weight.
//e) Create object of class Dog. Verify if everything works as expected.
//f) Add verification for all arguments passed to the setters. E.g. setWeight method should not accept values below or equal to 0.

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Max", 6, "male", "metis", 6.3);
        System.out.println(dog);

        dog.setAge(-7);
        dog.setWeight(-8.5);
        System.out.println(dog);

        Dog dog2 = new Dog("female", "bichon");
        System.out.println(dog2);
    }
}
