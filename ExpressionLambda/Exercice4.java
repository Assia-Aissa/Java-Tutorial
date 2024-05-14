package serie4collections.ExpressionLambda;

interface Pair{
    boolean isPair(int a);
}


public class Exercice4 {
    public static void main(String[] args){

        Pair number=n-> n%2==0;

        boolean a=number.isPair(7);

System.out.println("does the number 7 pair? "+a);




    }
}
