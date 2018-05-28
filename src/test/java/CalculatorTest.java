import org.junit.Assert;
import org.junit.Test;



public class CalculatorTest {


    @Test
    public void summTest1 () {
        int s = 5;
        int s1 = 230;
        Assert.assertEquals(Calculator.summOperation(s, s1), 235, 0);
    }
    @Test
    public void summTest2 () {
        int s = -2;
        int s1 = -100;
        Assert.assertEquals(Calculator.summOperation(s, s1), -102, 0);
    }
    @Test
    public void summTest3 () {
        int s = 0;
        int s1 = 100;
        Assert.assertEquals(Calculator.summOperation(s, s1), 100, 0);
    }
    @Test
    public void summTest4 () {
        double s = 0;
        int s1 = -100;
        Assert.assertEquals(Calculator.summOperation(s, s1), -100, 0);
    }
    @Test
    public void summTest5 () {
        byte s = -1;
        byte s1 = 1;
        Assert.assertEquals(Calculator.summOperation(s, s1), 0, 0);
    }
    @Test
    public void summTest6 () {
        double s = -0.5;
        int s1 = 100;
        Assert.assertEquals(Calculator.summOperation(s, s1), 99.5, 0);
    }
    @Test
    public void subtractionTest1 () {
        int m = 2;
        int m1 = 100;
        Assert.assertEquals(Calculator.subtractionOperation(m, m1), -98,0);
    }
    @Test
    public void subtractionTest2 () {
        int m = 100;
        int m1 = 2;
        Assert.assertEquals(Calculator.subtractionOperation(m, m1), 98, 0);
    }
    @Test
    public void subtractionTest3 () {
        int m = 100;
        int m1 = 100;
        Assert.assertEquals(Calculator.subtractionOperation(m, m1), 0, 0);
    }
    @Test
    public void subtractionTest4 () {
        double m = 0.78;
        int m1 = 100;
        Assert.assertEquals(Calculator.subtractionOperation(m, m1), -99.22,0);
    }
    @Test
    public void multiplicationTest1 () {
        int t = 4;
        int t1 = 20;
        Assert.assertEquals(Calculator.multiplicationOperation(t, t1), 80, 0);
    }
    @Test
    public void multiplicationTest2 () {
        int t = -4;
        int t1 = -20;
        Assert.assertEquals(Calculator.multiplicationOperation(t, t1), 80, 0);
    }
    @Test
    public void multiplicationTest3 () {
        int t = -4;
        int t1 = 20;
        Assert.assertEquals(Calculator.multiplicationOperation(t, t1), -80, 0);
    }
    @Test
    public void multiplicationTest4 () {
        int t = 0;
        int t1 = 20;
        Assert.assertEquals(Calculator.multiplicationOperation(t, t1), 0, 0);
    }
    @Test
    public void multiplicationTest5 () {
        double t = 0.5;
        int t1 = 20;
        Assert.assertEquals(Calculator.multiplicationOperation(t, t1), 10, 0);
    }
    @Test
    public void multiplicationTest6 () {
        double t = 0.5;
        double t1 = 1.4;
        Assert.assertEquals(Calculator.multiplicationOperation(t, t1), 0.7, 0);
    }
    @Test
    public void divisionTest1 () {
        int d = 4;
        int d1 = 2;
        Assert.assertEquals(Calculator.divisionOperation(d, d1),2,0);
    }
    @Test
    public void divisionTest2 () {
        int d = 40;
        int d1 = -2;
        Assert.assertEquals(Calculator.divisionOperation(d, d1),-20,0);
    }
    @Test
    public void divisionTest3 () {
        int d = 0;
        int d1 = 2;
        Assert.assertEquals(Calculator.divisionOperation(d, d1),0,0);
    }
    @Test
    public void divisionTest4 () {
        int d = 4;
        int d1 = 0;
        try {
            Calculator.divisionOperation(d, d1);
            Assert.fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            System.out.println("Error" + e);
        }
    }
  @Test
    public void divisionTest5 () {
        double b = 40;
        double b1 = 0.5;
        Assert.assertEquals(Calculator.division1Operation(b, b1), 80,0);
    }
   @Test
    public void divisionTest6 () {
        double b = 4.5;
        double b1 = 0.5;
        Assert.assertEquals(Calculator.division1Operation(b, b1), 9, 0);
    }
    @Test
    public void sqrtTest1 () {
        double q = 4;
        Assert.assertEquals(Calculator.sqrtOperation(q),2,0);
    }
    @Test
    public void sqrtTest2 () {
        double q = 0;
        Assert.assertEquals(Calculator.sqrtOperation(q),0,0);
    }
    @Test
    public void sqrtTest3 () {
        double q = -4;
        Assert.assertTrue("q can't be negative", Calculator.sqrtOperation(q)>=0);
    }

}