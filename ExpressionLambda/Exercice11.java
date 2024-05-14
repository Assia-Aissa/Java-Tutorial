package serie4collections.ExpressionLambda;

import java.util.function.BiPredicate;

public class Exercice11 {
    public static void main(String[] args){
        BiPredicate<String,String> Eagaux=(s1,s2)->s1.length()==s2.length();

        System.out.println("result = "+Eagaux.test("assiaa","study"));
    }
}
