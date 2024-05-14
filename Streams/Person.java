package serie4collections.Streams;

public class Person {
    private String nom;
    private int age;


    public Person(String nom,int age){
        this.nom=nom;
        this.age=age;
    }
    public int getAge() {
        return age;
    }

    public String getNom() {
        return nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", nom='" + nom + '\'' +
                '}';
    }
}
