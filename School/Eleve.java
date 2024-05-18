package serie4collections.School;

public class Eleve implements Comparable{
    private String id;
    private String nom;
    private String prenom;
    private Parent parent;
    public Eleve(String id, String nom, String prenom, Parent parent) { }
    public Eleve(String id, String nom, String prenom) {

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    // on suppose que les getters & setters sont fournis

    public String getNom() {
        return this.nom;
    }


    @Override
    public int compareTo(Object o) {
        Eleve n=(Eleve)o;

        return this.getNom().compareTo(n.getNom());

    }
}
