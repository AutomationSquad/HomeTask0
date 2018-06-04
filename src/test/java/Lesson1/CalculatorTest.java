package Lesson1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calc = new Calculator();

    @Test
    public void testPlus() {
        assertEquals(4, calc.plus(2, 2));
        assertEquals(10, calc.plus(1, 9));
    }

    @Test
    public void testPlusNegative() {
        assertEquals("Sum calculated incorrect", 3, calc.plus(2, -5));
    }

    @Test
    public void testMinus() {
        assertEquals(2, calc.minus(6, 4));
        assertEquals(10, calc.minus(15, 5));
    }

    @Test
    public void testMinusNegative() {
        assertEquals("Minus calculated incorrect", 6, calc.minus(15, 10));
    }

    @Test
    public void testMultiplication() {
        assertEquals(4.5f, calc.multiplication(1.5f, 3), 5);
    }

    @Test
    public void testMultiplicationNegative() {
        assertEquals("Multiplication calculated incorrect", 6f, calc.multiplication(15f, 10), 0);
    }

    @Test
    public void testDivision() {
        assertEquals(2, calc.division(6, 3), 0);
    }

    @Test
    public void testDivisionNegative() {
        assertEquals("Division calculated incorrect", 10, calc.division(6,3), 0);
    }
}