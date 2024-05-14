package serie4collections.ExpressionLambda;

import java.util.function.Predicate;

public class Exercice10 {

    public static void main(String[] args){
        Predicate<Integer> isPositif=n->n>=0;

        System.out.println("does 5 positif ? "+isPositif.test(5));
        System.out.println("does -1 positif ? "+isPositif.test(-1));



    }
}
