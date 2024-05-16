package serie4collections.Manage_Trains;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Train {
    private String code;
    private Personnel conducteur;
    private TypeTrain type;
    private int longueur;
    private ArrayList<Wagon> wagons;

    public Train(String code, Personnel conducteur, TypeTrain type){
         this.code=code;
         this.conducteur=conducteur;
         this.type=type;
    }
    public Train(String code, Personnel conducteur, TypeTrain type,
                 ArrayList<Wagon> wagons){
        this.code=code;
        this.conducteur=conducteur;
        this.type=type;
        this.longueur=0;
        this.wagons=new ArrayList<>(); ;
    }
    public int getLongueur(){
        return this.longueur;

    }

    public void setLongueur(int longueur){
        this.longueur=longueur;
    }
    public void ajouterWagonPassagers(String code, String description, int nombrePassagers)
            throws TrainWagonIncompatibleException{
                if(this.type==TypeTrain.Passagers){
                    wagons.add(new WagonPassagers(code,description,nombrePassagers));
                          this.longueur++;
                }else throw new TrainWagonIncompatibleException("Wagon incompatible  Passagers !");
    }
    public void ajouterWagonMinerai(String code, String description, float tonnage) throws
            TrainWagonIncompatibleException{
        if(this.type==TypeTrain.Minerai){
              wagons.add(new WagonMinerai(code,description,tonnage));
            this.longueur++;
        }else throw new TrainWagonIncompatibleException("Wagon incompatible a Minerai !");


    }
    public void ajouterWagonMarchandise(String code, String description, float volume) throws
            TrainWagonIncompatibleException{
        if(this.type==TypeTrain.Marchandise){
           wagons.add(new WagonMinerai(code,description,volume));
            this.longueur++;
        }else throw new TrainWagonIncompatibleException("Wagon incompatible a Marchandise !");

    }
    public void ajouterWagon(Wagon wagon) throws TrainWagonIncompatibleException{
                if((this.type==TypeTrain.Marchandise)&&(wagon instanceof WagonMarchandise)||(this.type==TypeTrain.Minerai)&&(wagon instanceof WagonMinerai)||
                        (this.type==TypeTrain.Passagers)&&(wagon instanceof WagonPassagers)||(this.type==TypeTrain.PassagersMarchandise)&&((wagon instanceof WagonMarchandise)||(wagon instanceof WagonPassagers)))
        {
            this.wagons.add(wagon);
            this.longueur++;
        }
          else{
                    throw new TrainWagonIncompatibleException("incompatible wagon !");
        }
    }
    public boolean supprimerWagon(String code){
           boolean deleted=false;
           for(Wagon wagon: wagons){
               if(wagon.getCode().equals(code)){
                   wagons.remove(wagon);
                   this.longueur--;
                   deleted=true;
               }
           }
           return deleted;
    }
    public void AfficherCharge(){
        float tonnage=0;
        int nombre=0;
        float volume=0;
        Scanner scanner= new Scanner (System.in);
        System.out.println("enter the train type please:");
        String typo=scanner.nextLine();
        switch (typo){
            case "Marchandise" :
                for(Wagon w : wagons){
                    if(w instanceof WagonMarchandise){
                        volume++;
                        System.out.println("le nombre d'objet  marchandise: "+((WagonMarchandise) w).getNombreWagonsMarchandise());
                        System.out.println("volume: "+volume);
                    }
                }
                break;
            case "Minerai" :
                for(Wagon w : wagons){
                    if(w instanceof WagonMinerai){
                        tonnage++;
                        System.out.println("le nombre d'objet minerai "+((WagonMinerai)w).getNombreWagonsMinerai());
                        System.out.println("tonnage :"+tonnage);
                    }
                } break;
            case "Passagers" :
                for(Wagon w : wagons){
                    if(w instanceof WagonPassagers){
                        nombre++;
                        System.out.println("le nombre d'objet Passagers  "+((WagonPassagers)w).getNombreWagonsPassagers());
                        System.out.println("le nombre passagers: "+nombre);
                    }}break;
            case "PassagersMarchandise" :
                        for(Wagon w : wagons){
                            if(w instanceof WagonPassagers){
                                nombre++;
                                System.out.println("le nombre d'objet Passagers  "+((WagonPassagers)w).getNombreWagonsPassagers());
                                System.out.println("le nombre passagers: "+nombre);
                            }
                            if(w instanceof WagonMarchandise){
                                volume++;
                                System.out.println("le nombre d'objet  marchandise: "+((WagonMarchandise) w).getNombreWagonsMarchandise());
                                System.out.println("volume: "+volume);
                            }
                        }break;

        }
    }




public static void main(String[] args) {
    Personnel conducteur = new Personnel("Engineer", "John Doe","Steve");

// Create train
    Train train = new Train("T001", conducteur, TypeTrain.Marchandise);


        try {
            // Add wagons
            train.ajouterWagonMarchandise("f1", "Marchandise Wagon 1", 10.0f);
            train.ajouterWagonMarchandise("a2", "Marchandise Wagon 2", 60.0f);
            train.ajouterWagonMinerai("g3", "Minerai Wagon 1", 80.0f);
            train.ajouterWagonPassagers("u4", "Passagers Wagon 1", 300);
        } catch (TrainWagonIncompatibleException e) {
            System.out.println(e.getMessage());
        }

        // Display train cargo
        train.AfficherCharge();

        // Remove a wagon
        boolean removed = train.supprimerWagon("W002");
        System.out.println("Wagon removed: " + removed);

    }








}
