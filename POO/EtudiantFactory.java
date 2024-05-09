package serie4collections.POO;

public class EtudiantFactory {
   public static IEtudiant Instance(String cne, String nom, String prenom,
                                    int numero, String rue, String quartier, String ville, String pays,float[] notes)throws NoteException{
       return new Etudiant(cne,nom,prenom,numero,rue,quartier,ville,pays,notes);
   }
}
