package serie4collections.POO;

import java.util.Scanner;
import java.util.Objects;

public class Adress {
            private int numero;
            private String rue;
            private String quartier;
            private String ville;
            private String pays;

        public Adress(){

        }
    public Adress(int numero,String rue,String quartier,String ville,String pays){
    this.numero=numero;
    this.quartier=quartier;
    this.pays=pays;
    this.rue=rue;
    this.ville=ville;

    }
    public Adress(Adress adress){
        this.numero=adress.numero;
        this.quartier=adress.quartier;
        this.pays=adress.pays;
        this.rue=adress.rue;
        this.ville=adress.ville;
    }
    public void setRue(String rue){
            this.rue=rue;
    }
    public String getRue(){
            return this.rue;
    }
    public void setNumero(int numero){
            this.numero=numero;
    }
    public int getNumero(){
            return this.numero;
    }
    public void setQuartier(String quartier){
            this.quartier=quartier;
    }
    public String getQuartier(){
            return this.quartier;
    }
    public void setVille(String ville){
            this.ville=ville;
    }
    public String getVille(){
            return this.ville;
    }
    public String getPays(){
            return this.pays;
    }
    public void setPays(){
            this.pays=pays;
    }
    public String toString(){
            return "the address:{ Number:"+numero+" ,Rue: "+rue+" ,Quartier: "+quartier+" ,ville: "+ville+" ,pays: "+pays+ " }";
    }
    public void display(){
            System.out.println(toString());
    }
    public boolean equals(Object obj){
            if(obj==null){return false;}
            if(obj==this){return true;}
            if(this.getClass() != obj.getClass()){return false;}
            final Adress add=(Adress) obj;

            if(!Objects.equals(this.numero,add.numero)){return false;}
            if(!Objects.equals(this.rue,add.rue)){return false;}
            if(!Objects.equals(this.quartier,add.quartier)){return false;}
            if(!Objects.equals(this.ville,add.ville)){return false;}
            if(!Objects.equals(this.pays,add.pays)){return false;}
        return true;

    }

    public static void main(String[] args){
        System.out.println("enter your address");
        Scanner scan =new Scanner(System.in);
        String adres=scan.nextLine();
        Adress add=new Adress(2,"rue 2","quartier 2","ville 2","pays 2");
        add.display();
        System.out.println(adres);
        System.out.println(add.equals(adres));
        System.out.println("enter your adress infromation");
        System.out.println("number: ");
         int num=scan.nextInt();
         scan.nextLine();
        System.out.println("rue: ");
        String rue=scan.nextLine();
        System.out.println("quartier");
        String quartier=scan.nextLine();
        System.out.println("ville: ");
        String ville=scan.nextLine();
        System.out.println("Pays: ");
        String pay=scan.nextLine();

        Adress add2=new Adress(num,rue,quartier,ville,pay);
        add2.display();
        System.out.println(add2.equals(add));

    }
}
