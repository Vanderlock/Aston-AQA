package lesson_6;

public class MyArraySizeException extends Exception{
    public MyArraySizeException(String message) {
        super("Размер не соответствует размеру массива ====> " + message);
    }

}