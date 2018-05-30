import calculator.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testCalculatorTestAdd() {
        assertNotEquals("Wrong sum", 11, calculator.add(7, 3));
        assertNotEquals("Not correct", 8, calculator.add(7, 2));
        assertEquals("Correct", 11, calculator.add(8, 3));
    }

    @Test
    public void testCalculatorTestSubstract() {
        assertNotEquals("Not correct", 8, calculator.subsract(4, 2));
        assertNotEquals(12, calculator.subsract(17, 2));
        assertEquals("Correct", 2, calculator.subsract(4, 2));
    }

    @Test
    public void testCalculatorTestMult() {
        assertNotEquals(65, calculator.mult(4, 2));
        assertEquals(8, calculator.mult(4, 2));
    }

    @Test
    public void testDivide() {
        assertNotEquals(16, calculator.division(33, 2));
    }
}
}
