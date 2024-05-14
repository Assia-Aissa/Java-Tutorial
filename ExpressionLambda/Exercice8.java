package serie4collections.ExpressionLambda;


import java.util.function.UnaryOperator;

public class Exercice8 {
    public static void main(String[] args) {
        UnaryOperator<Integer> num = n -> n * n;

       System.out.println("the result= "+ num.apply(6));
    }
}
