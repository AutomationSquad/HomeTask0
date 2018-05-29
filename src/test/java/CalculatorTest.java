import org.junit.Assert;
import org.junit.Test;
import java.util.Random;

public class CalculatorTest {
    Calculator calc = new Calculator();
    Random random = new Random();

    @Test
    public void correctSum() {
        //tried to play with random values
        int a = random.nextInt(100);
        int b = random.nextInt(1000);
        int c = calc.sumInt(a,b);
        Assert.assertTrue("Sum "+a+"+"+b+" was calculated incorrectly.\nExpected result:\t"+(a+b)+"\nActual result:\t\t"+c,c==a+b);
    }

    @Test
    public void correctSubtraction() {
        float c = calc.subtractFloat(10.25f,-2.75f);
        Assert.assertTrue("Result of subtraction is incorrect.\nExpected result:\t13.0\nActual result:\t\t"+c,c==13f);
    }

    @Test
    public void correctDivision() {
        double c = calc.divideDouble(150.3d,3d);
        Assert.assertTrue("Result of division is incorrect.\nExpected result:\t50.1\nActual result:\t\t"+c,c==50.1d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divisionByZeroIsRestricted() {
        calc.divideDouble(150.3d,0);
        System.out.println("Restriction for division by zero doesn't work!");//Message is shown in case when expected exception wasn't thrown
    }

    @Test
    public void correctMultiplication() {
        long c = calc.multiplyLong(150_000_000,20);
        Assert.assertTrue("Result of multiplication is incorrect\nExpected result:\t3000000000\nActual result:\t\t"+c,c==3_000_000_000l);
    }
}
