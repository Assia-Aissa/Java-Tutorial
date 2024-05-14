package serie4collections.ExpressionLambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Exercice7 {

    public static void main(String[] args){
        BiFunction<Integer,Integer,Integer> somme=(n1,n2)->n1+n2;

        System.out.println("la somme= "+somme.apply(4,9));




    }


}
