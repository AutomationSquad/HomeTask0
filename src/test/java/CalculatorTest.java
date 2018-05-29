import HomeTask0.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {


    private int ai1 = 2;
    private int ai2 = 3;
    private byte ab1 = 6;
    private byte ab2 = 3;
    private short as1 = 21;
    private short as2 = 4;
    private float af1 = 5.0f;
    private float af2 = 2.5f;


    @Test

    public void checkAddSumTest() {

        int checkSum = Calculator.addition(ai1, ai2);
        System.out.println("Sum two values " + ai1 + "+" + ai2 + "=" + checkSum);
        Assert.assertEquals("Addition of values is incorrect. Check your values", 5, checkSum);
    }

    @Test

    public void checkSubtractTest() {

        byte checkSubtract = Calculator.subtraction(ab1, ab2);
        System.out.println("Subtract two values " + ab1 + "-" + ab2 + "=" + checkSubtract);
        Assert.assertEquals("Subtract two values is incorrect. Check your values", 3, checkSubtract);

    }

    @Test

    public void divideCheck() {

        float checkDivide = Calculator.divide(af1, af2);
        System.out.println("Divide two values " + af1 + "/" + af2 + "=" + checkDivide);
        Assert.assertEquals(2.0, af1 / af2, 2);
    }


    @Test

    public void checkMult() {

        short checkMultiplication = Calculator.multiplication(as1, as2);
        System.out.println("Multiplication two values " + as1 + "/" + as2 + "=" + checkMultiplication);
        Assert.assertEquals("Multiplication two values is incorrect. Check your values", 84, checkMultiplication);


    }

    @Test

    public void remainderCheck() {

        short checkRemainderCheck = Calculator.remainder(as1, as2);
        System.out.println("Remainder two values " + as1 + "%" + as2 + "=" + checkRemainderCheck);
        Assert.assertEquals("Remainder two values is incorrect. Check your values", as1 % as2, checkRemainderCheck);
    }


    @Test

    public void negAddition2Check() {


        int negAddition = Calculator.addition(ai1, ai2);
        System.out.println("Sum two values " + ai1+ "+" + ai2 + "=" + negAddition);
        Assert.assertEquals("Addition two values is incorrect. Check your values", 6, negAddition);

    }


    @Test

    public void negDivideZero() {

        int i = 44;
        int b = 0;

        float divideZero = Calculator.divide(i, b);
        System.out.println("Divide on zero " + i + "/" + b + "=" + divideZero);
        Assert.assertEquals(0, divideZero, 1);
    }

}

