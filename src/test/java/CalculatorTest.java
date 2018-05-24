import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;

import org.junit.jupiter.params.provider.MethodSource;
import org.junit.rules.ExpectedException;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {
    private static Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @DisplayName("Testing Calculator for Adding function")
    @ParameterizedTest
    @MethodSource("addDataProvider")
    void testCalculatorAddFunction(double first, double second, double result) {
        assertEquals(result, calculator.add(first, second));
    }

    private static Stream<Arguments> addDataProvider() {
        return Stream.of(
                Arguments.of(25d, 0d, 25d),
                Arguments.of(19d, 1d, 20d));
    }

    @DisplayName("Testing Calculator for Subtracting function")
    @ParameterizedTest
    @MethodSource("subtractDataProvider")
    void testCalculatorSubtractFunction(float first, float second, float result) {
        assertEquals(result, calculator.subtract(first, second));
    }

    private static Stream<Arguments> subtractDataProvider() {
        return Stream.of(
                Arguments.of(300f, 1f, 299f),
                Arguments.of(1999f, 0f, 1999f));
    }

    @DisplayName("Testing Calculator for Multiplication function")
    @ParameterizedTest
    @MethodSource("multiplyDataProvider")
    void testCalculatorMultiply(int first, int second, int result) {
        assertEquals(result, calculator.multiply(first, second));
    }

    private static Stream<Arguments> multiplyDataProvider() {
        return Stream.of(
                Arguments.of(2, 0, 0),
                Arguments.of(8, 1, 8));
    }


    @DisplayName("Testing Calculator for Dividing function")
    @ParameterizedTest
    @MethodSource("divideDataProvider")
    void testCalculatorDivide(int first, int second, int result) {
        assertEquals(result, calculator.divide(first, second));
    }

    private static Stream<Arguments> divideDataProvider() {
        return Stream.of(
                Arguments.of(1055, 5, 211),
                Arguments.of(199, 1, 199));
    }

    @Rule
    final ExpectedException exception = ExpectedException.none();

    @DisplayName("Testing Calculator for Dividing by Zero function")
    @ParameterizedTest
    @MethodSource("divideByZeroDataProvider")
    void testCalculatorDivideByZero(int first, int second, int result) {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.divide(first, second));
        assertEquals("/ by zero", exception.getMessage());
    }

    private static Stream<Arguments> divideByZeroDataProvider() {
        return Stream.of(
                Arguments.of(99, 0, 0),
                Arguments.of(0, 0, 0));
    }
}
