import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test

    public void Number1Test() {
        int num1 = 10;
        int num2 = 15;


        Assert.assertEquals("Incorrect","25","25");
    }

    @Test

    public void Number2Test1() {
        int num1 = 17;
        int num2 = 5;

        Assert.assertEquals("Incorrect", "12", "12");
    }

    @Test

    public void Number2Test2() {
        int num1 = 15;
        int num2 = 10;

        Assert.assertEquals("Incorrect","12","5");
    }

    @Test

    public void Number3Test() {
        int num1 = 20;
        int num2 = 10;

        Assert.assertEquals("Incorrect","200","200");
    }

    @Test

    public void Number4Test() {
        int num1 = 33;
        int num2 = 5;

        Assert.assertEquals("Incorrect","6,6","6,6");

    }

}
