package serie4collections.Marriage_problem;

import java.util.ArrayList;

public class Groupe {
    private static ArrayList<Personne> liste;



    public Groupe() {
        liste = new ArrayList<>() ;
        remplirListe();
    }
    static void remplirListe() {
        liste.add(new Personne("0","Ali Alaoui",Sexe.M));
        liste.add(new Personne("1","Samira Alaoui",Sexe.F));
        liste.add(new Personne("2","Omar Omari",Sexe.M));
        liste.add(new Personne("3","Hassan Hassani",Sexe.M));
        liste.add(new Personne("4","Souad Ziani",Sexe.F));

    }


    public IPersonne getPersonne(String cne) {
        IPersonne p = null;
        for (Object  personne : liste) {
                IPersonne person =(IPersonne) personne;
            if (person.getCin().equals(cne) ){
                p = person;
                break;
            }
        }
        return p;
    }

    public int taille() {
       return liste.size();
    }
    public static void afficherToutLesStatuts(){
        for (IPersonne  p : liste){
             p.afficherStatut();
        }
    }
    public static void MarierCelibataires(){
        Personne p1,p2;
        for (int i=0;i<liste.size()-1;i++){
            p1=(Personne)liste.get(i);
            for(int j=i+1 ;j<liste.size();j++){
                p2=(Personne) liste.get(j);
                try{
                    p1.marier(p2);
                    System.out.println("mariage :"+p1.getNom()+" avec "+p2.getNom());
                }catch (MemeSexeException e) {
                    System.out.println(e.getMessage()+" "+p1.getSexe()+" "+p2.getSexe());

                }catch (DejaMarieException e){
                    System.out.println(e.getMessage());
                }
            }

        }


    }


}
