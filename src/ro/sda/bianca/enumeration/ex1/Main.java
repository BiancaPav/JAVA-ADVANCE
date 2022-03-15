package ro.sda.bianca.enumeration.ex1;

/**
 * Create enum Planets.
 * a) Override toString method. It should print relative size of a planet and it’s name.
 * 	E.g. „Huge Jupiter”, „Small Pluto”.
 * b)  Create distanceFromEarth method.
 * c) Verify both methods for multiple planets.
 * React
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Planet[] planets = Planet.values();
        for (Planet planet:planets){
            System.out.println(planet.name());
        }
         Scanner scanner = new Scanner(System.in);
        System.out.println("Insert planet:");

        String planetName = scanner.nextLine().toUpperCase().trim();  //trim scoate spatiile albe(blank)

        Planet planet = Planet.valueOf(planetName);  //convertim string in enum
        System.out.println(planet);
        System.out.println(planet.distanceFromEarth());
    }
}
