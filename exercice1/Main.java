package serie4collections.exercice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> etudiants = new ArrayList<>();
        etudiants.add("Ali");
        etudiants.add("Omar");
        etudiants.add("Hassan");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nom d'�tudiant : ");
        String nom = scanner.nextLine();

        if (etudiants.contains(nom)) {
            System.out.println(nom + " est pr�sent dans la liste.");
        } else {
            System.out.println(nom + " n'est pas pr�sent dans la liste.");
        }
    }
}
