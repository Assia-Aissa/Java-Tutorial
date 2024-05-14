package serie4collections.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Etudiant {
    private String nom;
    private int Note;

    public Etudiant(String nom,int Note) {
        this.nom = nom;
        this.Note=Note;
    }

    public int getNote() {
        return Note;
    }

    public String getNom() {
        return nom;
    }

    public void setNote(int note) {
        Note = note;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", Note=" + Note +
                '}';
    }

    public static void main(String[] args){
        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant("Alice", 80));
        etudiants.add(new Etudiant("Bob", 90));
        etudiants.add(new Etudiant("Alice", 70));
        etudiants.add(new Etudiant("Bob", 85));

        System.out.println("before:");
        System.out.println(etudiants);
        Collections.sort(etudiants,new TriNoteAgeComparator());
        System.out.println("after:");
        System.out.println(etudiants);
    }
}
