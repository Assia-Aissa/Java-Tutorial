package serie4collections.School;

import java.util.Comparator;

public class CompNbEnfants implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Parent p1 = (Parent) o1;
        Parent p2 = (Parent) o2;
        Integer a = p1.getEnfants().size();
        Integer b = p2.getEnfants().size();

        return a.compareTo(b);
    }
}