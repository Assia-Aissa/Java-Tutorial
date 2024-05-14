package serie4collections.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Voiture {
    private String marque;
    private String modele;
    private int annee;

    public Voiture() {
    }
    public Voiture(String marque,String modele,int annee){
        this.marque=marque;
        this.modele=modele;
        this.annee=annee;
    }
    public Voiture(Voiture voiture){
        this.marque=voiture.marque;
        this.modele=voiture.modele;
        this.annee=voiture.annee;
    }

    public int getAnnee() {
        return annee;
    }
    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", annee=" + annee +
                '}';
    }


    public static void main(String[] args){
        List<Voiture> voitures = new ArrayList<>();
        voitures.add(new Voiture("mercedece1","mod1",2020));
        voitures.add(new Voiture("mercedece2","mod2",2021));
        voitures.add(new Voiture("mercedece3","mod3",2022));

        voitures.add(new Voiture("mercedece4","mod4",2023));

        System.out.println(voitures);
        Collections.sort(voitures,new TriAnneeComparator());
        System.out.println("after;");
        System.out.println(voitures);
    }
}
