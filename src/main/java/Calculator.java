public class Calculator {

    public int sumInt (int a, int b) {
        return a+b;
    }

    public float subtractFloat (float a, float b) {
        return a-b;
    }

    public double divideDouble (double a, double b) {
        if (b==0) {
            throw new IllegalArgumentException("Division by zero is not allowed!");
        }
        return a/b;
    }

    public long multiplyLong (long a, long b) {
        return a*b;
    }
}