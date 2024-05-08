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

    public boolean chercherEtudiant(String cne) {
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
        return exist;
    }

    public List<Etudiant>trier(){
        this.etudiants.sort();
    }








}






















