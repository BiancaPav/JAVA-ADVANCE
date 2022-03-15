package ro.sda.bianca.lambda.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    private static final List<Person> persons = Arrays.asList(
            new Person("George1", "Dragomir", "Gfragomir@gmail.com", 28),
            new Person("Alex", "Dragomir", "Afragomir@gmail.com", 26),
            new Person("Marius", "Dragomir", "Mfragomir@gmail.com", 23),
            new Person("Ionut", "Dragomir", "Ifragomir@gmail.com", 11),
            new Person("Claudiu", "Dragomir", "Cfragomir@gmail.com", 17)
    );

    public static void main(String[] args) {
        filter(person -> person.getAge() > 18);
        System.out.println("------------------");
        filter(person -> person.getEmail().startsWith("Afragomir"));
        System.out.println("------------------");
        filter(person -> person.getAge() > 18 && person.getEmail().startsWith("Gfragomir"));
        System.out.println("------------------");
        filter(person -> {
            if (person.getFirstName().startsWith("G")) {
                return true;
            }
            if (person.getAge() > 25) {
                return true;
            }
            return false;
        });
        System.out.println("------------------");

        filter(
                person -> person.getAge() > 18,
                person -> person.getFirstName() + " " + person.getLastName()
        );
        System.out.println("------------------");
        filter(
                person -> person.getAge() > 18,
                person -> Integer.toString(person.getAge())
        );
        System.out.println("------------------");
        filter(
                person -> person.getAge() > 18,
                person -> person.getFirstName() + " " + person.getLastName(),
                string -> System.err.println(string)
        );
    }

    public static void filter(Predicate<Person> predicate) {
        for (Person person : persons) {
            if (predicate.test(person)) {
                System.out.println(person);
            }

        }
    }

    public static void filter(Predicate<Person> predicate, Function<Person, String> function) { //function ajuta la convertire
        for (Person person : persons) {
            if (predicate.test(person)) {
                System.out.println(function.apply(person));
            }
        }
    }

    public static void filter
            (Predicate<Person> predicate,
             Function<Person,
                     String> function,
             Consumer<String> consumer
            ) {
        for (Person person : persons) {
            if (predicate.test(person)) {
                consumer.accept(function.apply(person));
            }
        }
    }
}
