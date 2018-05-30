import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    //positive cases

    @Test
    public void addition() {
        Calculator calc = new Calculator();
        double actual = calc.addition(2.3, 5.23);
        assertEquals(7.53, actual, 0);
    }

    @Test
    public void deduction() {
        Calculator calc = new Calculator();
        int actual = calc.deduction(2,-5);
        assertEquals(7, actual, 0);

    }

    @Test
    public void multiplication() {
        Calculator calc = new Calculator();
        double actual = calc.multiplication(2.34, 4);
        assertEquals(9.36, actual, 0);
    }

    @Test
    public void division() {
        Calculator calc = new Calculator();
        double actual = calc.division(2.98, 2);
        assertEquals(1.49, actual, 0);
    }

    @Test
    public void sqrt_() {
        Calculator calc = new Calculator();
        double actual = calc.sqrt(4);
        assertEquals(2, actual, 0);
    }

   //negative cases


    @Test
    public void addition_neg() {
        Calculator calc = new Calculator();
        double actual = calc.addition(2.3, 5.23%3);
        assertEquals(7.53, actual, 0);
    }


    @Test
    public void division_zero() {
        Calculator calc = new Calculator();
        double actual = calc.division(2.98, 0);
        assertEquals(1.49, actual, 0);

    }
}

