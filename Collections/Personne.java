package serie4collections.Collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Long.compare;

public class Personne implements Comparable<Personne>{

        private String nom;
        private int age;
        private float taille;

        public Personne(String nom,int age,float taille){
            this.nom=nom;
            this.age=age;
            this.taille=taille;
        }

        public String toString(){
            return "Personne{name: "+nom+" age: "+age+" taille: "+taille+"}";
        }

    @Override
    public int compareTo(Personne o) {
        return Integer.compare(this.age,o.age);
    }

    public static void main(String[] agrs){
            List<Personne> personneList=new ArrayList<>();
        personneList.add(new Personne("Ali", 25, 1.75f));
        personneList.add(new Personne("Omar", 30, 1.80f));
        personneList.add(new Personne("Hassan", 20, 1.70f));

        System.out.println("before sorting: "+personneList);
           Collections.sort(personneList);
        System.out.println("After sorting: "+personneList);

    }






}
