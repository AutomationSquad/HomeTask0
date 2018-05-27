import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test

    public void checSumTest() {

        int ia = 3;
        int ib = 5;

        Assert.assertEquals("Check your arguments", ia + ib, 8);
    }

    @Test

    public void checkSubtractTest() {

        double d1 = 5.55;
        double d2 = 3.33;

        Assert.assertEquals(d1 - d2, 2.22, 3);

    }

    @Test

    public void divideCheck() {

        int ii1 = 11;
        int ii2 = 2;

        Assert.assertEquals("Check your arguments", ii1 / ii2, 5);
    }


    @Test

    public void checkMult() {

        byte i = 2;
        byte b = 20;

        Assert.assertEquals("Check your arguments", i / b, 0);


    }

    @Test

    public void percentCheck() {

        short s1 = 9;
        short s2 = 4;

        Assert.assertEquals("Check your arguments", s1%s2, 1);
    }


    @Test

    public void addition1Check() {

        int i = 25;

        Assert.assertEquals("Check your arguments", i+=1, 26);
    }


    @Test

    public void subtraction1Check() {

        long l = 4333333L;

        Assert.assertEquals("Check your arguments", l -=1, 4333332L);

    }

    @Test

    public void mult1Check() {

        int i = 22;
        Assert.assertEquals("Check your arguments", i *= 3, 66);

    }
    @Test

    public void addition3Check() {

        int a = -5;
        int b = -3;

        Assert.assertEquals("Check your arguments", a+b, -8);
    }

    @Test

    public void negDivide1Check() {

        float f1 = 20.5f;

        Assert.assertEquals(f1 /= 2, 1.25, 2);
    }

    @Test

    public void negDivide2Check() {


        byte b = 8;
        byte c = -2;

        Assert.assertEquals("Check your arguments", b/c, 4);

    }

    @Test

    public void negAddition2Check () {

        byte b = 127;

        Assert.assertEquals("Check your arguments", b+=1, 128);

    }

    @Test

    public void negaddition2Check() {

        int a = -5;
        int b = -3;

        Assert.assertEquals("Check your arguments", a+b, 2);
    }

    @Test

    public void neg3MulCheck() {

        byte b = -3;
        byte d = -2;

        Assert.assertEquals("Check your arguments", b*d, -6);

    }

    @Test

    public void neg3DivideCheck() {

        byte b = 4;
        byte d = 2;

        Assert.assertEquals("Check your arguments", b/d, 3);
    }

    @Test

    public void negDivideZero() {

        int i = 44;
        int b = 0;

        Assert.assertEquals(i/b, 0);
    }
}

