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
    public void sumInt() { Assert.assertEquals("The result of the sum of the integer numbers isn't correct.",24, Calculator.sum(numInt1,numInt2)); }

    @Test
    public void sumDoub() { Assert.assertEquals("The result of the sum of the double numbers isn't correct.", 10, Calculator.sum(numDoub1,numDoub2), 0);}

    @Test
    public void sumDoubInt() { Assert.assertEquals("The result of the sum of the integer&double numbers isn't correct.", 21.5, Calculator.sum(numDoub1,numInt1), 0);}


    /*-------------------SUBTRACTION------------------*/
    @Test
    public void subtrDoub() { Assert.assertEquals("The result of the subtraction of the double numbers isn't correct.",1, Calculator.substraction(numDoub1, numDoub2), 0); }

    @Test
    public void subtrInt() { Assert.assertEquals("The result of the subtraction of the integer numbers isn't correct.",8, Calculator.substraction(numInt1, numInt2)); }

    @Test
    public void subtrDoubInt() { Assert.assertEquals("The result of the subtraction of the integer&double numbers isn't correct.",-2.5, Calculator.substraction(numDoub1, numInt2), 0); }


    /*--------------------MULTIPLICATION----------------*/
    @Test
    public void multiplInt() { Assert.assertEquals("The result of the multiplication of the integer numbers isn't correct.",128, Calculator.multiplication(numInt1, numInt2)); }

    @Test
    public void multiplDoub() { Assert.assertEquals("The result of the multiplication of the double numbers isn't correct.",24.75, Calculator.multiplication(numDoub1, numDoub2),0); }

    @Test
    public void multiplDoubInt() { Assert.assertEquals("The result of the multiplication of the integer&double numbers isn't correct.",44, Calculator.multiplication(numDoub1, numInt2),0); }


    /*----------------------DIVISION--------------------*/
    @Test
    public void divisInt() { Assert.assertEquals("The result of the division of the integer numbers isn't correct.",2, Calculator.division(numInt1, numInt2)); }

    @Test
    public void divisDoub() { Assert.assertEquals("The result of the division of the double numbers isn't correct.",1.2, Calculator.division(numDoub1, numDoub2),0.2); }

    @Test
    public void divisDoubInt() { Assert.assertEquals("The result of the division of the integer&double numbers isn't correct.",0.4, Calculator.division(numDoub1, numInt1),0.2); }


    /*----------------------------------------------------------NEGATIVE CASES----------------------------------------------------------------------*/

    /*----------------------SUM-------------------------*/
    @Test
    public void sumIntNeg() { Assert.assertEquals("IT'S NEGATIVE CASE FOR THE SUM OF THE INTEGER. IT SHOULD FALL.",5, Calculator.sum(numInt1,numInt2)); }

    @Test
    public void sumDoubNeg() { Assert.assertEquals("IT'S NEGATIVE CASE FOR THE SUM OF THE DOUBLE. IT SHOULD FALL.", 8, Calculator.sum(numDoub1,numDoub2), 0);}

    @Test
    public void sumDoubIntNeg() { Assert.assertEquals("IT'S NEGATIVE CASE FOR THE SUM OF THE INTEGER&DOUBLE. IT SHOULD FALL.", 13.5, Calculator.sum(numDoub1,numInt1), 0);}

    /*-------------------SUBTRACTION------------------*/
    @Test
    public void subtrDoubNeg() { Assert.assertEquals("IT'S NEGATIVE CASE FOR THE SUBTRACTION OF THE DOUBLE. IT SHOULD FALL.",8, Calculator.substraction(numDoub1, numDoub2), 0); }

    @Test
    public void subtrIntNeg() { Assert.assertEquals("IT'S NEGATIVE CASE FOR THE SUBTRACTION OF THE INTEGER. IT SHOULD FALL.",10, Calculator.substraction(numInt1, numInt2)); }

    @Test
    public void subtrDoubIntNeg() { Assert.assertEquals("IT'S NEGATIVE CASE FOR THE SUBTRACTION OF THE INTEGER&DOUBLE. IT SHOULD FALL.",12.5, Calculator.substraction(numDoub1, numInt2), 0); }


    /*--------------------MULTIPLICATION----------------*/
    @Test
    public void multiplIntNeg() { Assert.assertEquals("IT'S NEGATIVE CASE FOR THE MULTIPLICATION OF THE INTEGER. IT SHOULD FALL.",188, Calculator.multiplication(numInt1, numInt2)); }

    @Test
    public void multiplDoubNeg() { Assert.assertEquals("IT'S NEGATIVE CASE FOR THE MULTIPLICATION OF THE DOUBLE. IT SHOULD FALL.",12.15, Calculator.multiplication(numDoub1, numDoub2),0); }

    @Test
    public void multiplDoubIntNeg() { Assert.assertEquals("IT'S NEGATIVE CASE FOR THE MULTIPLICATION OF THE INTEGER&DOUBLE. IT SHOULD FALL.",48, Calculator.multiplication(numDoub1, numInt2),0); }



    /*----------------------DIVISION--------------------*/
    @Test
    public void divisIntNeg() { Assert.assertEquals("IT'S NEGATIVE CASE FOR THE DIVISION OF THE INTEGER. IT SHOULD FALL.",8, Calculator.division(numInt1, numInt2)); }

    @Test
    public void divisDoubNeg() { Assert.assertEquals("IT'S NEGATIVE CASE FOR THE DIVISION OF THE DOUBLE. IT SHOULD FALL.",8.4, Calculator.division(numDoub1, numDoub2),0.2); }

    @Test
    public void divisDoubIntNeg() { Assert.assertEquals("IT'S NEGATIVE CASE FOR THE DIVISION OF THE INTEGER&DOUBLE. IT SHOULD FALL.",2.4, Calculator.division(numDoub1, numInt1),0.2); }

}
