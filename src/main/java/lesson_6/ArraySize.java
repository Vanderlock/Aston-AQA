package lesson_6;

public class ArraySize {

    public static int checkedArraySize(String[][] twoStringArray) throws MyArraySizeException {
        int arraySize = 4;
        if (twoStringArray.length != 4) {
            throw new MyArraySizeException(String.format("This array should have %dx%d size, not %d",
                    arraySize, arraySize, twoStringArray.length));
        }
        int sum = 0;
        for (int i = 0; i < twoStringArray.length; i++) {
            if (twoStringArray[i].length != 4) {
                throw new MyArraySizeException(String.format("This array should have %dx%d size, not %d x %d",
                        arraySize, arraySize, twoStringArray[i].length, twoStringArray.length));
            }
            for (int j = 0; j < twoStringArray[0].length; j++) {
                try {
                    sum += Integer.parseInt(twoStringArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("In position [%d][%d] not int number ====> %s", i, j, twoStringArray[i][j]), i, j);
                }
            }
        }
        return sum;
    }

    //Реализованы тесты Lesson6Tests
    public static void main(String[] args) throws MyArraySizeException {
        String[][] twoArray01 = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        try {
            System.out.println("Сумма значений двумерного массива равна ====> " + checkedArraySize(twoArray01));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }

        String[][] twoArray02 = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "0", "1", "1"},
                {"1", "1", "1", "String"}
        };

        try {
            System.out.println("Сумма значений двумерного массива равна ====> " + checkedArraySize(twoArray02));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }

        String[][] twoArray03 = new String[][]{
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"}
        };
        System.out.println(checkedArraySize(twoArray03));

        String[][] twoArray04 = new String[][]{
                {"1", "1", "1"},
                {"1", "1", "1"},
                {"1", "1", "1"},
                {"1", "1", "1"}
        };
        System.out.println(checkedArraySize(twoArray04));
    }
}