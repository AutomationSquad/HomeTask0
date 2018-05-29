public class Calculator {
    public double addition () {
        double num1, num2, res1;
        num1 = 1.2356;
        num2 = 3.423;
        res1 = num1+num2;
        System.out.println("Op: + :" + res1);
        return res1;
    }
    public int deduction () {
        int num1, num2, res2;
        num1 = -1;
        num2 = 4;
        res2 = num1-num2;
        System.out.println("Op: - :" +res2);
        return res2;
    }

    public double multiplication () {
        double num1, res3;
        int  num2;
        num1 = 1.0000003;
        num2 = 46;
        res3 = num1*num2;
        System.out.println("Op: * :" +res3);
        return res3;
    }

    public double division () {
        double num1, res4;
        int num2;
        num1 = 2.4;
        num2 = 2;
        res4 = num1/num2;
        System.out.println("Op: / :" +res4);
        return res4;
    }
    public double sqrt () {
        double num1, res5;
        num1 = 9;
        res5 = Math.sqrt(num1);
        System.out.println("Op: sqrt :" +res5);
        return res5;
    }

    public static void main (String [] args){
        Calculator calc = new Calculator();
        double res1= calc.addition();
        double res2= calc.deduction();
        double res3= calc.multiplication();
        double res4= calc.division();
        double res5= calc.sqrt();
    }
}
