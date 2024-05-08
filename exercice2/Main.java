package serie4collections.exercice2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> ensemble1 = new HashSet<>();
        Set<Integer> ensemble2 = new HashSet<>();

        // Remplir les ensembles avec des nombres aléatoires
        // (ajoutez votre propre logique pour générer des nombres aléatoires)

        ensemble1.add(1);
        ensemble1.add(2);
        ensemble1.add(3);

        ensemble2.add(2);
        ensemble2.add(3);
        ensemble2.add(4);
        /* vous pouvez utiliser la classe Random pour generer des nombres 
        entiers aléatoires comme ceci 
          Random r = new Random();
          int n = r.nextInt(10);
        
        */
        // Intersection des ensembles
        Set<Integer> intersection = new HashSet<>(ensemble1);
        intersection.retainAll(ensemble2);

        System.out.println("Intersection des ensembles : " + intersection);
    }
}
