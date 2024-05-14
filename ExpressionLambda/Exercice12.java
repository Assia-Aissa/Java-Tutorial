package serie4collections.ExpressionLambda;

import java.util.function.Supplier;

public class Exercice12 {

public static void main(String[] args){
    Supplier<Integer> numbers=()->(int)(Math.random()*100)+1;
    System.out.println(numbers.get());
    System.out.println(numbers.get());
    System.out.println(numbers.get());
}

}
