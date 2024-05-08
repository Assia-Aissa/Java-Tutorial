package serie4collections.exercice6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Personne> personnes = new ArrayList<>();
        personnes.add(new Personne("Ali", 25, 1.75));
        personnes.add(new Personne("Omar", 30, 1.80));
        personnes.add(new Personne("Hassan", 20, 1.70));

        System.out.println("Liste avant le tri : " + personnes);
        Collections.sort(personnes);
        System.out.println("Liste après le tri par âge croissant : " + personnes);
    }
}