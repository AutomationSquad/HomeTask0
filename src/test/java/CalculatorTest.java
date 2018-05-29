import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void addTest(){
        assertEquals("incorrect", Calculator.addition(), Calculator.x + Calculator.y);
    }

    @Test
    public void addWrongTest(){
        assertEquals("incorrect addition", Calculator.addition(), Calculator.x - Calculator.y);
    }

    @Test
    public void subTest(){
        assertEquals("incorrect", Calculator.subtraction(), Calculator.x - Calculator.y);
    }
    @Test
    public void multTest(){
        assertEquals("incorrect", Calculator.multiplication(), Calculator.x * Calculator.y, 1e-8);
    }
    @Test
    public void multWrongTest(){
        assertEquals("incorrect multiplication", Calculator.multiplication(), Calculator.x + Calculator.y, 1e-8);
    }
    @Test
    public void divTest(){
        if (Calculator.y != 0) {
        assertEquals(Calculator.division(), (double) Calculator.x / Calculator.y, 1e-8);
        }
        System.out.println("Impossible to run method - division. Division by zero ");
    }
    @Test
    public void modTest() {
        if (Calculator.z != 0) {
            assertEquals(Calculator.modulo(), Calculator.x % Calculator.z, 1e-8);
        }
        System.out.println("Impossible to run method - modulo. Division by zero ");
    }
}
