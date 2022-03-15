package ro.sda.bianca.generics.ex1;

public class GenericMain {
    public static void main(String[] args) {

        Person person1 = new Person("Marius", 1.83);
        Person person2 = new Person("Andrei", 1.83);

        Comparator<Person> comparator = new Comparator<>();
        comparator.compare(person1, person2);

        Car carFerrari = new Car("Ferrari", 320);
        Car carRenault = new Car("Renault", 220);

        Comparator<Car> carComparator = new Comparator<>();
        carComparator.compare(carFerrari, carRenault);



    }
}
