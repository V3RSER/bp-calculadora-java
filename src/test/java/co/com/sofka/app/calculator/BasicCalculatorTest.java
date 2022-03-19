package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 10 + 1 = 1")
    public void sum() {
        // Arrange
        Long number1 = 10L;
        Long number2 = 1L;
        Long expectedValue = 11L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + ({1}) = {2}")
    @CsvSource({
            "1,     1,      2",
            "-1,    -1,     -2",
            "1,     -1,     0",
            "-1,    1,      0"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing subtract: 10 - 1 = 9")
    public void subtract() {
        // Arrange
        Long number1 = 10L;
        Long number2 = 1L;
        Long expectedValue = 9L;

        // Act
        Long result = basicCalculator.subtract(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several subtractions")
    @ParameterizedTest(name = "{0} - ({1}) = {2}")
    @CsvSource({
            "1,     1,      0",
            "-1,    -1,     0",
            "1,     -1,     2",
            "-1,    1,      -2"
    })
    public void severalSubtractions(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.subtract(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing multiply: 10 * -1 = -10")
    public void multiply() {
        // Arrange
        Long number1 = 10L;
        Long number2 = -1L;
        Long expectedValue = -10L;

        // Act
        Long result = basicCalculator.multiply(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several multiplications")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "10,    0,      0",
            "0,     10,     0",
            "10,    10,     100",
            "-10,   -10,    100",
            "10,    -10,    -100",
            "-10,   10,     -100"
    })
    public void severalMultiplications(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multiply(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing divide: 10 / 0 = null")
    public void divide() {
        // Arrange
        Long number1 = 10L;
        Long number2 = 0L;
        Long expectedValue = null;

        // Act
        Long result = basicCalculator.divide(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several divisions")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "0,     10,     0",
            "10,    10,     1",
            "-10,   -10,    1",
            "10,    -10,    -1",
            "-10,   10,     -1"
    })
    public void severalDivisions(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.divide(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }
}