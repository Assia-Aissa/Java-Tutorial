package serie4collections.exercice4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<String> fileAttente = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Capacit� maximale de la file d'attente : ");
        int capaciteMaximale = scanner.nextInt();

        while (true) {
            System.out.println("Action (arriv�e/d�part) : ");
            String action = scanner.next();
            if (action.equals("arriv�e")) {
                if (fileAttente.size() < capaciteMaximale) {
                    System.out.println("Nom du client : ");
                    String nom = scanner.next();
                    fileAttente.offer(nom);
                    System.out.println(nom + " est arriv�. Taille de la file d'attente : " + fileAttente.size());
                } else {
                    System.out.println("La file d'attente est pleine.");
                }
            } else if (action.equals("d�part")) {
                if (!fileAttente.isEmpty()) {
                    String parti = fileAttente.poll();
                    System.out.println(parti + " est parti. Taille de la file d'attente : " + fileAttente.size());
                } else {
                    System.out.println("La file d'attente est vide.");
                }
            } else {
                System.out.println("Action non reconnue. Veuillez entrer 'arriv�e' ou 'd�part'.");
            }
        }
    }
}
