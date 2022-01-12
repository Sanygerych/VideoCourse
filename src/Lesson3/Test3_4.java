package Lesson3;

public class Test3_4 {
    public static void main (String[] args) {

        int a=10;
        int b=50;
        int c=99;
        int d=100;

        boolean e= a<b && c++==d;  //true && false = false
        boolean f= a>b || c==d;  //false || true = true

        System.out.println(e);
        System.out.println(f);
        System.out.println(c);

    }
}
