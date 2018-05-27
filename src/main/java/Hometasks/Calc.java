package Hometasks;

import java.util.Scanner;

public class Calc {

    public static void  main(String args[]) {

        //double a1 = Double.parseDouble(args[0]);
        //double a2 = Double.parseDouble(args[1]);

        System.out.println("Please enter number A: ");
        Scanner scanA = new Scanner(System.in);
        String A = scanA.next();


        System.out.println("Please enter number B: ");
        Scanner scanB = new Scanner(System.in);
        String B = scanB.next();

        System.out.println("Your A = " + A);
        System.out.println("Your B = " + B);

        //Чи нормально так передавати аргументи у методи?
        intOperations(Integer.parseInt(A), Integer.parseInt(B));
        floatOperations(Float.parseFloat(A), Float.parseFloat(B));
        doubleOperations(Double.parseDouble(A), Double.parseDouble(B));
        percentCalculation(Double.parseDouble(A), Double.parseDouble(B));
    }

    public static void doubleOperations(Double arg1, Double arg2){
        double a1 = arg1;
        double a2 = arg2;
        double addition = 0, subtraction = 0, multiplication = 0, division = 0, mode = 0;

        addition = a1 + a2;
        subtraction = a1 - a2;
        multiplication = a1 * a2;
        division = a1 / a2;
        mode = a1 % a2;

        System.out.println("----------Double:----------");
        System.out.println("A = " +a1);
        System.out.println("B = " +a2);
        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);
        System.out.println("Mode = " + mode);
        System.out.println("---------------------------");

    }

    public static void intOperations(Integer arg1, Integer arg2){
        int a1 = arg1;
        int a2 = arg2;
        int addition = 0, subtraction = 0, multiplication = 0, division = 0, mode = 0;

        addition = a1 + a2;
        subtraction = a1 - a2;
        multiplication = a1 * a2;
        division = a1 / a2;
        mode = a1 % a2;

        System.out.println("----------Integer:----------");
        System.out.println("A = " +a1);
        System.out.println("B = " +a2);
        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);
        System.out.println("Mode = " + mode);
        System.out.println("---------------------------");
    }

    public static void floatOperations(Float arg1, Float arg2){
        float a1 = arg1;
        float a2 = arg2;
        float addition = 0, subtraction = 0, multiplication = 0, division = 0, mode = 0;

        addition = a1 + a2;
        subtraction = a1 - a2;
        multiplication = a1 * a2;
        division = a1 / a2;
        mode = a1 % a2;

        System.out.println("----------Float:----------");
        System.out.println("A = " +a1);
        System.out.println("B = " +a2);
        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);
        System.out.println("Mode = " + mode);
        System.out.println("---------------------------");
    }

    public static void percentCalculation(Double argument1, Double argument2) {
        double value = argument1;
        double percent = argument2;
        double findPercentFromValue = 0;

        findPercentFromValue = value / 100 * percent;

        System.out.println("----------Find percent from value:----------");
        System.out.println("Value is " + value);
        System.out.println("Percent is " + percent);
        System.out.println("" + percent + " from " + value + " is " + findPercentFromValue);
    }

}
