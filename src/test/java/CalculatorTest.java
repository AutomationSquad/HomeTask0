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
        public void addInt() {

            System.out.println("Result of adding int " + firstInt + " + " + secondInt + " = " + Calculator.add(firstInt, secondInt));
            Assert.assertEquals("Incorrect result of the summation operation", 30, Calculator.add(firstInt, secondInt));

        }

        @Test
        public void addIntTrue(){

             Assert.assertTrue("The sum is less than the first number", Calculator.add(firstInt, secondInt) > firstInt);

        }


        @Test
        public void subtractInt(){

            System.out.println("Result of subtraction Int " +firstInt +" - " +secondInt + " = " +Calculator.subtract(firstInt ,secondInt));
            Assert.assertEquals("Incorrect result of the subtraction operation", 20, Calculator.subtract(firstInt ,secondInt));

        }

        @Test
        public void subtractIntTrue(){

            Assert.assertTrue("The difference is equal to the second number", Calculator.subtract(firstInt, secondInt)!=secondInt);

        }

        @Test
        public void divideInt(){

            System.out.println("Result of division Int " +firstInt +" / " +secondInt + " = " +Calculator.divide(firstInt ,secondInt));
            Assert.assertEquals("Incorrect result of the dividing operation", 5, Calculator.divide(firstInt ,secondInt));

        }

        @Test
        public void divideIntTrue(){
            Assert.assertTrue("The remainder is less than the first number", Calculator.divide(firstInt, secondInt)<=firstInt);
        }

        @Test
        public void multiplyInt(){

            System.out.println("Result of multiplication Int " +firstInt +" * " +secondInt + " = " +Calculator.multiply(firstInt ,secondInt));
            Assert.assertEquals("Incorrect result of the multiplication operation", 125, Calculator.multiply(firstInt ,secondInt));
        }

        @Test
        public void multiplyIntTrue(){

            Assert.assertTrue("Result of multiplication equals first number", Calculator.multiply(firstInt, secondInt)!=firstInt);

        }

        /*@Test
        public void negativeTest1(){

            Assert.assertEquals("Incorrect result of the summation operation", 25, Calculator.add(firstInt ,secondInt));

        }

        @Test
        public void negativeTest2(){

            Assert.assertTrue("The sum is less than the first number", Calculator.add(firstInt, secondInt)<firstInt);
        }

        @Test
        public void negativeTest3(){

            Assert.assertEquals("Division by zero", 0, Calculator.divide(firstInt ,thirdInt));
        }*/



        @Test
        public void addByte(){

            byte addByte = (byte) Calculator.add(firstByte ,secondByte);
            System.out.println("Result of adding Byte " +firstByte +" + " +secondByte + " = " +addByte);
            Assert.assertEquals("Incorrect result of the summation operation", 20, +addByte);
        }

        @Test
        public void subtractByte(){

            byte subtractByte = (byte) Calculator.subtract(firstByte ,secondByte);
            System.out.println("Result of subtraction Byte " +firstByte +" - " +secondByte + " = " +subtractByte);
            Assert.assertEquals("Incorrect result of the subtraction operation", 0, subtractByte);
        }

        @Test
        public void divideByte(){

            byte divideByte = (byte) Calculator.divide(firstByte ,secondByte);
            System.out.println("Result of division Byte " +firstByte +" / " +secondByte + " = " +divideByte);
            Assert.assertEquals("Incorrect result of the dividing operation", 1, divideByte);
        }

        @Test
        public void multiplyByte(){

            byte multiplyByte = (byte) Calculator.multiply(firstByte ,secondByte);
            System.out.println("Result of multiplication Byte " +firstByte +" * " +secondByte + " = " +multiplyByte);
            Assert.assertEquals("Incorrect result of the multiplication operation", 100, multiplyByte);

        }



        @Test
        public void addFloat(){

            float addFloat = Calculator.addFloat(firstFloat ,secondFloat);
            System.out.println("Result of adding Float " +firstFloat +" + " +secondFloat + " = " +addFloat);
            Assert.assertEquals("Incorrect result of the summation operation", 14.2f, addFloat, 0.0f);

        }


        @Test
        public void subtractFloat(){

            float subtractFloat = Calculator.subtractFloat(firstFloat ,secondFloat);
            System.out.println("Result of subtraction Float " +firstFloat +" - " +secondFloat + " = " +subtractFloat);
            Assert.assertEquals("Incorrect result of the subtraction operation", 3.2f, subtractFloat, 0.1f);
        }

        @Test
        public void divideFloat(){

            float divideFloat = Calculator.divideFloat(firstFloat ,secondFloat);
            System.out.println("Result of division Float " +firstFloat +" / " +secondFloat + " = " +divideFloat);
            Assert.assertEquals("Incorrect result of the dividing operation", 1.5f, divideFloat, 0.1f);
        }

       @Test
       public void multiplyFloat(){

            float multiplyFloat = Calculator.multiplyFloat(firstFloat ,secondFloat);
            System.out.println("Result of multiplication Float " +firstFloat +" * " +secondFloat + " = " +multiplyFloat);
            Assert.assertEquals("Incorrect result of the multiplication operation", 47.85, multiplyFloat, 0.1f);
       }

       @Test
       public void addFloatToInt(){

            int addFloatToInt = (int) Calculator.addFloat(firstFloat ,secondFloat);
            System.out.println("Result of adding(Float to Int)" +firstFloat +" + " +secondFloat + " = " +addFloatToInt);
            Assert.assertEquals("Incorrect result of the summation operation", 14, addFloatToInt);
       }


       int a = Integer.parseInt(value1);
       int b = Integer.parseInt(value2);

       @Test
       public void stringToInt() {

           Assert.assertEquals("Incorrect result of the summation operation", 32, Calculator.add(a, b));

       }

       @Test
       public void stringToIntTrue() {
           Assert.assertTrue("The sum is less than the first number", Calculator.add(a, b) > a);

       }

        int c = value3;
        int d = value4;

       @Test
       public void addIntegerToInt() {

           Assert.assertEquals("Incorrect result of the summation operation", 20, Calculator.add(c,d));
       }

       @Test
       public void subtractIntegerToInt() {

           Assert.assertEquals("Incorrect result of the subtraction operation", 0, Calculator.subtract(c,d));
       }


       @Test
       public void divideIntegerToInt() {

           Assert.assertEquals("Incorrect result of the dividing operation", 1, Calculator.divide(c,d));
       }

       @Test
       public void multiplyIntegerToInt() {

           Assert.assertEquals("Incorrect result of the multiplication operation", 100, Calculator.multiply(c,d));

       }

}
