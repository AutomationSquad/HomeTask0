package Hometasks;

import org.junit.Assert;
import org.junit.Test;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.error;

public class TestsForCalc {

    //Позитивні кейси на операцію Додавання (типи int, double, float)
    @Test
    public void checkIntAddition() {
        int sum = CalcWithSeparateMethods.intAddition(0, -7);
        Assert.assertEquals(-7, sum);
    }

    @Test
    public void checkDoubleAddition() {
        double sum = CalcWithSeparateMethods.doubleAddition(0.125, -7.25);
        Assert.assertEquals(-7.125, sum, 0.001);
    }

    @Test
    public void checkFloatAddition() {
        float sum = CalcWithSeparateMethods.floatAddition(0.125f, -7.25f);
        Assert.assertEquals(-7.125f, sum,0.001);
    }

    //Позитивні кейси на Віднімання (int, double. float)
    @Test
    public void checkIntSubtraction() {
        int substruction = CalcWithSeparateMethods.intSubtraction(14, 15);
        Assert.assertEquals(-1, substruction);
    }

    @Test
    public void checkDoubleSubtraction() {
        double substruction = CalcWithSeparateMethods.doubleSubtraction(2.000, 1.000);
        Assert.assertEquals(0.99, substruction, 0.1);
    }

    @Test
    public void checkFloatSubtraction() {
        float substruction = CalcWithSeparateMethods.floatSubtraction(2.00f, 1.00f);
        Assert.assertEquals(0.99f, substruction, 0.1f);
    }

    //Позитивні кейси на Множення (int, double. float)
    @Test
    public void checkIntMultiplication() {
        int multiplication = CalcWithSeparateMethods.intMultiplication(38000, 50000);
        Assert.assertEquals(1900000000, multiplication);
    }

    @Test
    public void checkDoubleMultiplication() {
        double multiplication = CalcWithSeparateMethods.doubleMultiplication(0.00, 7.99);
        Assert.assertEquals(0, multiplication,0.01);
    }

    @Test
    public void checkFloatMultiplication() {
        float multiplication = CalcWithSeparateMethods.floatMultiplication(5.25f, 7.99f);
        Assert.assertEquals(41.9475f, multiplication, 0.01f);
    }

    //Позитивні кейси на Ділення (int, double. float)
    @Test
    public void checkIntDividing() {
        int dividing = CalcWithSeparateMethods.intDividing(50, 10);
        Assert.assertEquals(5, dividing);
    }

    @Test
    public void checkDoubleDividing() {
        double dividing = CalcWithSeparateMethods.doubleDividing(50.25, 10.05);
        Assert.assertEquals(5, dividing, 0.01);
    }

    @Test
    public void checkFloatDividing() {
        float dividing = CalcWithSeparateMethods.floatDividing(50.25f, 10.05f);
        Assert.assertEquals(5f, dividing, 0.01f);
    }

    //Негативний кейс на Додавання (вихід за межі допустимого діапазону)
    @Test
    public void checkNegativeIntAddition() {
        int sum = CalcWithSeparateMethods.intAddition(-2147483648, -0);
        Assert.assertEquals(-2147483648, sum);
    }

    //Негативний кейс на Множення
    @Test
    public void checkNegativeDoubleMultiplication() {
        double sum = CalcWithSeparateMethods.doubleMultiplication(Math.PI, Math.E);
        //System.out.println(sum);
        Assert.assertEquals(8.539734222673566, sum, 0.000000000000001);
        //Assert.assertTrue("\nExpected:\t8.539734222673566\nActual:\t\t"+ sum,sum==8.539734222673566);
    }

    //Негативний кейс на 0
    @Test
    public void checkNegativeIntDividing() {
        double sum = CalcWithSeparateMethods.doubleDividing(Math.PI, 0.00);
        //Assert.assertEquals(error, sum, 0.000000000000001);
        Assert.assertTrue("\nExpected:\tInfinity\nActual:\t\t"+sum,sum==error);
    }

}