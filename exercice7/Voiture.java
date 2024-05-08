package serie4collections.exercice7;

class Voiture {
    private String marque;
    private String modèle;
    private int année;

    public Voiture(String marque, String modèle, int année) {
        this.marque = marque;
        this.modèle = modèle;
        this.année = année;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", modèle='" + modèle + '\'' +
                ", année=" + année +
                '}';
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModèle() {
        return modèle;
    }

    public void setModèle(String modèle) {
        this.modèle = modèle;
    }

    public int getAnnée() {
        return année;
    }

    public void setAnnée(int année) {
        this.année = année;
    }
    
}
