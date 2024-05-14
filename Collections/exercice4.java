package serie4collections.Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class exercice4 {
    public static void main(String[] args){

        Queue<String> file=new LinkedList();
        System.out.println("entrer la capacite max du file: ");
        Scanner scanner=new Scanner(System.in);
        int capacite=scanner.nextInt();
        scanner.nextLine();

        while(true){
            System.out.println("enter action: ");
            String action=scanner.nextLine();
            if(action.equals("arrive")){
                if(file.size() < capacite){
                    System.out.println("le nom du client:");
                    String name=scanner.nextLine();
                    file.offer(name);
                    System.out.println(name+" est arrive a la file");
                    System.out.println(file);
                }
                else{
                    System.out.println("la file est pliene !");
                }
            }
            else if(action.equals("depart")){
                if(file.isEmpty()){
                    System.out.println("la file est vide");
                }
                else{
                    System.out.println(file);
                    String parti =  file.peek();
                    System.out.println(parti +" est quitter !");
                    System.out.println(file);
                }
            }
            else{
                System.out.println("incorrect input ");
            }

        }


    }
}
