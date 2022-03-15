package ro.sda.bianca.streams.ex2;

import java.util.List;
import java.util.Locale;

/**
 * List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes")
 * - Print All Courses individually
 * - Print Courses Containing the word "Spring"
 * - Print Courses Whose Name has at least 4 letters
 * - Print the number of characters in each course name
 */

public class Main {

    private static List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");

    public static void main(String[] args) {

        courses.stream()
                .forEach(System.out::println);
        System.out.println("=====================================");

        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
        System.out.println("=====================================");


        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);
        System.out.println("=====================================");

        courses.stream()
                .map(course -> course.length())  //convert string -> nr de caractere
                .forEach(numberOfCharacters -> System.out.println(Integer.toString(numberOfCharacters)));
        System.out.println("=====================================");

        courses.stream()
                .map(course -> course.toUpperCase(Locale.ROOT))
                .map(course -> "test - ".concat(course))  //concatenare
                .sorted()
                .skip(1)
                .limit(4)
                .forEach(course -> System.out.println(course));


    }
}
