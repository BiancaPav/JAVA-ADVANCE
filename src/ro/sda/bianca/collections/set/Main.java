package ro.sda.bianca.collections.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Create a set consisting of colors - given from the user.
 */

public class Main {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>(); //nu mai arata duplicatele
        colors.add("blue");
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");
        colors.add("red");
        System.out.println(colors);

        String color = "violet"; //daca nu stim elemente facem cu foreach, daca le stim facem cu contains
        if (colors.contains(color)) {
            System.out.println(color);
        }
        for (String color1 : colors) {
            if (color1.startsWith("y")) {
                System.out.println(color1);
            }
        }

        colors.remove("yellow");
        if (colors.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            System.out.println("List is not empty.");
        }

        Set<String> otherColors = new HashSet<>();
        otherColors.add("brown");
        otherColors.add("orange");

        colors.addAll(otherColors);
        System.out.println(colors);
        System.out.println(colors.containsAll(otherColors));

        otherColors.removeAll(colors);
        System.out.println(otherColors);
    }
}
