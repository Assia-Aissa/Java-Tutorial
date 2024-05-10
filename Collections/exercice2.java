package serie4collections.Collections;

import java.util.HashSet;
import java.util.Set;

public class exercice2 {
    public static void main(String[] args){
        Set<Integer> ensemble1=new HashSet<>();
        Set<Integer> ensemble2=new HashSet<>();
        ensemble1.add(14);
        ensemble1.add(10);
        ensemble1.add(47);
        ensemble1.add(34);

        ensemble2.add(34);
        ensemble2.add(47);
        ensemble2.add(10);

        Set<Integer> intersection=new HashSet<>(ensemble1);
        intersection.retainAll(ensemble2);
        System.out.println("intersection du deux ensemble est: "+intersection);


    }
}
