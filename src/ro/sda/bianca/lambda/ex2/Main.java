package ro.sda.bianca.lambda.ex2;

import java.util.function.Predicate;

/**
 * You are given a lower and an upper bound for a range of integer numbers.
 * Then a command specifies if you need to list all even or odd numbers in the given range.
 * Use predicates that need to be passed to a method.
 */

// predicates valideaza intotdeauna
public class Main {
    public static void main(String[] args) {
        generateNumber(7, 56, number -> number % 2 == 0);
        System.out.println("-----------------------");
        generateNumber(7, 56, number -> number % 2 != 0);
        System.out.println("-----------------------");
        generateNumber(7, 56, number -> number % 5 == 0);

    }

    public static void generateNumber(int min, int max, Predicate<Integer> predicate) { //min si max sunt bound
        for (int i = min; i <= max; i++) {
            if (predicate.test(i)) { //testeaza i
                System.out.println(i);
            }
        }
    }
}
