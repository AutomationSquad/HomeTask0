
import java.util.Scanner;

public class Calculator {

    public static String getOperation() {
        String calcAction;

        Scanner scanner = new Scanner(System.in);
        System.out.print("type operation + - * or /");
        calcAction = scanner.next();
        return calcAction;

    }

    public static double getDoubleResult(String calcAction, double num1, double num2) {

        double res = 0;

        if (calcAction.equals("+")) {
            res = num1 + num2;
        } else{
            if (calcAction.equals("-")) {
                res = num1 - num2;
            } else {
                if (calcAction.equals("*")) {
                    res = num1 * num2;
                } else {
                    if (calcAction.equals("/")) {
                        res = num1 / num2;
                    } else {
                        System.out.println("Operation is not supported");
                    }
                }
            }
        }

        return res;
    }


    public static int getIntResult(String calcAction, int num1, int num2) {

        int res = 0;

        if (calcAction.equals("+")) {
            res = num1 + num2;
        } else{
            if (calcAction.equals("-")) {
                res = num1 - num2;
            } else {
                if (calcAction.equals("*")) {
                    res = num1 * num2;
                } else {
                    if (calcAction.equals("/")) {
                        res = num1 / num2;
                    } else {
                        System.out.println("Operation is not supported");
                    }
                }
            }
        }

        return res;
    }


    public static void main (String[] args){
        double number1 = 5.5;
        double number2 = 4.5;
        int number3 = 20;
        int number4 = 4;
        String calcAction = getOperation();
        double result = getDoubleResult(calcAction, number1, number2);
        System.out.println("result for double numbers: "+ result);
        int result1 = getIntResult(calcAction, number3, number4);
        System.out.println("result for int numbers: "+ result1);

    }

}
