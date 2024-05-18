package serie4collections.Marriage_problem;

public class Personne implements IPersonne{
    private String cin;
    private String nom;
    private Sexe sexe;
    private Personne conjoint;



    public Personne(String cin, String nom, Sexe sexe){
        this.cin=cin;
        this.nom=nom;
        this.sexe=sexe;
        this.conjoint = null;
    }
    public Personne(String cin, String nom, Sexe sexe, Personne conjointa){
        this.cin = cin;
        this.nom = nom;
        this.sexe = sexe;
        this.conjoint = conjointa;
        conjointa.conjoint=this;

    }

    public Personne(String cin, String nom, Sexe sexe,String cinConjoint, String
            nomConjoint, Sexe sexeConjoint){
        this.cin=cin;
        this.nom=nom;
        this.sexe=sexe;
        this.conjoint.cin=cinConjoint;
        this.conjoint.nom=nomConjoint;
        this.conjoint.sexe=sexeConjoint;

    }
    @Override
    public void marier(Personne conjoint)throws DejaMarieException,MemeSexeException{
         if(this.sexe != conjoint.sexe) {
             if ((this.conjoint == null) ) {
                 this.conjoint = conjoint;
                 this.conjoint.conjoint = this;
             } else {
                 throw new DejaMarieException("deja marie !");
             }
         }else{
            throw new MemeSexeException("imposible deja marie !");
        }

    }

    @Override
    public void divorcer(Personne conjoint) throws NonMarieException {
        if((this.conjoint==conjoint) &&(this.conjoint.conjoint==this)){
            this.conjoint.conjoint=null;
            this.conjoint=null;
        }
        else{
            throw new NonMarieException("impossible non marie");
        }

    }

    @Override
    public void afficherStatut() {
        if(this.conjoint!=null){
            System.out.println(this.nom+" est marie a "+this.conjoint.nom);
        }
        else{
            System.out.print(this.nom+" est celibataire");
        }
    }

    @Override
    public String getCin() {
        return this.cin;
    }

    public String getNom() {
        return this.nom;
    }

    public Sexe getSexe() {
        return sexe;
    }
}

