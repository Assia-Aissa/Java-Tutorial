package serie4collections.exercice8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant("Ali", 20, 85.0));
        etudiants.add(new Etudiant("Omar", 22, 75.0));
        etudiants.add(new Etudiant("Hassan", 21, 85.0));

        System.out.println("Liste avant le tri : " + etudiants);
        Collections.sort(etudiants, new TriNoteAgeComparator());
        System.out.println("Liste après le tri par note décroissante puis par âge croissante : " + etudiants);
    }
}