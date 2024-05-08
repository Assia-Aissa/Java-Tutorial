package serie4collections.exercice5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> notesEtudiants = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nombre d'étudiants : ");
        int nbEtudiants = scanner.nextInt();

        for (int i = 0; i < nbEtudiants; i++) {
            System.out.println("Entrez le nom de l'étudiant : ");
            String nom = scanner.next();
            System.out.println("Entrez la note de l'étudiant : ");
            double note = scanner.nextDouble();
            notesEtudiants.put(nom, note);
        }

        double somme = 0;
        for (double note : notesEtudiants.values()) {
            somme += note;
        }
        double moyenne = somme / notesEtudiants.size();
        System.out.println("La moyenne des notes est : " + moyenne);
    }
}
