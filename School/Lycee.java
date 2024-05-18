package serie4collections.School;

import java.util.*;

public class Lycee {
    private String nom ;
    private Set<Parent> parents;
    private Map<String,Parent> delegues ;
    public Lycee(String nom){
        this.nom=nom;
        this.parents=new TreeSet<Parent>(new CompNbEnfants());
        this.delegues=new HashMap<String,Parent>();
    }



    public void ajouterParent(Parent parent) { }
    public Parent chercherParent(String cin) {
        Parent p=null;
        Iterator  it=this.parents.iterator() ;

        while(it.hasNext()){
            Parent parent=(Parent) it.next();
            if(parent.getCin().equals(cin)){
                p=parent;

                return p;
            }
        }
        return p;
    }

    public void ajouterDelegue(String cin) throws ParentnexistantException {
         Parent p=this.chercherParent(cin);
         if(p==null){throw new ParentnexistantException("parent n'existe pas!");}
         this.delegues.put(cin,p);
    }
    public void ajouterDelegue(Parent p) throws ParentnexistantException {
     if( !this.delegues.containsValue(p)){
         this.delegues.put(p.getCin(), p);
     }else{
         System.out.println(p.getNom()+"exist deja");
     }

    }
    public void ajouterDelegues(String[] tabCIN)  {
        for(String cin: tabCIN){
            try {
                this.ajouterDelegue(cin);
            } catch (ParentnexistantException e) {
                System.out.println(e.getMessage());
            }

        }
    }
    public void afficherPourcentageTypes() {
        int nbTuteur=0,nbMere=0,nbPere=0;
        int total=this.parents.size();
        for(Parent p : this.parents){
            if(p.getType()==TypeParent.mere){
                nbMere++;

            }
            if(p.getType()==TypeParent.pere){
                    nbPere++;

            }
            if(p.getType()==TypeParent.tuteur){
                nbTuteur++;

            }
        }
        System.out.println("->le precentage du mere: "+(nbMere/(float)total)*100+
                "% \n ->le percentage du Pere: "+(nbPere/(float)total)*100+
                "% \n ->le percentage du tuteur: "+(nbTuteur/(float)total)*100+"%");

    }

    @Override
    public String toString() {
        return "Lycee{" +
                "delegues=" + delegues +
                ", nom='" + nom +
                ", parents=" + parents +
                '}';
    }
}
