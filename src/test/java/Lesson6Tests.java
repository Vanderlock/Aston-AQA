import lesson_6.MyArrayDataException;
import lesson_6.MyArraySizeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static lesson_6.ArraySize.checkedArraySize;

public class Lesson6Tests {


    @Test
    public void checkIntArrayElementsTest() throws MyArraySizeException {
        String[][] twoArray01 = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };


        Assertions.assertEquals(16, checkedArraySize(twoArray01));

    }

    @Test
    public void checkStringArrayElementsTest() {
        String[][] twoArray02 = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "0", "1", "1"},
                {"1", "1", "1", "String"}
        };
        Assertions.assertThrows(MyArrayDataException.class, () -> {
            checkedArraySize(twoArray02);
        });
    }

    @Test
    public void checkSizeArray5x4Test() {
        String[][] twoArray03 = new String[][]{
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"}
        };
        Assertions.assertThrows(MyArraySizeException.class, () -> {
            checkedArraySize(twoArray03);
        });
    }

    @Test
    public void checkSizeArray3x4Test() {
        String[][] twoArray04 = new String[][]{
                {"1", "1", "1"},
                {"1", "1", "1"},
                {"1", "1", "1"},
                {"1", "1", "1"}
        };
        Assertions.assertThrows(MyArraySizeException.class, () -> {
            checkedArraySize(twoArray04);
        });
    }
}
