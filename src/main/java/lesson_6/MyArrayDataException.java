package lesson_6;

public class MyArrayDataException extends RuntimeException {
    private int i;
    private int j;

    public MyArrayDataException(String message, int i, int j) {
        super("Элемент в позиции [" + i + "][" + j + "] массива не целое число ====> " + message);
    }
}