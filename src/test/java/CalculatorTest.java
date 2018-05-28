import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void additionByteCheck() {
        Assert.assertEquals(Calculator.getIntResult("+",10,20), (byte)30, 0);
    }

    @Test
    public void additionIntCheck() {
        Assert.assertEquals(Calculator.getIntResult("+",100,-100), 0, 0);
    }

    @Test
    public void additionIntSecondCheck() {
        Assert.assertEquals(Calculator.getIntResult("+",100,20), 120, 0);
    }

    @Test
    public void additionDoubleCheck() {
        Assert.assertEquals(Calculator.getDoubleResult("+",100.879,200.245), 301.124, 0);
    }

    @Test
    public void subtractionDoubleCheck() {
        Assert.assertEquals(Calculator.getDoubleResult("-",100.55,100.45), 0.1, 0.01);
    }

    @Test
    public void subtractionIntCheck() {
        Assert.assertEquals(Calculator.getIntResult("-",500,100), 400, 0);

    }

    @Test
    public void subtractionByteCheck() {
        Assert.assertEquals(Calculator.getIntResult("-",50,100), (byte)-50, 0);

    }

    @Test
    public void multiplicationDoubleCheck() {
        Assert.assertEquals(Calculator.getDoubleResult("*",4.5,2.5), 11.25, 0);
    }

    @Test
    public void multiplicationIntCheck() {
        Assert.assertEquals(Calculator.getIntResult("*",500,100), 50000, 0);

    }

    @Test
    public void multiplicationByteCheck() {
        Assert.assertEquals(Calculator.getIntResult("*",50,2), (byte)100, 0);

    }


    @Test
    public void divisionDoubleCheck() {
        Assert.assertEquals(Calculator.getDoubleResult("/",4.5,1.25), 3.6, 0);
    }

    @Test
    public void divisionIntCheck() {
        Assert.assertEquals(Calculator.getIntResult("/",500,100), 5, 0);

    }

    @Test
    public void divisionByteCheck() {
        Assert.assertEquals(Calculator.getIntResult("/",50,2), (byte)25, 0);

    }


    @Test
    public void divisionByZeroCheck() {
        try {
            Assert.assertEquals(Calculator.getIntResult("/", 50, 0), 0, 0);
            Assert.fail("ArithmeticException");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }

    }

    @Test
    public void multiplicationByteOutOfRange() {
        try {
            Assert.assertEquals(Calculator.getIntResult("*", (byte)50, (byte)50), (byte)2500, 0);
            Assert.fail("AssertionError");
        } catch (AssertionError e) {
            System.out.println("Error: " + e);
        }

    }

}
