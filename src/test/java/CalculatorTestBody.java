import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTestBody {

    @Test
    public void testGetSum() {
        assertEquals(15,CalculatorTest.getSum(10,5));
    }

    @Test
    public void testGetDivide() {
        assertEquals(3,CalculatorTest.getDivide((byte)15,(byte)5));
    }

    @Test
    public void testGetMultiple(){
        assertEquals(50,CalculatorTest.getMultiple(5,10));
    }
    @Test
    public void divisionWithException() {
        CalculatorTest.getDivide((byte) 15,(byte)0);
    }
}