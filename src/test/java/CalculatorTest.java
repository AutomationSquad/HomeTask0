import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {

  private int firstInt = 25;
  private int secondInt = 5;
  private int thirdInt = 0;
  private byte firstByte = 10;
  private byte secondByte = 10;
  private float firstFloat = 8.7f;
  private float secondFloat = 5.5f;
  private String value1 = "17";
  private String value2 = "15";
  private Integer value3 = 10;
  private Integer value4 = 10;


    @Test
    public void operationsInt(){
       System.out.println("Running the first test. Operations with int:");
       System.out.println("Result of adding " +firstInt +" + " +secondInt + " = " +Calculator.add(firstInt ,secondInt));
       Assert.assertEquals("Wrong Result", 30, Calculator.add(firstInt ,secondInt));
       Assert.assertTrue("Wrong Result", Calculator.add(firstInt, secondInt)>firstInt);

       System.out.println("Result of subtraction " +firstInt +" - " +secondInt + " = " +Calculator.subtract(firstInt ,secondInt));
       Assert.assertEquals("Wrong Result", 20, Calculator.subtract(firstInt ,secondInt));
       Assert.assertTrue("Wrong Result", Calculator.subtract(firstInt, secondInt)!=secondInt);

       System.out.println("Result of division " +firstInt +" / " +secondInt + " = " +Calculator.divide(firstInt ,secondInt));
       Assert.assertEquals("Wrong Result", 5, Calculator.divide(firstInt ,secondInt));
       Assert.assertTrue("Wrong Result", Calculator.divide(firstInt, secondInt)<firstInt);

       System.out.println("Result of multiplication " +firstInt +" * " +secondInt + " = " +Calculator.multiply(firstInt ,secondInt));
       Assert.assertEquals("Wrong Result", 125, Calculator.multiply(firstInt ,secondInt));
       Assert.assertTrue("Wrong Result", Calculator.multiply(firstInt, secondInt)!=firstInt);

       /*Negative tests */
       /*Assert.assertEquals("Wrong Result", 25, Calculator.add(firstInt ,secondInt));*/
       /*Assert.assertTrue("Wrong Result", Calculator.add(firstInt, secondInt)<firstInt);*/
       /* Assert.assertEquals("Wrong Result", 0, Calculator.divide(firstInt ,thirdInt));*/

       }



    @Test
    public void operationsByte(){
        System.out.println("Running the second test. Operations with byte:");

        byte addByte = (byte) Calculator.add(firstByte ,secondByte);
        System.out.println("Result of adding " +firstByte +" + " +secondByte + " = " +addByte);
        Assert.assertEquals("Wrong Result", 20, +addByte);

        byte subtractByte = (byte) Calculator.subtract(firstByte ,secondByte);
        System.out.println("Result of subtraction " +firstByte +" - " +secondByte + " = " +subtractByte);
        Assert.assertEquals("Wrong Result", 0, subtractByte);

        byte divideByte = (byte) Calculator.divide(firstByte ,secondByte);
        System.out.println("Result of division " +firstByte +" / " +secondByte + " = " +divideByte);
        Assert.assertEquals("Wrong Result", 1, divideByte);

        byte multiplyByte = (byte) Calculator.multiply(firstByte ,secondByte);
        System.out.println("Result of multiplication " +firstByte +" * " +secondByte + " = " +multiplyByte);
        Assert.assertEquals("Wrong Result", 100, multiplyByte);

    }

    @Test
    public void operationsFloat(){
        System.out.println("Running the third test. Operations with float:");

        float addFloat = Calculator.addFloat(firstFloat ,secondFloat);
        System.out.println("Result of adding " +firstFloat +" + " +secondFloat + " = " +addFloat);
        Assert.assertEquals("Wrong Result", 14.2f, addFloat, 0.0f);

        float subtractFloat = Calculator.subtractFloat(firstFloat ,secondFloat);
        System.out.println("Result of subtraction " +firstFloat +" - " +secondFloat + " = " +subtractFloat);
        Assert.assertEquals("Wrong Result", 3.2f, subtractFloat, 0.1f);

        float divideFloat = Calculator.divideFloat(firstFloat ,secondFloat);
        System.out.println("Result of division " +firstFloat +" / " +secondFloat + " = " +divideFloat);
        Assert.assertEquals("Wrong Result", 1.5f, divideFloat, 0.1f);

        float multiplyFloat = Calculator.multiplyFloat(firstFloat ,secondFloat);
        System.out.println("Result of multiplication " +firstFloat +" * " +secondFloat + " = " +multiplyFloat);
        Assert.assertEquals("Wrong Result", 47.85, multiplyFloat, 0.1f);

        int addFloatToInt = (int) Calculator.addFloat(firstFloat ,secondFloat);
        System.out.println("Result of adding(Float to Int)" +firstFloat +" + " +secondFloat + " = " +addFloatToInt);
        Assert.assertEquals("Wrong Result", 14, addFloatToInt);

        }

    @Test
    public void Wrapper(){

        int a = Integer.parseInt(value1);
        int b = Integer.parseInt(value2);

        Assert.assertEquals("Wrong Result", 32, Calculator.add(a,b));
        Assert.assertTrue("Wrong Result", Calculator.add(a,b)>a);

        int c = value3;
        int d = value4;
        Assert.assertEquals("Wrong Result", 20, Calculator.add(c,d));
        Assert.assertEquals("Wrong Result", 0, Calculator.subtract(c,d));
        Assert.assertEquals("Wrong Result", 1, Calculator.divide(c,d));
        Assert.assertEquals("Wrong Result", 100, Calculator.multiply(c,d));
    }




}
