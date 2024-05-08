package serie4collections.exercice8;

import java.util.Comparator;

public class TriNoteAgeComparator implements Comparator<Etudiant> {
    @Override
    public int compare(Etudiant etudiant1, Etudiant etudiant2) {
        int comparaisonNote = Double.compare(etudiant2.getNote(), etudiant1.getNote());
        if (comparaisonNote != 0) {
            return comparaisonNote;
        }
        return Integer.compare(etudiant1.getAge(), etudiant2.getAge());
    }
}
