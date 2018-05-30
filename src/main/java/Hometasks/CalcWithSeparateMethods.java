package Hometasks;

public class CalcWithSeparateMethods {
    public static void main (String args[]) {
        int intArgument1 = 0;
        int intArgument2 = 5;
        int intSum, SubtractionInt, MultiplicationInt, DividingInt;

        double doubleArgument1 = 2.569;
        double doubleArgument2 = 6.36589;
        double doubleSum, SubtractionDouble, MultiplicationDouble, DividingDouble;


        float floatArgument1 = (float) 0.0001;
        float floatArgument2 = (float) 0.99;
        float floatSum, SubtractionFloat, MultiplicationFloat, DividingFloat;

        //Addition
        intSum = intAddition(intArgument1, intArgument2);
        doubleSum = doubleAddition(doubleArgument1, doubleArgument2);
        floatSum = floatAddition(floatArgument1, floatArgument2);
        System.out.println("-----Additional in different types:-----");
        System.out.println("Integer: A = " + intArgument1 + "; B =  " + intArgument2 + "; A + B = " + intSum);
        System.out.println("Double: A = " + doubleArgument1 + "; B =  " + doubleArgument2 + "; A + B = " + doubleSum);
        System.out.println("Float: A = " + floatArgument1 + "; B =  " + floatArgument2 + "; A + B = " + floatSum);

        //Subtraction
        SubtractionInt = intSubtraction(intArgument1, intArgument2);
        SubtractionDouble = doubleSubtraction(doubleArgument1, doubleArgument2);
        SubtractionFloat = floatSubtraction(floatArgument1, floatArgument2);
        System.out.println("\n-----Subtraction in different types:-----");
        System.out.println("Integer: A = " + intArgument1 + "; B =  " + intArgument2 + "; A - B = " + SubtractionInt);
        System.out.println("Double: A = " + doubleArgument1 + "; B =  " + doubleArgument2 + "; A - B = " + SubtractionDouble);
        System.out.println("Float: A = " + floatArgument1 + "; B =  " + floatArgument2 + "; A - B = " + SubtractionFloat);

        //Multiplication
        MultiplicationInt = intMultiplication(intArgument1, intArgument2);
        MultiplicationDouble = doubleMultiplication(doubleArgument1, doubleArgument2);
        MultiplicationFloat = floatMultiplication(floatArgument1, floatArgument2);
        System.out.println("\n-----Multiplication in different types:-----");
        System.out.println("Integer: A = " + intArgument1 + "; B =  " + intArgument2 + "; A * B = " + MultiplicationInt);
        System.out.println("Double: A = " + doubleArgument1 + "; B =  " + doubleArgument2 + "; A * B = " + MultiplicationDouble);
        System.out.println("Float: A = " + floatArgument1 + "; B =  " + floatArgument2 + "; A * B = " + MultiplicationFloat);

        //Dividing
        DividingInt = intDividing(intArgument1, intArgument2);
        DividingDouble = doubleDividing(doubleArgument1, doubleArgument2);
        DividingFloat = floatDividing(floatArgument1, floatArgument2);
        System.out.println("\n-----Dividing in different types:-----");
        System.out.println("Integer: A = " + intArgument1 + "; B =  " + intArgument2 + "; A / B = " + DividingInt);
        System.out.println("Double: A = " + doubleArgument1 + "; B =  " + doubleArgument2 + "; A / B = " + DividingDouble);
        System.out.println("Float: A = " + floatArgument1 + "; B =  " + floatArgument2 + "; A / B = " + DividingFloat);
    }

    public static int intAddition (Integer arg1, Integer arg2) {
        int sum = 0;
        sum = arg1 + arg2;
        return sum;
    }

    public static double doubleAddition (Double arg1, Double arg2) {
        double sum = 0.00;
        sum = arg1 + arg2;
        return sum;
    }

    public static float floatAddition (Float arg1, Float arg2) {
        float sum = 0;
        sum = arg1 + arg2;
        return sum;
    }

    public static int intSubtraction (Integer arg1, Integer arg2) {
        int subtraction = 0;
        subtraction = arg1 - arg2;
        return subtraction;
    }

    public static double doubleSubtraction (Double arg1, Double arg2) {
        double subtraction = 0.00;
        subtraction = arg1 - arg2;
        return subtraction;
    }

    public static float floatSubtraction (Float arg1, Float arg2) {
        float subtraction = 0;
        subtraction = arg1 - arg2;
        return subtraction;
    }

    public static int intMultiplication (Integer arg1, Integer arg2) {
        int Multiplication = 0;
        Multiplication = arg1 * arg2;
        return Multiplication;
    }

    public static double doubleMultiplication (Double arg1, Double arg2) {
        double Multiplication = 0.00;
        Multiplication = arg1 * arg2;
        return Multiplication;
    }

    public static float floatMultiplication (Float arg1, Float arg2) {
        float Multiplication = 0;
        Multiplication = arg1 * arg2;
        return Multiplication;
    }

    public static int intDividing (Integer arg1, Integer arg2) {
        int Dividing = 0;
        Dividing = arg1 / arg2;
        return Dividing;
    }

    public static double doubleDividing (Double arg1, Double arg2) {
        double Dividing = 0.00;
        Dividing = arg1 / arg2;
        return Dividing;
    }

    public static float floatDividing (Float arg1, Float arg2) {
        float Dividing = 0;
        Dividing = arg1 / arg2;
        return Dividing;
    }

}
