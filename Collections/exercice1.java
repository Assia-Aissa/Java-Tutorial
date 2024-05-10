package serie4collections.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercice1 {


    public static void main(String[] args){
        List<String> noms=new ArrayList<>();
        noms.add("amina");
        noms.add("assia");
        noms.add("doha");
        noms.add("hakima");
        System.out.println(noms);
        System.out.println("entrer le nom d'etudient: ");
        Scanner scanner= new Scanner(System.in);
        String name=scanner.nextLine();

            if(noms.contains(name)) {
                System.out.println("exist");
            }else{
                System.out.println("not exist!!");
            }
        }
    }

