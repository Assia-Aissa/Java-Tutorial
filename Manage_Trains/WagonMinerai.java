package serie4collections.Manage_Trains;

public class WagonMinerai extends Wagon{
    private final static float tonnageMax=22;// en tonnes
    private float tonnage;
    private static int nombreWagonsMinerai=0;


    public WagonMinerai(String code, String description,float tonnage) {
        super(code, description);
        this.tonnage=tonnage;
        nombreWagonsMinerai++;
    }

    public int getNombreWagonsMinerai(){
        return WagonMinerai.nombreWagonsMinerai;
    }
}
