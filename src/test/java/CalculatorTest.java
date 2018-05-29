import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    //positive cases

    @Test
    public void addition() {
        Calculator calc = new Calculator();
        double actual = calc.addition();
        assertEquals(4.6586, actual, 0);
    }

    @Test
    public void deduction() {
        Calculator calc = new Calculator();
        int actual = calc.deduction();
        assertEquals(-5, actual, 0);

    }

    @Test
    public void multiplication() {
        Calculator calc = new Calculator();
        double actual = calc.multiplication();
        assertEquals(46.0000138, actual, 0);
    }

    @Test
    public void division() {
        Calculator calc = new Calculator();
        double actual = calc.division();
        assertEquals(1.2, actual, 0);
    }

    @Test
    public void sqrt_() {
        Calculator calc = new Calculator();
        double actual = calc.sqrt();
        assertEquals(3, actual, 0);
    }

   //negative cases

    @Test
    public void addition_neg() {
        Calculator calc = new Calculator();
        double actual = calc.addition();
        assertEquals(3, actual, 0);
    }

    @Test
    public void deduction_neg() {
        Calculator calc = new Calculator();
        int actual = calc.deduction();
        assertEquals(-1, actual, 0);

    }

    @Test
    public void multiplication_neg() {
        Calculator calc = new Calculator();
        double actual = calc.multiplication();
        assertEquals(2, actual, 0);
    }

    @Test
    public void division_neg() {
        Calculator calc = new Calculator();
        double actual = calc.division();
        assertEquals(0.5, actual, 0);
    }

    @Test
    public void sqrt_neg() {
        Calculator calc = new Calculator();
        double actual = calc.sqrt();
        assertEquals(1, actual, 0);
    }
}

