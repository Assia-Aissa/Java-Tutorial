package serie4collections.POO;

public interface IEtudiant {

 public float[] getNotes();
 public void setNotes(float[] t) throws NoteException;
    public Adress getAdress();
    public void setAdress(Adress adress);
    public String getNom();
    public void setNom(String nom);
    public String getPrenom();
    public void setPrenom(String prenom);
    public void setCne(String cne);
    public String getCne();
    public void afficherCoordonnees();
}
