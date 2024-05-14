package serie4collections.Collections;

import java.util.Comparator;

public class TriAnneeComparator implements Comparator<Voiture> {

   /* public int compare(Voiture a,Voiture b){
        Integer year1= a.getAnnee();
        Integer year2=b.getAnnee();
        return year2.compareTo(year1);
    }*/
   /* public int compare (Voiture a, Voiture b){
        return Integer.compare(b.getAnnee(),a.getAnnee());
    }*/
   public int compare (Voiture a, Voiture b) {
       return ((Integer) b.getAnnee()).compareTo((Integer) a.getAnnee());

   }
}
