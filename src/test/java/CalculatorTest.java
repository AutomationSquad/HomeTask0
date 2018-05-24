import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private byte firstValue = 13;
    private short secondValue = 3;
    private byte thirdValue = -3;
    private short forthValue = 0;

    @Test
    public void canAddCorrectPositive(){
        System.out.println("Running first test. Verifying positive Addition.");
        int resultOfAddition = Calculator.additionReworked(firstValue ,secondValue);
        System.out.println("Result of adding " +firstValue +" + " +secondValue + " = " +resultOfAddition);

        assertEquals("Your calculator is dumb", 16, resultOfAddition);
    }


    @Test
    public void canSubtractCorrectPositive(){
        System.out.println("Second test is running. Verifying positive Subtraction.");
        int resultOfSubtraction = Calculator.subtractionReworked(firstValue ,secondValue);
        System.out.println("Result of adding " +firstValue +" - " +secondValue + " = " +resultOfSubtraction);

        assertEquals("Your calculator is dumb", 10, resultOfSubtraction);
    }

    @Test
    public void canMultipleCorrectPositive(){
        System.out.println("Second test is running. Verifying positive Multiplication.");
        int resultOfMultiplication = Calculator.multiplicationReworked(firstValue ,secondValue);
        System.out.println("Result of adding " +firstValue +" * " +secondValue + " = " +resultOfMultiplication);

        assertEquals("Your calculator is dumb", 39, resultOfMultiplication);
    }

    @Test
    public void canDivideCorrectPositive(){
        System.out.println("Second test is running. Verifying positive Division.");
        int resultOfDivision = Calculator.divisionReworked(firstValue ,secondValue);
        System.out.println("Result of adding " +firstValue +" / " +secondValue + " = " +resultOfDivision);

        assertEquals("Your calculator is dumb", 4, resultOfDivision);
    }


    @Test
    public void canAddCorrectNegative(){
        System.out.println("Running first test. Verifying negative Addition.");
        int resultOfAddition = Calculator.additionReworked(firstValue ,thirdValue);
        System.out.println("Result of adding " +firstValue +" + " +thirdValue + " = " +resultOfAddition);

        assertEquals("Your calculator is dumb", 10, resultOfAddition);
    }

    @Test
    public void canSubtractCorrectNegative(){
        System.out.println("Second test is running. Verifying negative Subtraction.");
        int resultOfSubtraction = Calculator.subtractionReworked(firstValue ,thirdValue);
        System.out.println("Result of adding " +firstValue +" - " +thirdValue + " = " +resultOfSubtraction);

        assertEquals("Your calculator is dumb", 16, resultOfSubtraction);
    }

    @Test
    public void canMultipleCorrectNegative(){
        System.out.println("Second test is running. Verifying negative Multiplication.");
        int resultOfMultiplication = Calculator.multiplicationReworked(firstValue ,thirdValue);
        System.out.println("Result of adding " +firstValue +" * " +secondValue + " = " +resultOfMultiplication);

        assertEquals("Your calculator is dumb", -39, resultOfMultiplication);
    }

    @Test
    public void canDivideCorrectNegative() {
        System.out.println("Second test is running. Verifying negative Division.");
        int resultOfDivision = Calculator.divisionReworked(firstValue, forthValue);
        System.out.println("Result of adding " + firstValue + " / " + forthValue + " = " + resultOfDivision);

        assertEquals("Your calculator is dumb", 0, resultOfDivision);
    }
}
