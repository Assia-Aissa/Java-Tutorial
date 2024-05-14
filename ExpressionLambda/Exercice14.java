package serie4collections.ExpressionLambda;

import java.util.function.Consumer;
import java.util.function.Function;

public class Exercice14 {

    public static void main(String[] args) {
        Function<String, Integer> stringLength = String::length;

        //String inputString = "Hello, World!";
        int length = stringLength.apply("Hello, World!");

        System.out.println("Length of the string: " + length);
    }}