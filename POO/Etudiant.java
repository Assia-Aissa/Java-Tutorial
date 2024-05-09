package serie4collections.POO;

import java.util.Objects;

public class Etudiant implements IEtudiant {
            private String cne;
            private String nom;
            private String prenom;
            private Adress adress;
            private float[] notes;
            private static int total=0;
    public Etudiant()throws NoteException {
     total++;
    }
     public Etudiant(String cne,String nom,String prenom,Adress adress,float[] notes) throws NoteException {
        this.cne=cne;
        this.nom=nom;
        this.adress=adress;
        this.prenom=prenom;
        this.notes=copierNotes(notes);
        total++;
     }
    public Etudiant(String cne,String nom,String prenom,float[] notes) throws NoteException {
        this.cne=cne;
        this.nom=nom;
        this.prenom=prenom;
        this.notes=copierNotes(notes);
        total++;
    }
    public Etudiant(Etudiant etudiant) throws NoteException {
        this.cne=etudiant.cne;
        this.nom=etudiant.nom;
        this.adress=etudiant.adress;
        this.prenom=etudiant.prenom;
        this.notes=copierNotes(etudiant.notes);
        total++;
    }

    public Etudiant(String cne, String nom, String prenom,
                    int numero, String rue, String quartier, String ville, String pays,float[] notes) throws NoteException {
        this.cne = cne;
        this.nom = nom;
        this.prenom = prenom;
        this.adress = new Adress(numero, rue, quartier, ville, pays);
        this.notes=copierNotes(notes);
        total++;
        //this.notes = copierTableau(notes);
    }

   public  static float[] copierNotes(float[]t)throws NoteException{
        float[] table=new float[t.length];
        for(int i=0;i<table.length;i++){
            if (t[i]<0 || t[i]>20) throw new NoteException("note invalid ,");
            table[i]=t[i];
        }
        return table;
   }
    public float[] getNotes(){
        return this.notes;
    }

    public void setNotes(float[] notes) throws NoteException {
        this.notes=copierNotes(notes);
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

    public float moyenne(){
        float somme=0;
        for(int i=0;i<notes.length;i++){
            somme +=notes[i];
        }
        return somme/notes.length;
    }


    public static void main(String[] args) throws NoteException {
        Adress add=new Adress(2,"rue1","Quartier1","ville1","Pays1");
         Etudiant etudiant1=new Etudiant("M12345","steeve","alan",add,new float[]{10,20,18});
        Etudiant etudiant2 =new Etudiant("M145","steeve","alan",add,new float[]{12,16,13});
        Etudiant etudiant3=new Etudiant("M12345","steeve","alan",add,new float[]{14,15,17});

        etudiant1.afficherCoordonnees();
        etudiant2.afficherCoordonnees();
         System.out.println(etudiant3.equals(etudiant1));
         System.out.println(etudiant3.equals(etudiant2));

    }
}
