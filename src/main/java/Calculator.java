public class Calculator {
    static byte a = 0;
    static short a1 = 1;
    static int a2 = 2;
    static int a3 = 3;
    static int a4 = 4;
    static int a5 = 5;
    static int a6 = 6;
    static long a7 = 7;
    static long a8 = 8;
    static int  a9 = 9;
    static double b = 0.1;
    static double b1 = 1.2;
    static double b3 = 3.5;

    public static void main(String[] args) {
        sum1();
        sum2();
        subtraction1();
        subtraction2();
        multiple1();
        divide1();
    }
    public static void sum1 () {
        int c;
        System.out.println(c = a2 + a3);

    }
    public static void sum2() {
        int d = a + a1;
        System.out.println(d);
    }
    public static void subtraction1 () {
        double e = b3 - b1;
        System.out.println(e);
    }
    public static void subtraction2 () {
        long g = a9 - a;
        System.out.println(g);
    }
    public static void multiple1 () {
        long m;
        if (a8 > b3) {
            m = a1 * a8;
        }
        else {
            m = a2 * a8;
        }
        System.out.println(m);
    }
    public static void divide1 () {
        double y = b3 / a2;
        System.out.println(y);
    }
}