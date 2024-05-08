package serie4collections.POO;

import java.util.Objects;

public class Etudiant {
            private String cne;
            private String nom;
            private String prenom;
            private Adress adress;
            private static int total=0;
    public Etudiant(){
     total++;
    }
     public Etudiant(String cne,String nom,String prenom,Adress adress){
        this.cne=cne;
        this.nom=nom;
        this.adress=adress;
        this.prenom=prenom;
        total++;
     }
    public Etudiant(Etudiant etudiant){
        this.cne=etudiant.cne;
        this.nom=etudiant.nom;
        this.adress=etudiant.adress;
        this.prenom=etudiant.prenom;
        total++;
    }

    public Etudiant(String cne, String nom, String prenom,
                    int numero, String rue, String quartier, String ville, String pays) {
        this.cne = cne;
        this.nom = nom;
        this.prenom = prenom;
        this.adress = new Adress(numero, rue, quartier, ville, pays);
        total++;
        //this.notes = copierTableau(notes);
    }
    public static int getTotale(){
        return total;
    }
    public Adress getAdress() {
        return adress;
    }
    public void setAdress(Adress adress){
        this.adress=adress;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom=prenom;
    }
    public void setCne(String cne){
        this.cne=cne;
    }
    public String getCne(){
        return this.cne;
    }
    public String toString(){
        return "{Etudiant: cne: "+cne+" ,Nom: "+nom+" ,Prenom: "+prenom+"adress: "+adress+" }";
    }

    public boolean equals(Object obj){
        if(obj==this){return true;}
        if(obj==null){return false;}
        if(obj.getClass() != this.getClass()){
            return false;
        }
        final Etudiant etudiant=(Etudiant) obj;
        if(!Objects.equals(etudiant.adress,this.adress)){return false;}
        if(!Objects.equals(etudiant.cne,this.cne)){return false;}
        if(!Objects.equals(etudiant.nom,this.nom)){return false;}
        if(!Objects.equals(etudiant.prenom,this.prenom)){return false;}
        return true;
    }
    public void afficherCoordonnees(){
        System.out.println(toString());
    }

    public static void main(String[] args){
        Adress add=new Adress(2,"rue1","Quartier1","ville1","Pays1");
         Etudiant etudiant1=new Etudiant("M12345","steeve","alan",add);
        Etudiant etudiant2 =new Etudiant("M145","steeve","alan",add);
        Etudiant etudiant3=new Etudiant("M12345","steeve","alan",add);

        etudiant1.afficherCoordonnees();
        etudiant2.afficherCoordonnees();
         System.out.println(etudiant3.equals(etudiant1));
         System.out.println(etudiant3.equals(etudiant2));

    }
}
