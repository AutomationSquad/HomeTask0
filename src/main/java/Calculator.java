import java.util.Scanner;

public class Calculator {

    static int x = 10;
    static int y = 3;
    static int z = 0;

    public static void main(String[] args) {
        System.out.println("a + b = " + addition());
        System.out.println("a - b = " + subtraction());
        System.out.println("a * b = " + multiplication());
        System.out.println("a / b = " + division());
        System.out.println("a % b = " + modulo());
        System.out.println("Have a good day");
    }

   static int addition(){
       return x + y;
    }

    static  int subtraction(){
        return x - y;
    }

    static  double multiplication(){
        return x * y;
    }

    static  Double division(){
        if (y != 0){
            return (double)x / y;
        }
        return null;
    }

    static Double modulo(){
        if (z != 0){
            return (double)x % z;
        }
        return null;
    }

}
