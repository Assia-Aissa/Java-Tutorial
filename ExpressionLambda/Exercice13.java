package serie4collections.ExpressionLambda;

import java.util.function.Consumer;

public class Exercice13 {

    public static void main(String[] args){

        Consumer<String> convert=s->System.out.println(s.toUpperCase());
System.out.println("the to upperCase: ");
        convert.accept("assia");


    }
}
