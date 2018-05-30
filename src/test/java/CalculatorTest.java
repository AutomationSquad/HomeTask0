import org.junit.Test;
import static org.junit.Assert.*;


public class CalculatorTest {

    @Test
    public void sumTest() {
        int num1 = 10;
        int num2 = 15;
        assertEquals("Incorrect sum",25, Calculator.sum(num1, num2));
    }

    @Test
    public void subtractionTest1() {
        int num1 = 17;
        int num2 = 5;
        assertEquals("Incorrect subtraction",12, Calculator.subtraction(num1, num2));
    }

    @Test
    public void subtractionTest2() {
        int num1 = 15;
        int num2 = 10;
        assertEquals("Incorrect subtraction",12, Calculator.subtraction(num1, num2));
    }

    @Test
    public void multiplyTest() {
        int num1 = 20;
        int num2 = 10;
        assertEquals("Incorrect multiply",200, Calculator.multiply(num1, num2));
    }

    @Test
    public void divideTest() {
        double num1 = 4.5;
        double num2 = 0.5;
        assertEquals("Incorrect divide", 9, Calculator.divide(num1,num2),0);
    }


}
