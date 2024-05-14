package serie4collections.ExpressionLambda;


import java.util.function.BinaryOperator;

public class Exercice9 {
    public static void main(String[]args){
        BinaryOperator<Integer> produit=(n,m)->n*m;

        System.out.println("le produit est= "+produit.apply(2,3));

    }

}
