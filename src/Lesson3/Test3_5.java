package Lesson3;

public class Test3_5 {
    public static void main (String[] args) {

        int a=10;
        int b=3;

        int c1= ++a - b*2;  // 11 - 6 = 5
        int c2= (++a - b)*2;  // (12 - 3)*2 = 18
        int c3= (a-- - b)*2;  // (12 - 3)*2 = 18

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(a);

        char c ='a';
        int i=10;
        int i2=c;

        System.out.println(i|c);


    }
}
