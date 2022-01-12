package Lesson2;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 =20;
        byte b3 = 100;

        short s1 = 5;
        short s2 = -10;
        short s3 = 0;

        int i1 = 500;

        long l1 = 1000;
        long l2 = 100000000000L;
        long l3 = 51L;

        float f1 = 3.14F;
        float f2 = 2.5f;
        float f3 = 20.0f;

        double d1 = 5.5;
        double d2 = 87.65d;


        char c1 = 'a';
        char c2 = 'A';
        char c3 = '7';
        char c4 = ' ';

        char c5 = 500;  // 10 система счисления (unicode)

        char c6 = '\u1234';  // 16 система счисления


        boolean bool1 = true;
        boolean bool2 = false;


        int a1 = 60;

        int a2 = 0B111100;  // 0B / 0b - число в двоичной системе счеслении

        int a3 = 074;  // 0 перед числом - восмеричная система счисления

        int a5 = 0x3c;  //  0x / 0X - шестнадцатиричная система счисления


        int a6 = 1_000_000_000;

        System.out.println(a3);

    }
}
