package serie4collections.Marriage_problem;

public interface IPersonne {
    void marier(Personne conjoint) throws DejaMarieException, MemeSexeException;

    void divorcer(Personne conjoint) throws NonMarieException;
    void afficherStatut();
    public String getCin();
}
