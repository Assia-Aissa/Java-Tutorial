package serie4collections.exercice7;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Voiture> voitures = new ArrayList<>();
        voitures.add(new Voiture("Toyota", "Corolla", 2015));
        voitures.add(new Voiture("Honda", "Civic", 2018));
        voitures.add(new Voiture("Tesla", "Model S", 2020));

        System.out.println("Liste avant le tri : " + voitures);
        Collections.sort(voitures, new TriAnneeComparator());
        System.out.println("Liste après le tri par année décroissante : " + voitures);
    }
}