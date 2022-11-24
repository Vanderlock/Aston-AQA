import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Lesson2Tests {
    @Test
    public void checkIntTrueTest() {
        Assertions.assertTrue(Lesson2.checkInt(5, 7));
    }

    @Test
    public void checkIntFalseTest() {
        Assertions.assertFalse(Lesson2.checkInt(0, 0));
    }

    @Test
    public void checkIntTrue20Test() {
        Assertions.assertTrue(Lesson2.checkInt(10, 10));
    }

    @Test
    public void checkIntFalse21Test() {
        Assertions.assertFalse(Lesson2.checkInt(10, 11));
    }

    @ParameterizedTest
    @CsvSource({
            "5, 7, 12",
            "-1, 11, 10",
            "10, 10, 20",
            "15, -2, 13"
    })
    public void positiveValueParamTest(int num1, int num2) {
        Assertions.assertTrue(Lesson2.checkInt(num1, num2));
    }

    @ParameterizedTest(name = "Iteration #{index} -> Number 1 = {0}, Number 2 = {1} and num1 + num2 value is {2}")
    @CsvSource({
            "-5, -7, -12",
            "0, 0, 0",
            "-5, 1, 4",
            "2, -6, -4"
    })
    public void negativeValueParamTest(int num1, int num2, int num3) {
        Assertions.assertFalse(Lesson2.checkInt(num1, num2));
    }


}
