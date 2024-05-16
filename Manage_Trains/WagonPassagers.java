package serie4collections.Manage_Trains;

public class WagonPassagers extends Wagon{
    private final static int nombrePassagersMax=50;
    private int nombrePassagers;
    private static int nombreWagonsPassagers=0;


    public WagonPassagers(String code, String description) {
        super(code, description);
        nombreWagonsPassagers++;
    }
    public WagonPassagers(String code, String description,int nombrePassagers) {
        super(code, description);
        this.nombrePassagers=nombrePassagers;
        nombreWagonsPassagers++;
    }

public int getNombreWagonsPassagers(){
        return WagonPassagers.nombreWagonsPassagers;
}










}
