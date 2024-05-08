package serie4collections.exercice7;
import java.util.Comparator;

public class TriAnneeComparator implements Comparator<Voiture> {
    @Override
    public int compare(Voiture voiture1, Voiture voiture2) {
        return Integer.compare(voiture2.getAnnée(), voiture1.getAnnée());
    }
}