import java.util.Scanner;

public class Calculator {

    static int x = 10;
    static int y = 3;
    static int z = 0;

    public static void main(String[] args) {
        System.out.println("a + b = " + addition(x, y));
        System.out.println("a - b = " + subtraction(x, y));
        System.out.println("a * b = " + multiplication(x, y));
        System.out.println("a / b = " + division(x, y));
        System.out.println("a % b = " + modulo(x, y));
        System.out.println("Have a good day");
    }

   static int addition(int x, int y){
       return x + y;
    }

    static  int subtraction(int x, int y){
        return x - y;
    }

    static  double multiplication(int x, int y){
        return x * y;
    }

    static  Double division(int x, int y){
        if (y != 0){
            return (double)x / y;
        }
        return null;
    }

    static Double modulo(int x, int y){
        if (z != 0){
            return (double)x % z;
        }
        return null;
    }

}
