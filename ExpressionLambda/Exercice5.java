package serie4collections.ExpressionLambda;

interface twoString{
    boolean longeur(String a,String b);
}

public class Exercice5 {
    public static void main(String[] args) {
        twoString sti = (string1, string2) -> string1.length() == string2.length();

       boolean a= sti.longeur("assia", "javaa");

        System.out.println("does the two string equals: "+a);

    }
}
