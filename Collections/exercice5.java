package serie4collections.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercice5 {

    public static void main(String [] args){
        Map<String,Integer> etudeList=new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer le nombre des etudiants:");
        int num=scanner.nextInt();
scanner.nextLine();
        int i=0;
        while(i<num){
             System.out.println("if you want to sto click please on <q> or type the name :");
             String name=scanner.nextLine();

             System.out.println("entrer la note : ");
             Integer note = scanner.nextInt();
scanner.nextLine();
            etudeList.put(name,note);
                i++;
        }

        int somme=0;
        System.out.println(etudeList);
        for (Map.Entry<String,Integer> entry:etudeList.entrySet() ){
            System.out.println("the name-> "+entry.getKey()+" la note->" +entry.getValue());
                somme +=entry.getValue();



        }
        System.out.println("la somme est: "+somme);
        float moyenne= somme/etudeList.size();
        System.out.println("la moyenne:"+moyenne);









    }
}
