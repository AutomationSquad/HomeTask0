import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    static int x = 12;
    static int y = 5;
    static int z = 0;

    @Test
    public void addTest() {
        assertEquals("incorrect addition", Calculator.addition(x, y), x + y);
    }

    @Test
    public void addWrongTest() {
        assertEquals("incorrect addition", Calculator.addition(x, y), x - y);
    }

    @Test
    public void subTest() {
        assertEquals("incorrect subtraction", Calculator.subtraction(x, y), x - y);
    }

    @Test
    public void multTest() {
        assertEquals("incorrect multiplication", Calculator.multiplication(x, y), x * y, Double.MIN_VALUE);
    }

    @Test
    public void multWrongTest() {
        assertEquals("incorrect multiplication", Calculator.multiplication(x, y), x + y, Double.MIN_VALUE);
    }

    @Test
    public void divTest() {
        if (Calculator.y != 0) {
            assertEquals("incorrect division", Calculator.division(x, y), (double) x / y, Double.MIN_VALUE);
        } else {
            System.out.println("Impossible to run method - division. Division by zero ");
        }
    }

    @Test
    public void modTest() {
        if (Calculator.z != 0) {
            assertEquals("incorrect modulo", Calculator.modulo(x, y), x % z, Double.MIN_VALUE);
        } else {
            System.out.println("Impossible to run method - modulo. Division by zero ");
        }
    }
}
