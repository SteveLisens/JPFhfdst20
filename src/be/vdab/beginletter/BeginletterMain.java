package be.vdab.beginletter;

import java.util.HashMap;
import java.util.Map;

public class BeginletterMain {
    public static void main(String[] args) {
        String[] woorden = {"appel", "ananas", "banaan", "abrikoos", "aardbei", "kers", "kiwi", "kool", "mandarijn", "citroen"};

        HashMap<Character, Integer> letterTelling = new HashMap<>();

        for (String woord : woorden) {
            var beginLetter = woord.charAt(0);
            letterTelling.put(beginLetter, letterTelling.getOrDefault(beginLetter, 0) + 1);
        }

        System.out.println("Aantal woorden per letter:");
        for (Map.Entry<Character, Integer> entry : letterTelling.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nGrootte van de HashMap: " + letterTelling.size());

        System.out.println("Is de HashMap leeg? " + letterTelling.isEmpty());

        System.out.println("Alle keys: " + letterTelling.keySet());

        System.out.println("Alle values: " + letterTelling.values());

        System.out.println("Alle entries:");
        for (Map.Entry<Character, Integer> entry : letterTelling.entrySet()) {
            System.out.println(entry);
        }
    }
}
