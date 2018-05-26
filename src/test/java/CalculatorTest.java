import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void checkSum1 () {
        Assert.assertEquals(Calculator.a2 + Calculator.a3,5);
    }
    @Test
    public void checkSum2 () {
        Assert.assertEquals(Calculator.a + Calculator.a1, 1);
    }
    @Test
    public void checkSubtraction1 () {
        Assert.assertEquals(Calculator.b3 - Calculator.b1, 2.3, 0);
    }
    @Test
    public void checkSubtraction2 () {
        Assert.assertEquals(Calculator.a9 - Calculator.a, 9);
    }
    @Test
    public void checkMultiple1 () {
        Assert.assertEquals(Calculator.a1 * Calculator.a8, 8);
    }
    @Test
    public void checkDivide () {
        Assert.assertEquals(Calculator.b3 / Calculator.a2, 1.75, 0);
    }
}
