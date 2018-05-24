public class Calculator {
    static int additionReworked(byte number1, short number2) {
        return number1+number2;
    }
    static int subtractionReworked(byte number1, short number2) {
        return number1-number2;
    }
    static int multiplicationReworked(byte number1, short number2) {
        return number1*number2;
    }
    static int divisionReworked(byte number1, short number2) {
        int result = 0;
        try {
            return result = number1/number2;
        }
        catch (ArithmeticException exception)
        {
            System.out.println("An invalid arithmetic operation occurred");
        }
        finally
        {
            return result;
        }
    }
}
