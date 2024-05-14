package serie4collections.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tutorial1 {

    private static void Exercice1() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
    }
    private static void Exercice2(){
        List<String> chaine=new ArrayList<>();
        chaine.add("hello");chaine.add("my name is");
        chaine.add("assia");chaine.add("nice to meet u :)");
        System.out.println(chaine);
        chaine.stream().map(String::toUpperCase).forEach(System.out::println);
    }
    private static void Exercice3(){
        List<Person> people =new ArrayList<>();
        people.add(new Person("assia",20));
        people.add(new Person("hafsa",24));
        people.add(new Person("omar",16));

        System.out.println(people);
        people.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);
    }
        private static void Exercice4(){
            List<Integer> numbers=Arrays.asList(1,56,75,4,3,76,4,90,8);

            int somme= numbers.stream().reduce(0,Integer::sum);//0 est l'element neutre du somme

            System.out.println("la somme = "+somme);
        }
        private static void exercice(){
            List<Integer> numbers = Arrays.asList(3, 8, 1, 6, 2, 9, 4, 5);

            // Using reduce to find the maximum element in the list
            int max = numbers.stream()
                    .reduce(Integer.MAX_VALUE, Integer::min);
                                //MIN_VALUE,Intege:: max

            System.out.println("Maximum element: " + max);
        }

        private static void Exercice5(){
            List<Integer> list1=Arrays.asList(2,9,1,3);
            List<Integer> list2 = Arrays.asList(4, 5, 6);

            Stream.concat(list1.stream(),list2.stream()).sorted().forEach(System.out::println);

        }
        private static void Exercice11(){
        List<Produit> produits=new ArrayList<>();
        produits.add(new Produit("y","nom1"));
            produits.add(new Produit("a","nom2"));
            produits.add(new Produit("c","nom3"));
            produits.add(new Produit("h","nom5"));

            Map<String,List<Produit>> groupbyCategorie= produits.stream().collect(Collectors.groupingBy(Produit::getCategorie));

            System.out.println(groupbyCategorie);
        }
        private static void Exercice12(){
        List<Integer> integers=Arrays.asList(3,5,7,9,10,6);

        }
    public static void main(String[] args) {
        Exercice11();
     Scanner scanner =new Scanner(System.in);
     boolean exit=false;
     while(!exit){
         System.out.println("choose an exercice");
         int choice =scanner.nextInt();
         switch (choice){
             case 0:
                 exit = true;
                 break;
             case 1:
                 Exercice1();
                 break;
             case 2:
                 Exercice2();
                 break;
             case 3:
                 Exercice3();
                 break;
             case 4:
                 Exercice4();
                 break;
             case 5:
                 Exercice5();
                 break;
             case 6:
                 exercice();
                 break;

             case 11:
                 Exercice11();
                 break;
             default:
                 System.out.println("choice not correct , try again!.");

         }
     }

     System.out.println("Programme terminé.");
    }
}
