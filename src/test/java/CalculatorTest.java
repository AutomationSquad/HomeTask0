import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {
    double n1 = 15;
    double n2 = 5;
    double delta = (n1 + n2)/2;

    @Test
    public void checkSum(){

//        double n1 = 15;
//        double n2 = 5;
        double testSum = Maths.add(n1, n2);


//        Assert.assertEquals(20,testSum, delta);
        Assert.assertTrue("Result addition of two values is ",testSum == 20);
    }

    @Test
    public void checkSubstract(){
        double testSbstr = Maths.substract(n1, n2);
        Assert.assertEquals("Substraction of two values is ", 10, testSbstr,delta);
//        Assert.assertTrue("Result substract of two values is ",testSbstr == 10);
    }


    @Test
    public void checkDivision(){
        double testDiv = Maths.divide(n1, n2);
        Assert.assertEquals("Division of two values",3, testDiv, delta);

    }

    @Test
    public void checkMultiply(){
        double testMltp = Maths.multiply(n1,n2);
        Assert.assertEquals("Multiplication of two values ",75d, testMltp, delta);

    }

    @Test
    public void square(){
        double testSquare = Maths.square(n1);
        Assert.assertEquals("Multiplication of a values is ",225d, testSquare, delta);
    }

    @Test
    public void incrementAndDecrement(){
        Calculator.incrementORDecrement("i++");
        Calculator.incrementORDecrement("++i");
        Calculator.incrementORDecrement("i--");
        Calculator.incrementORDecrement("--i");
    }

    @Test public void whatIsTheDifferenceBetweenIncrementTypes(){
        Calculator.diffIncrement("i++");
        Calculator.diffIncrement("++i");
        Calculator.diffIncrement("+i");
        Calculator.diffIncrement("i+++");
    }






}
