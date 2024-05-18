package serie4collections.School;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Parent {
    private String cin;
    private String nom;
    private String prénom;
    private TypeParent type;
    private Set<Eleve> enfants;

    public Set<Eleve> getEnfants() {
        return enfants;
    }

    public TypeParent getType() {
        return type;
    }

    public String getNom() {
        return nom;
    }

    public String getCin() {
        return cin;
    }

    public Parent(String cin) {
        this.cin = cin;
    }

    public Parent(String cin, String nom, String prénom, TypeParent type) {
        this.cin = cin;
        this.nom = nom;
        this.prénom = prénom;
        this.type = type;
        this.enfants = new TreeSet<>();
    }

    public void ajouterEnfant(Eleve eleve) {
        this.enfants.add(eleve);
    }

    public void ajouterEnfant(String id, String nom, String prenom) {
        this.enfants.add(new Eleve(id, nom, prenom));

    }

    public void ajouterEnfants(Set<Eleve> enfants) {
        this.enfants.addAll(enfants);
    }

    public Eleve chercherEnfant(String id) {
        Eleve e = null;
        for (Eleve eleve : enfants) {
            if (eleve.getId().equals(id)) {
                e = eleve;
                return e;
            }
        }
        return e;
    }

    public Eleve search(String id) {
        Eleve e = null;

        Iterator it = this.enfants.iterator();
        while (it.hasNext()) {
            Eleve eleve = (Eleve) it.next();
            if (eleve.getId().equals(id)) {
                e = eleve;
                return e;

            }

        }
        return e;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "cin='" + cin + '\'' +
                ", nom='" + nom + '\'' +
                ", prénom='" + prénom + '\'' +
                ", type=" + type +
                ", enfants=" + enfants +
                '}';
    }
}


