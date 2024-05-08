package serie4collections.POO;

import java.util.Comparator;

public class ComparateurNom implements Comparator{


    @Override
    public int compare(Object o1, Object o2) {

         String nom1=((Etudiant) o1).getNom();
         String nom2=((Etudiant) o2).getNom();


        return nom1.compareTo(nom2) ;
    }
}
