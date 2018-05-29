import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTestBody {

    private CalculatorTest calculatorTest;

    @Before
    public void initTest() {
        calculatorTest = new CalculatorTest();
    }

    @After
    public void afterTest() {
        calculatorTest = null;
    }

    @Test
    public void testGetSum() {
        assertEquals(15,calculatorTest.getSum(10,5));
    }

    @Test
    public void testGetDivide() {
        assertEquals(3,calculatorTest.getDivide((byte)15,(byte)5));
    }

    @Test
    public void testGetMultiple(){
        assertEquals(50,calculatorTest.getMultiple(5,10));
    }
    @Test
    public void divisionWithException() {
        calculatorTest.getDivide((byte) 15,(byte)0);
    }
}