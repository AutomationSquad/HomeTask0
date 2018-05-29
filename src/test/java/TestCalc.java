
import org.junit.Test;
import junit.framework.Assert;

public class TestCalc {

    @Test
    public void testCalc() {
        Assert.assertEquals(Calculator.calculate("15 + 10"), 25f);
        Assert.assertEquals(Calculator.calculate("15 * 10"), 150f);
        Assert.assertEquals(Calculator.calculate("200 - 100"), 100f);
        Assert.assertEquals(Calculator.calculate("10 / 2"), 5f);
        Assert.assertEquals(Calculator.calculate("1.4E-45 + 1.4E-45"), 2.8E-45f);
        Assert.assertEquals(Calculator.calculate("0 * 0"), 0f);
        Assert.assertEquals(Calculator.calculate("-15 + 10"), -5f);
        Assert.assertTrue(Float.isInfinite(Calculator.calculate("10 / 0")));
        Assert.assertTrue(Float.isNaN(Calculator.calculate("0 / 0")));
    }

}
