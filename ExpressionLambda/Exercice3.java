package serie4collections.ExpressionLambda;

interface prod{
    double produit(double a,double b);
}

public class Exercice3 {

    public static void main(String[] args) {
        prod multipy = (num1, num2) -> num1 * num2;

        double a=multipy.produit(1.2, 5.6);
        System.out.println("the multiplication of the two numbers is= "+a );
    }
}
