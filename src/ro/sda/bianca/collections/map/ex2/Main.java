package ro.sda.bianca.collections.map.ex2;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a program which count the number of each character occurring in a string.
 * Read the string from the command line.
 * Ex: {d=9, o=6, r=7, W=5}
 */

public class Main {
    public static void main(String[] args) {
        String defaultString = "HelloWorld";
        Map<Character, Integer> map = new HashMap<>();

        char[] charArray = defaultString.toCharArray();

        for(char mapKey:charArray){
            map.putIfAbsent(mapKey, 0);
            System.out.println(map);
            int existingValue = map.get(mapKey);
            map.put(mapKey, existingValue + 1);
            System.out.println(map);
        }

    }
}
