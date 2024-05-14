package serie4collections.ExpressionLambda;


interface ChaineLength {
    int Length(String c);
}
public class Exercice2 {
    public static void main(String[] args ){

        ChaineLength length = chaine-> chaine.length();
        int l=length.Length("assia");
        System.out.println("the length of the string is: "+l);



    }
}
