package serie4collections.POO;

import java.util.ArrayList;
import java.util.List;


public class SMIS6 {
    private String nomFiliere;
    private List<Etudiant> etudiants;

    public SMIS6() {

    }

    public SMIS6(String nomFiliere, List<Etudiant> etudiants) {
        this.etudiants = new ArrayList(etudiants);
        this.nomFiliere = nomFiliere;

    }

    public SMIS6(SMIS6 smis6) {
        this.etudiants = new ArrayList(smis6.etudiants);
        this.nomFiliere = smis6.nomFiliere;
    }

    public String getNomFiliere() {
        return nomFiliere;
    }

    public void setNomFiliere(String nomFiliere) {
        this.nomFiliere = nomFiliere;
    }

    public List<Etudiant> getEtudiants() {
        return this.etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiantList) {
        this.etudiants.clear();
        this.etudiants.addAll(etudiantList);
    }

    public void afficherFiliere() {
        System.out.println("filiere :" + nomFiliere);
    }

    public void afficheListe() {
        for (Etudiant etudiant : etudiants) {
            etudiant.afficherCoordonnees();
        }
    }

    public int totale() {
        return this.etudiants.size();
    }

    public void ajouterEtudiant(Etudiant etudiant) {
        this.etudiants.add(etudiant);
    }

    public Etudiant chercherEtudiant(String cne) {
        boolean exist = false;
        Etudiant item = null;
        while (!exist && item == null) {
            for (Object obj : etudiants) {
                Etudiant etudiant = (Etudiant) obj;
                if ((etudiant.getCne().equals(cne))) {
                    exist = true;
                    item = etudiant;
                }
            }
        }
        return item;
    }

    /*public List<Etudiant>trier(){
        this.etudiants.sort();
    }*/
    public void trier(){
        this.etudiants.sort(new ComparateurNom());
    }

     public static void main(String[] args){
        List<Etudiant> etudiantList=new ArrayList<>();
         Adress add=new Adress(2,"rue1","Quartier1","ville1","Pays1");
        etudiantList.add(new Etudiant("M12345","steeve","jeorge",add));
         etudiantList.add(new Etudiant("a12ut945","john","ahmed",add));
         etudiantList.add(new Etudiant("djn2345","alan","omar",add));
         etudiantList.add(new Etudiant("M1djd45","gostave","nemo",add));

         SMIS6 smis6=new SMIS6("computer Science",etudiantList);
         smis6.ajouterEtudiant(new Etudiant("Emma", "Lee", "98765",add));
         smis6.afficheListe();
         smis6.afficherFiliere();
         System.out.println();
         smis6.ajouterEtudiant(new Etudiant("Emma", "Lee", "98765"));

         Etudiant searchedStudent = smis6.chercherEtudiant("a12ut945");
         if (searchedStudent != null) {
             System.out.println("Found student with CNE a12ut945:");
             searchedStudent.afficherCoordonnees();
         } else {
             System.out.println("Student with CNE 67890 not found.");
         }
         smis6.trier();
         System.out.println("Sorted list of students:");
         smis6.afficherFiliere();
         smis6.afficheListe();


     }
}