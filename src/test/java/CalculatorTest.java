import org.junit.Assert;
import org.junit.Test;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void AdditionTest() {
        assertEquals(4, Calculator.addition(2, 2));
        assertEquals(0, Calculator.addition(0, 0));
        assertEquals(-4, Calculator.addition(-2, -2));
        assertNotEquals(3, Calculator.addition(2, 2));
    }

    @Test
    public void SubstractionTest() {
        assertEquals(0, Calculator.substraction(2, 2));
    }

    @Test
    public void MultiplicationTest() {
        assertEquals(4, Calculator.multiplication(2, 2));
    }

    @Test
    public void DivisionTest() {
        assertEquals(1, Calculator.division(2, 2));
        assertEquals(0, Calculator.division(0, 2));
        assertNotEquals(0, Calculator.division(2, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void DivisionOnZeroTest() {
        Calculator.division(2, 0);
    }

    @Test
    public void ReminderTest(){
        assertEquals(1, Calculator.reminder(10,3));
        assertNotEquals(3, Calculator.reminder(10,3));
    }

    @Test
    public void IncrementByOneTest(){
        assertEquals(3, Calculator.incrementByOne(2));
    }

    @Test
    public void DecrementByOneTest(){
        assertEquals(1, Calculator.decrementByOne(2));
    }


}
