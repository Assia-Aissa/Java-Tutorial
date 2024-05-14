package serie4collections.Streams;

public class Produit {

    private String nom;
    private String categorie;

    public Produit(String categorie,String nom) {
        this.categorie = categorie;
        this.nom=nom;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getNom() {
        return nom;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "categorie='" + categorie + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
