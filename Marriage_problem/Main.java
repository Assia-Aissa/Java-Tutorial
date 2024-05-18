package serie4collections.Marriage_problem;

public class Main {
    public static void main(String[] args) {

        Personne homme1=new Personne("FD45","Ali",Sexe.M);
        Personne femme1=new Personne("XD23","Sara",Sexe.F);
        Personne homme2=new Personne("RE467","Omar",Sexe.M);
        Personne femme2=new Personne("XT23","Noha",Sexe.F);
        try {
            homme1.marier(femme1);
        } catch (MemeSexeException | DejaMarieException ex) {
            System.out.println(ex.getMessage());
        }
        homme1.afficherStatut();
        femme1.afficherStatut();

        Groupe.afficherToutLesStatuts();
        Groupe.remplirListe();
        Groupe.MarierCelibataires();


        //homme1.divorcer();

    }
        }
