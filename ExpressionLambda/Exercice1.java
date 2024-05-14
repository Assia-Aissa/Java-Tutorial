package serie4collections.ExpressionLambda;

interface somme{
    int sum(int a,int b);
}


public class Exercice1  {

    public static void main(String[] args) {
        somme i = (a, b) -> a + b;

       int a= i.sum(2, 4);
        System.out.println("la somme est: "+a);

    }
}
