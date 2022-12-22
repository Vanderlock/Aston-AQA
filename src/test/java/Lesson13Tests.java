
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import lesson_13.AreaTriangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;




public class Lesson13Tests {

    @Test

    @Owner("Valentin Gromyko")
    @Description("Положительная проверка метода areaOfTheTriangle с равными сторонами")
    public void areaTriangleEqualsSidesPositiveTest(){
        AreaTriangle areaTriangle = new AreaTriangle();
        double actualResult = areaTriangle.areaOfTheTriangle(3.0, 3.0, 3.0);
        Assertions.assertEquals(3.90, actualResult);
    }

    @Test
    @Owner("Valentin Gromyko")
    @Description("Положительная проверка метода areaOfTheTriangle с разными сторонами")
    public void areaTriangleDifferentSidesPositiveTest(){
        AreaTriangle areaTriangle = new AreaTriangle();
        double actualResult = areaTriangle.areaOfTheTriangle(3.0, 4.0, 5.0);
        Assertions.assertEquals(6.0, actualResult);
    }

    @Test
    @Owner("Valentin Gromyko")
    @Description("Положительная проверка метода areaOfTheTriangle с разными сторонами до сотых")
    public void areaTriangleDifferentDoubleSidesPositiveTest(){
        AreaTriangle areaTriangle = new AreaTriangle();
        double actualResult = areaTriangle.areaOfTheTriangle(3.75, 4.98, 5.87);
        Assertions.assertEquals(9.27, actualResult);
    }

    @ParameterizedTest(name = "Iteration #{index} - {3} -> Side1 = {0} -> Side2 = {1} -> Side3 = {2}")
    @Owner("Valentin Gromyko")
    @Description("Проверка валидации метода areaOfTheTriangle на стороны равные нулю и меньше нуля")
    @CsvSource({
            "0.0, 3.0, 3.0, FirstSideZeroError",
            "3.0, 0.0, 3.0, SecondSideZeroError",
            "3.0, 3.0, 0.0, ThirdSideZeroError",
            "-3.0, 3.0, 3.0, FirstSideMinusZeroError",
            "3.0, -3.0, 3.0, SecondSideMinusZeroError",
            "3.0, 3.0, -3.0, ThirdSideMinusZeroError"
    })
    public void areaTriangleDifferentDoubleSidesNegativeTest(double side1, double side2, double side3, String name){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            AreaTriangle areaTriangle = new AreaTriangle();
            double actualResult = areaTriangle.areaOfTheTriangle(side1, side2, side3);
        });
    }

    @ParameterizedTest(name = "Iteration #{index} - {3} -> Side1 = {0} -> Side2 = {1} -> Side3 = {2}")
    @Owner("Valentin Gromyko")
    @Description("Проверка валидации метода areaOfTheTriangle на размер сторон треугольника")
    @CsvSource({
            "6.45, 5.45, 0.11, Side1 + Side2 >= Side3",
            "3.0, 1.0, 5.0, Side1 + Side3 >= Side2",
            "3.0, 3.0, 10.0, Side2 + Side3 >= Side1"
    })
    public void areaTriangleDifferentSizeSidesNegativeTest(double side1, double side2, double side3, String name){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            AreaTriangle areaTriangle = new AreaTriangle();
            double actualResult = areaTriangle.areaOfTheTriangle(side1, side2, side3);
        });
    }
}