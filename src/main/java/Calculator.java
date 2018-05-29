public class Calculator {

    public static double addition(double number1, double number2){
        return number1 + number2;
    }

    public static double substraction(double number1, double number2){
        return number1 - number2;
    }

    public static double multiplication(double number1, double number2){
        return number1 * number2;
    }

    public static double division(double number1, double number2){
        if (number2 == 0) {
            throw new ArithmeticException("Operation is not supported. Cannot divide by zero.");
        }
        else {
            return number1 / number2;
        }
    }

    public static double reminder(double number1, double number2){
        return number1 % number2;
    }

    public static double incrementByOne(double number1){
        return ++number1;
    }

    public static double decrementByOne(double number1){
        return --number1;
    }

}
