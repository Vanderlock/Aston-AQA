package lesson_5;
import java.util.ArrayList;
import java.util.Arrays;

public class SwapMethods {
    // Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
    public static void swapTwoArrayElements(Object[] arrayList, int firstNum, int secondNum) {
        Object temp = arrayList[firstNum];
        arrayList[firstNum] = arrayList[secondNum];
        arrayList[secondNum] = temp;
        System.out.println(Arrays.toString(arrayList));
    }

    public static <T> ArrayList<T> convertToList(T[] arrayList) {
        return new ArrayList<>(Arrays.asList(arrayList));
    }

    //Test
    public static void main(String[] args) {
        Integer[] arrayInteger = {1, 2, 3, 4, 5};
        System.out.println(convertToList(arrayInteger));
        swapTwoArrayElements(arrayInteger, 2, 4);

        String[] arrayString = {"A", "B", "C", "D", "E", "F"};
        System.out.println(convertToList(arrayString));
        swapTwoArrayElements(arrayString, 0, 3);
    }
}