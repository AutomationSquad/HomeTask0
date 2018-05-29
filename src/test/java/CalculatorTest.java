
import org.junit.Assert;
import org.junit.Test;



public class CalculatorTest {

    @Test
    public void additionTest() {
        Assert.assertEquals(4, Calculator.addition(2, 2), 0);
        Assert.assertEquals(4, Calculator.addition(2, 2.5), 0.5);
        Assert.assertEquals(0, Calculator.addition(0, 0), 0);
        Assert.assertEquals(-4, Calculator.addition(-2, -2), 0);
        Assert.assertNotEquals(3, Calculator.addition(2, 2), 0);
    }

    @Test
    public void substractionTest() {
        Assert.assertEquals(0, Calculator.substraction(2, 2), 0);
    }

    @Test
    public void multiplicationTest() {
        Assert.assertEquals(4, Calculator.multiplication(2, 2), 0);
    }

    @Test
    public void divisionTest() {
        Assert.assertEquals(1, Calculator.division(2, 2), 0);
        Assert.assertEquals(0, Calculator.division(0, 2), 0);
        Assert.assertNotEquals(0, Calculator.division(2, 2), 0);
    }

    @Test(expected = ArithmeticException.class)
    public void divisionOnZeroTest() {
        Calculator.division(2, 0);
    }

    @Test
    public void reminderTest(){
        Assert.assertEquals(1, Calculator.reminder(10,3), 0);
        Assert.assertNotEquals(3, Calculator.reminder(10,3), 0);
    }

    @Test
    public void incrementByOneTest(){
        Assert.assertEquals(3, Calculator.incrementByOne(2), 0);
    }

    @Test
    public void decrementByOneTest(){
        Assert.assertEquals(1, Calculator.decrementByOne(2), 0);
    }


}
