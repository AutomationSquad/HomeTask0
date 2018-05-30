public class Calculator {
    public double addition(double num1, double num2) {
        double res1;
        res1 = num1 + num2;
        System.out.println("Op: + :" + res1);
        return res1 ;
    }

    public int deduction(int num1, int num2) {
        int res2;
        res2 = num1 - num2;
        System.out.println("Op: - :" + res2);
        return res2;
    }

    public double multiplication(double num1, int num2) {
        double res3;
        res3 = num1 * num2;
        System.out.println("Op: * :" + res3);
        return res3;
    }

    public double division(double num1, int num2) {
        double res4;
        res4 = num1 / num2;
        System.out.println("Op: / :" + res4);
        return res4;
    }

    public double sqrt(double num1) {
        double res5;
        res5 = Math.sqrt(num1);
        System.out.println("Op: sqrt :" + res5);
        return res5;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double res1 = calc.addition(2.3, 5.23);
        double res2 = calc.deduction(2,-5);
        double res3 = calc.multiplication(2.34, 4);
        double res4 = calc.division(2.98, 2);
        double res5 = calc.sqrt(4);

    }
}
