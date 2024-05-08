package serie4collections.exercice3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class execice3 {
    public static void main(String[] args) {
        Map<String, Integer> occurrencesMots = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez une phrase : ");
        String phrase = scanner.nextLine();

        String[] mots = phrase.split(" ");
        for (String mot : mots) {
            occurrencesMots.put(mot, occurrencesMots.getOrDefault(mot, 0) + 1);
        }

        System.out.println("Occurrences des mots : ");
        for (Map.Entry<String, Integer> entry : occurrencesMots.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
