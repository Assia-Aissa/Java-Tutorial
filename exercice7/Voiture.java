package serie4collections.exercice7;

class Voiture {
    private String marque;
    private String mod�le;
    private int ann�e;

    public Voiture(String marque, String mod�le, int ann�e) {
        this.marque = marque;
        this.mod�le = mod�le;
        this.ann�e = ann�e;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", mod�le='" + mod�le + '\'' +
                ", ann�e=" + ann�e +
                '}';
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getMod�le() {
        return mod�le;
    }

    public void setMod�le(String mod�le) {
        this.mod�le = mod�le;
    }

    public int getAnn�e() {
        return ann�e;
    }

    public void setAnn�e(int ann�e) {
        this.ann�e = ann�e;
    }
    
}
