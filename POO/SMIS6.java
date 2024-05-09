package serie4collections.POO;

import java.util.ArrayList;
import java.util.List;


public class SMIS6 {
    private String nomFiliere;
    private List<IEtudiant> etudiants;

    public SMIS6() {

    }

    public SMIS6(String nomFiliere, List<IEtudiant> etudiants) {
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

    public List<IEtudiant> getEtudiants() {
        return this.etudiants;
    }

    public void setEtudiants(List<IEtudiant> etudiantList) {
        this.etudiants.clear();
        this.etudiants.addAll(etudiantList);
    }

    public void afficherFiliere() {
        System.out.println("filiere :" + nomFiliere);
    }

    public void afficheListe() {
        for (IEtudiant etudiant : etudiants) {
            etudiant.afficherCoordonnees();
        }
    }

    public int totale() {
        return this.etudiants.size();
    }

    public void ajouterEtudiant(IEtudiant etudiant) {
        this.etudiants.add(etudiant);
    }

    public IEtudiant chercherEtudiant(String cne) {
        boolean exist = false;
        IEtudiant item = null;
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

     public static void main(String[] args) throws NoteException {
        List<IEtudiant> etudiantList=new ArrayList<>();
         etudiantList.add(EtudiantFactory.Instance("M12345", "steeve", "jeorge", 2,"rue1","Quartier1","ville1","Pays1", new float[]{10 , 20, 15}));
         etudiantList.add(EtudiantFactory.Instance("a12ut945", "john", "ahmed",  3,"rue2","Quartier2","ville2","Pays2",new float[]{15 , 20, 14}));
         etudiantList.add(EtudiantFactory.Instance("djn2345", "alan", "omar",  4,"rue3","Quartier3","ville3","Pays3",new float[]{19 , 2, 15}));
         etudiantList.add(EtudiantFactory.Instance("M1djd45", "gostave", "nemo",  5,"rue4","Quartier4","ville4","Pays4",new float[]{12 , 20, 15}));


         SMIS6 smis6=new SMIS6("computer Science",etudiantList);

         smis6.afficheListe();
         smis6.afficherFiliere();
         System.out.println();
         smis6.ajouterEtudiant(new Etudiant("Emma", "Lee", "98765",7,"rue7","Quartier7","ville7","Pays7", new float[]{23 , 67, 15}));

         IEtudiant searchedStudent = smis6.chercherEtudiant("a12ut945");
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