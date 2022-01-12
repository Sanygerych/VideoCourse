package Lesson3;

public class Test3_4 {
    public static void main (String[] args) {

        int a=10;
        int b=50;
        int c=99;
        int d=100;

        boolean e= a<b && c++==d;  //true && false = false
        boolean f= a>b || c==d;  //false || true = true
        c--;
        boolean g= a>b & ++c==d;

        System.out.println(e);
        System.out.println(f);
        System.out.println(c);

        int x=10;
        int y=5;

        boolean b1=false;
        boolean b2=true;
        boolean b3=false;
        boolean b4=false;

        System.out.println(x|y);
        System.out.println(x&y);
        System.out.println(b1^b2^b3^b4);

    }
}
