package serie4collections.exercice6;

public class Personne implements Comparable<Personne> {
    private String nom;
    private int age;
    private double taille;

    public Personne(String nom, int age, double taille) {
        this.nom = nom;
        this.age = age;
        this.taille = taille;
    }

    public int compareTo(Personne autre) {
        return Integer.compare(this.age, autre.age);
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                ", taille=" + taille +
                '}';
    }
}