package serie4collections.ExpressionLambda;


import java.util.function.Function;

public class Exercice6 {
    public static void main(String[] args){
        Function<Integer,Integer> squareFunction= num -> num * num;

        int n=squareFunction.apply(3);
        System.out.println("the square is "+n);

    }
}
