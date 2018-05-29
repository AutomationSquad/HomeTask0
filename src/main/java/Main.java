import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //input example: 10 + 5 + 10; SPACES ARE NECESSARY; No operation priority;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Result is: " + Calculator.calculate(scanner.nextLine()));

    }

}
