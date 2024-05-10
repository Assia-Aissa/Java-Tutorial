package serie4collections.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class exercice3 {

    public static void main(String[] args){
        System.out.println("enter your sentense:");
        Scanner scanner=new Scanner (System.in);
        String sentense=scanner.nextLine();
        Map<String,Integer> OccurenceMots=new HashMap<>();
        String[] mots=sentense.split(" ");
         for(String mot:mots){
             OccurenceMots.put(mot,OccurenceMots.getOrDefault(mot,0)+1);
         }
        System.out.println("Occurrences des mots : ");

         for(Map.Entry<String, Integer> entry:OccurenceMots.entrySet()){
             System.out.println(entry.getKey()+"--> "+entry.getValue());
         }


    }
}
