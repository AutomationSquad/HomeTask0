import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    int numInt1 = 16;
    int numInt2 = 8;
    double numDoub1 = 5.5;
    double numDoub2 = 4.5;

    /*----------------------------------------------------------POSITIVE CASES----------------------------------------------------------------------*/

    /*----------------------SUM-------------------------*/
    @Test
    public void sumInt() { Assert.assertEquals("Results are not equal",24, Calculator.sum(numInt1,numInt2)); }

    @Test
    public void sumDoub() { Assert.assertEquals("Results are not equal", 10, Calculator.sum(numDoub1,numDoub2), 0);}

    @Test
    public void sumDoubInt() { Assert.assertEquals("Results are not equal", 21.5, Calculator.sum(numDoub1,numInt1), 0);}

    /*-------------------SUBTRACTION------------------*/
    @Test
    public void subtrDoub() { Assert.assertEquals("Results are not equal",1, Calculator.substraction(numDoub1, numDoub2), 0); }

    @Test
    public void subtrInt() { Assert.assertEquals("Results are not equal",8, Calculator.substraction(numInt1, numInt2)); }

    @Test
    public void subtrDoubInt() { Assert.assertEquals("Results are not equal",-2.5, Calculator.substraction(numDoub1, numInt2), 0); }


    /*--------------------MULTIPLICATION----------------*/
    @Test
    public void multiplInt() { Assert.assertEquals("Results are not equal",128, Calculator.multiplication(numInt1, numInt2)); }

    @Test
    public void multiplDoub() { Assert.assertEquals("Results are not equal",24.75, Calculator.multiplication(numDoub1, numDoub2),0); }

    @Test
    public void multiplDoubInt() { Assert.assertEquals("Results are not equal",44, Calculator.multiplication(numDoub1, numInt2),0); }



    /*----------------------DIVISION--------------------*/
    @Test
    public void divisInt() { Assert.assertEquals("Results are not equal",2, Calculator.division(numInt1, numInt2)); }

    @Test
    public void divisDoub() { Assert.assertEquals("Results are not equal",1.2, Calculator.division(numDoub1, numDoub2),0.2); }

    @Test
    public void divisDoubInt() { Assert.assertEquals("Results are not equal",0.4, Calculator.division(numDoub1, numInt1),0.2); }


    /*----------------------------------------------------------NEGATIVE CASES----------------------------------------------------------------------*/

    /*----------------------SUM-------------------------*/
    @Test
    public void sumIntNeg() { Assert.assertEquals("IT'S NEGATIVE CASE. IT SHOULD FALL.",5, Calculator.sum(numInt1,numInt2)); }

    @Test
    public void sumDoubNeg() { Assert.assertEquals("IT'S NEGATIVE CASE. IT SHOULD FALL.", 8, Calculator.sum(numDoub1,numDoub2), 0);}

    @Test
    public void sumDoubIntNeg() { Assert.assertEquals("IT'S NEGATIVE CASE. IT SHOULD FALL.", 13.5, Calculator.sum(numDoub1,numInt1), 0);}

    /*-------------------SUBTRACTION------------------*/
    @Test
    public void subtrDoubNeg() { Assert.assertEquals("IT'S NEGATIVE CASE. IT SHOULD FALL.",8, Calculator.substraction(numDoub1, numDoub2), 0); }

    @Test
    public void subtrIntNeg() { Assert.assertEquals("IT'S NEGATIVE CASE. IT SHOULD FALL.",10, Calculator.substraction(numInt1, numInt2)); }

    @Test
    public void subtrDoubIntNeg() { Assert.assertEquals("IT'S NEGATIVE CASE. IT SHOULD FALL.",12.5, Calculator.substraction(numDoub1, numInt2), 0); }


    /*--------------------MULTIPLICATION----------------*/
    @Test
    public void multiplIntNeg() { Assert.assertEquals("IT'S NEGATIVE CASE. IT SHOULD FALL.",188, Calculator.multiplication(numInt1, numInt2)); }

    @Test
    public void multiplDoubNeg() { Assert.assertEquals("IT'S NEGATIVE CASE. IT SHOULD FALL.",12.15, Calculator.multiplication(numDoub1, numDoub2),0); }

    @Test
    public void multiplDoubIntNeg() { Assert.assertEquals("IT'S NEGATIVE CASE. IT SHOULD FALL.",48, Calculator.multiplication(numDoub1, numInt2),0); }



    /*----------------------DIVISION--------------------*/
    @Test
    public void divisIntNeg() { Assert.assertEquals("IT'S NEGATIVE CASE. IT SHOULD FALL.",8, Calculator.division(numInt1, numInt2)); }

    @Test
    public void divisDoubNeg() { Assert.assertEquals("IT'S NEGATIVE CASE. IT SHOULD FALL.",8.4, Calculator.division(numDoub1, numDoub2),0.2); }

    @Test
    public void divisDoubIntNeg() { Assert.assertEquals("IT'S NEGATIVE CASE. IT SHOULD FALL.",2.4, Calculator.division(numDoub1, numInt1),0.2); }

}
