public class Calculator {

    public static int addition(int number1, int number2){
        return number1 + number2;
    }

    public static int substraction(int number1, int number2){
        return number1 - number2;
    }

    public static int multiplication(int number1, int number2){
        return number1 * number2;
    }

    public static int division(int number1, int number2){
        if (number2 == 0) {
            throw new ArithmeticException("Operation is not supported. Cannot divide by zero.");
        }
        else {
            return number1 / number2;
        }
    }

    public static int reminder(int number1, int number2){
        return number1 % number2;
    }

    public static int incrementByOne(int number1){
        number1 ++;
        return number1;
    }

    public static int decrementByOne(int number1){
        number1 --;
        return number1;
    }

}
