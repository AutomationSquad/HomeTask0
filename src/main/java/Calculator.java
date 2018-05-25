public class Calculator {

    public int addInteger(int firstVariable, int secondVariable) {
        return firstVariable + secondVariable;
    }

    public double addDouble(double firstVariable, double secondVariable) {
        return firstVariable + secondVariable;
    }

    public Double divide(int firstVariable, int secondVariable) {
        if (!isZero(secondVariable)) {
            return (double) (firstVariable / secondVariable);
        } else
            return null;
    }

    public Integer factorialCount(int firstVariable) {
        if (isZero(firstVariable)) {
            return 1;
        } else if (isLessThanThirteen(firstVariable)) {
            return factorial(firstVariable);
        } else
            return null;
    }

    public Integer recursiveFactorial(int firstVariable) {
        int result;

        if (firstVariable == 1) {
            return 1;
        } else {
            result = recursiveFactorial(firstVariable - 1) * firstVariable;
        }
        return result;
    }

    private boolean isZero(int variable) {
        if (variable == 0)
            return true;
        else
            return false;
    }

    private boolean isLessThanThirteen(int variable) {
        if (variable >= 0 && variable < 13) {
            return true;
        } else
            return false;
    }

    private int factorial(int variable) {
        int result = 1;
        for (int i = 1; i <= variable; i++) {
            result = result * i;
        }
        return result;
    }
}