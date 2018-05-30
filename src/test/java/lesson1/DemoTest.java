package lesson1;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {

    @Test
    public void checkSumTest () {
        byte num = 10;
        byte num1 = 100;
        Assert.assertEquals("Sum incorrect",num + num1, 100);
    }

    @Test
    public void checkOther () {
        int A = 200;
        Integer a1 = 200;

        Assert.assertTrue(A == a1);
    }

    //numA = numA>0?5:100;
}