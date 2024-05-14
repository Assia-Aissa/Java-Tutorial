package serie4collections.Collections;

import java.util.Comparator;

public class TriNoteAgeComparator implements Comparator<Etudiant> {

 public int compare(Etudiant etudiant1, Etudiant etudiant2){
     int nameComparison=etudiant1.getNom().compareTo(etudiant2.getNom());
     if(nameComparison !=0){
         //names are different -> return the comparison
         return nameComparison;
     }else{
         //if names are same compare by note
         return Integer.compare(etudiant2.getNote(), etudiant1.getNote());
     }
 }


}
