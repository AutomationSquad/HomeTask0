import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    int numInt1 = 4;
    int numInt2 = 2;
    double numDoub1 = 4.5;
    double numDoub2 = 2.5;

    /*----------------------SUM-------------------------*/
    @Test
    public void sumInt() { Assert.assertEquals(6, Calculator.sum(numInt1,numInt2)); }

    @Test
    public void sumDoub() { Assert.assertEquals(7, Calculator.sum(numDoub1,numDoub2), 0);}


    /*-------------------SUBTRACTION------------------*/
    @Test
    public void subtrDoub() { Assert.assertEquals("Not Equal",2, Calculator.substraction(numDoub1, numDoub2), 0); }

    @Test
    public void subtrInt() {
        Assert.assertEquals("Not Equal",2, Calculator.substraction(numInt1, numInt2));
    }


    /*--------------------MULTIPLICATION----------------*/
    @Test
    public void multiplInt() { Assert.assertEquals("Not Equal",8, Calculator.multiplication(numInt1, numInt2)); }

    @Test
    public void multiplDoub() { Assert.assertEquals("Not Equal",11.25, Calculator.multiplication(numDoub1, numDoub2),0); }


    /*----------------------DIVISION--------------------*/
    @Test
    public void divisInt() { Assert.assertEquals("Not Equal",2, Calculator.division(numInt1, numInt2)); }

    @Test
    public void divisDoub() { Assert.assertEquals("Not Equal",1.8, Calculator.division(numDoub1, numDoub2),0); }

}
