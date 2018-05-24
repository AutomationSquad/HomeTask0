public class Calculator {

    public static int sum (int num1,int num2){return num1+num2;}
    public static double sum (double num1,double num2){return num1+num2;}

    public static int substraction (int num1,int num2){return num1-num2;}
    public static double substraction (double num1,double num2){return num1-num2;}

    public static int multiplication (int num1,int num2){return num1*num2;}
    public static double multiplication (double num1,double num2){return num1*num2;}

    public static int division (int num1,int num2){return num1/num2;}
    public static double division (double num1,double num2){return num1/num2;}


    public static void main(String[] args) {
        int numInt1 = 4;
        int numInt2 = 2;
        double numDoub1 = 4.5;
        double numDoub2 = 2.5;


        System.out.println(numInt1 + " + " + numInt2 + " = " + sum(numInt1, numInt2));
        System.out.println(numDoub1 + " + " + numDoub2 + " = " + sum(numDoub1, numDoub2));
        System.out.println(numDoub1 + " + " + numInt1 + " = " + sum(numDoub1, numInt1) + "\n");

        System.out.println(numInt1 + " - " + numInt2 + " = " + substraction(numInt1, numInt2));
        System.out.println(numDoub1 + " - " + numDoub2 + " = " + substraction(numDoub1, numDoub2));
        System.out.println(numDoub2 + " - " + numInt1 + " = " + substraction(numDoub2, numInt1) + "\n");

        System.out.println(numInt1 + " x " + numInt2 + " = " + multiplication(numInt1, numInt2));
        System.out.println(numDoub1 + " x " + numDoub2 + " = " + multiplication(numDoub1, numDoub2));
        System.out.println(numDoub1 + " x " + numInt2 + " = " + multiplication(numDoub1, numInt2) + "\n");

        System.out.println(numInt1 + " / " + numInt2 + " = " + division(numInt1, numInt2));
        System.out.println(numDoub1 + " / " + numDoub2 + " = " + division(numDoub1, numDoub2));
        System.out.println(numInt2 + " / " + numDoub2 + " = " + division(numInt2, numDoub2) + "\n");



    }
}
