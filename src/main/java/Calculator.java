import java.util.Scanner;

public class Calculator {
    public static void main (String[] args){
        System.out.println("Enter 1st and 2nd Integer numbers:");
        Scanner input= new Scanner(System.in);
        int n1,n2;
        n1 = input.nextInt();
        n2 = input.nextInt();
        int result;
        System.out.println("Enter your preferred operation type : + for addition, - for substraction, * for multiplication, / for division ");
        String set;
        set = input.next();
        switch (set){
            case "+":
                System.out.println(Maths.add(n1, n2));
                break;
            case "-":
                System.out.println(Maths.substract(n1, n2));
                break;
            case "*":
                System.out.println(Maths.multiply(n1, n2));
                break;
            case "/":
                System.out.println(Maths.divide(n1, n2));
                break;
            default:
                System.out.println("Not supported operation type!");
        }

    }

    //they are the same
    public static void incrementORDecrement(String type) {
        switch (type) {
            case "i++":
                System.out.println("for loop i++ increment:");
                for (int i = 0; i <= 10; i++) {
                    System.out.println(i);
                }
                break;
            case "++i":
                System.out.println("for loop ++i increment:");
                for (int i = 0; i <= 10; ++i) {
                    System.out.println(i);
                }
                break;
            case "i--":
                System.out.println("for loop i-- decrement:");
                for (int i = 10; i >= 0; i--) {
                    System.out.println(i);
                }
                break;
            case "--i":
                System.out.println("for loop --i decrement:");
                for (int i = 10; i >= 0; --i) {
                    System.out.println(i);
                }
                break;

            default:
                System.out.println("Illegal Increment or Decrement type!");
        }
    }

     public static void diffIncrement(String type){
        switch (type){
            case "i++":
                System.out.println("i++ increment:");
                int i = 0;
                while (i < 10) {
                    int a = i++;
                    System.out.println("value of a: " + a);
                }
                System.out.println("\n");
                break;
            case "++i":
                i = 0;
                System.out.println("++i increment:");
                while (i < 10){
                    int a = ++i;
                    System.out.println("value of a: " + a);
                }
                System.out.println("\n");
                break;

            default:
                System.out.println("Illegal Increment type!");
                System.out.println("\n");
        }

    }

}