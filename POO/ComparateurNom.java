package serie4collections.POO;

import java.util.Comparator;

public class ComparateurNom implements Comparator<Etudiant>{

    public int compare(Etudiant etudiant1,Etudiant etudiant2){
        String name1=etudiant1.getNom();
        String name2=etudiant2.getNom();
        return name1.compareTo(name2);
    }

}
