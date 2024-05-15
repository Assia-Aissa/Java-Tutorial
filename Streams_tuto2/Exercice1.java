package serie4collections.Streams_tuto2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercice1 {

        private static void Filtrage_basique(){
            List<Integer> integerList= Arrays.asList(4,7,8,9,3);
            integerList.stream().filter(n->n%2==0).forEach(System.out::println);
        }
        private static void Transtormation_Simple(){
            List<String> strings =new ArrayList<>();
            strings.add("assia");
            strings.add("Love the ");
            strings.add("java programming");
            System.out.println(strings);
            strings.stream().map(String::toUpperCase).forEach(System.out::println);
    }
        private static void Tri_Object() {
            List<Personne> personnes = new ArrayList<>();
            personnes.add(new Personne("Assia", 23));
            personnes.add(new Personne("alisia",15));
            personnes.add(new Personne("hafsa", 20));
            personnes.add(new Personne("salim", 38));
                System.out.println(personnes);
            personnes.stream().sorted(Comparator.comparing(Personne::getAge)).forEach(System.out::println);
            System.out.println("Sorted list in descending order of age:");
            personnes.stream()
                    .sorted(Comparator.comparing(Personne::getAge).reversed())
                    .forEach(System.out::println);
        }
        private static void Reduction_Somme(){
            List<Integer> integers =Arrays.asList(2,7);
            int  somme=integers.stream().reduce(0,Integer::sum);
            System.out.println(somme);
        }
        private static void Reduction_Product(){
            List<Integer> list=Arrays.asList(1,2,3,4);
            System.out.println("the first way ");
           int product1 = list.stream().reduce((a,b)->a*b).orElse(0);
           System.out.println(product1);
            System.out.println("the second way ");
            Optional<Integer> product2 =list.stream().reduce((a,b)->a*b);
            product2.ifPresentOrElse(p->System.out.println("produit:"+p),()->System.out.println("it's empthy"));
        }
        private static void Combinaison_2Streams(){
            List<Integer> list=Arrays.asList(1,2,3,4);
            List<Integer> list2=Arrays.asList(1,27,9,4);
            Stream.concat(list.stream(),list2.stream()).forEach(System.out::println);
            System.out.println("sorted one");
            Stream.concat(list.stream(),list2.stream()).sorted().forEach(System.out::println);

        }
        private static void Groupment_Categories(){
            List<Personne> list =new ArrayList<>();
            list.add(new Personne("hafsa",34));
            list.add(new Personne("ali",34));
            list.add(new Personne("omar",7));
            list.add(new Personne("assia",24));
            list.add(new Personne("amina",24));

            Map<Integer,List<Personne>> group=list.stream().collect(Collectors.groupingBy(Personne::getAge));
            group.forEach((age,person)->System.out.println("age: "+age+ " -->FOR: "+person));
        }
        private static void Moyenne(){

            List<Integer> notes=Arrays.asList(2,5,8,9,3);
            double moyenne=notes.stream().collect(Collectors.averagingInt(Integer::intValue));
            System.out.println("Moyenne des nombres : " + moyenne);

        }
        public static void main(String[] args){
         // Filtrage_basique();
          //Transtormation_Simple();
          //Tri_Object();
         // Reduction_Somme();
          //Reduction_Product();
          //Combinaison_2Streams();
          //Groupment_Categories();
          Moyenne();
      }

}
