import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testAddFunction() throws Exception {
        assertEquals(calculator.add(0,5), 5);
    }

    @Test
    public void testSubFunction() throws Exception {
        assertEquals(calculator.sub(10,5),5);
    }

    @Test
    public void testDivFunction() throws Exception {
        assertEquals(calculator.div(15,3), 5);
    }

    @Test
    public void testMultFunction() throws Exception {
        assertEquals(calculator.mult(5,3), 15);
    }
}
