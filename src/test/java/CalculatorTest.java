import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testSumOfTwoIntegers() {
        int firstVariable = 10;
        int secondVariable = 20;

        Assert.assertEquals("Sum is incorrect", calculator.addInteger(firstVariable, secondVariable), firstVariable + secondVariable);
    }

    @Test
    public void testWillReturnErrorOnSummingTwoIntegers() {
        int firstVariable = 10;
        int secondVariable = 20;

        Assert.assertEquals("Sum is incorrect", calculator.addInteger(firstVariable, secondVariable), firstVariable);
    }

    @Test
    public void testSumOfTwoDoubles() {
        double firstVariable = 10.0;
        double secondVariable = 20.0;

        Assert.assertEquals(calculator.addDouble(firstVariable, secondVariable), firstVariable + secondVariable, 0.0);
    }

    @Test
    public void testFailAddDoubleMethog() {
        double firstVariable = 10.0;
        double secondVariable = 20.0;

        Assert.assertTrue("Sum is incorrect", (calculator.addDouble(firstVariable, secondVariable) == (firstVariable - secondVariable)));
    }

    @Test
    public void testValidDivideOfTwoIntegers() {
        int firstVariable = 10;
        int secondVariable = 20;

        Assert.assertEquals(calculator.divide(firstVariable, secondVariable), firstVariable / secondVariable, 0.0);
    }

    @Test
    public void testDivideZeroByIntegers() {
        int firstVariable = 0;
        int secondVariable = 20;

        Assert.assertEquals(calculator.divide(firstVariable, secondVariable), firstVariable / secondVariable, 0.0);
    }

    @Test
    public void testDivideByZero() {
        int firstVariable = 10;
        int secondVariable = 0;

        Assert.assertNull(calculator.divide(firstVariable, secondVariable));
    }

    @Test
    public void testFactorialOfZero() {
        int variable = 0;

        Assert.assertEquals(calculator.factorialCount(variable), (Integer) 1);
    }

    @Test
    public void testFactorialInsideIntegerBounds() {
        int variable = 7;

        Assert.assertEquals(calculator.factorialCount(variable), calculator.recursiveFactorial(variable));
    }

    @Test
    public void testFactorialOutOfIntegerBounds() {
        int variable = 20;

        Assert.assertNull(calculator.factorialCount(variable));
    }
}
