package serie4collections.Manage_Trains;

public class WagonMarchandise extends Wagon {

    private final static float volumeMax=72;
    private float volume;
    private static int nombreWagonsMarchandise=0;


    public WagonMarchandise(String code,String description,float volume){
              super(code,description);
              this.volume=volume;
        nombreWagonsMarchandise++;

    }
    public static float getVolumeMax(){
        return WagonMarchandise.volumeMax;
    }
    public static int getNombreWagonsMarchandise(){
        return WagonMarchandise.nombreWagonsMarchandise;
    }

    public String toString(){
        return "Wagon-Marchandise:{"+super.toString()+" volume: "+volume+
                " VolumeMax: "+volumeMax+
               "}";
    }
}
