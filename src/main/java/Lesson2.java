import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(checkInt(5, 7));
        System.out.println(checkInt(0, 0));
        System.out.println(checkInt(10, 10));
        System.out.println(checkInt(10, 11));
        positiveNegativeInt(-1);
        positiveNegativeInt(0);
        positiveNegativeInt(10);
        System.out.println("______________________");
        System.out.println(negativePositiveInt(5));
        System.out.println(negativePositiveInt(0));
        System.out.println(negativePositiveInt(-5));
        System.out.println("______________________");
        stringNumTimes("Vasia likes run tests", 5);
        System.out.println("______________________");
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(changeMassive(arr)));
        System.out.println("______________________");
        int[] arr2 = new int[100];
        System.out.println(Arrays.toString(fillTheMassive(arr2)));
        System.out.println("______________________");
        int[] arr3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(multiplyMassive(arr3)));
        System.out.println("______________________");
        int[][] arr4 = new int[8][8];
        //System.out.println(Arrays.toString(paint(arr4)));
        for (int i = 0; i < paint(arr4).length; i++) {
            for (int j = 0; j < paint(arr4).length; j++) {
                System.out.print(" " + paint(arr4)[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("______________________");
        System.out.println(checkYear(2000));
        System.out.println("______________________");
        System.out.println(Arrays.toString(createArray(5, 8)));
        System.out.println(Arrays.toString(createArray(5, "Vasia")));


    }

    public static boolean checkInt(int num1, int num2) {
        //Написать метод, принимающий на вход два целых числа и проверяющий,
        //что их сумма лежит в пределах от 10 до 20 (включительно),
        //если да – вернуть true, в противном случае – false.
        boolean result = false;
        if (num1 + num2 >= 10 && num1 + num2 <= 20) {
            result = true;
        }
        return result;
    }

    public static void positiveNegativeInt(int num) {
        //Написать метод, которому в качестве параметра передается целое число,
        //метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        //Замечание: ноль считаем положительным числом.
        if (num >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }

    public static boolean negativePositiveInt(int num) {
        //Написать метод, которому в качестве параметра передается целое число.
        //Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        //Замечание: ноль считаем положительным числом.
        return num < 0;
    }

    public static void stringNumTimes(String str, int num) {
        // Написать метод, которому в качестве аргументов передается строка и число,
        // метод должен отпечатать в консоль указанную строку, указанное количество раз;
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }

    public static int[] changeMassive(int[] arr) {
        // 5. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
        }
        return arr;
    }

    public static int[] fillTheMassive(int[] arr) {
        // Задать пустой целочисленный массив длиной 100.
        // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static int[] multiplyMassive(int[] arr) {
        // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }

    public static int[][] paint(int[][] arr) {
        //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        // (можно только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
        // то есть [0][0], [1][1], [2][2], …, [n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }

            }
        }

        return arr;
    }

    public static boolean checkYear(int year) {
        //Написать метод, который определяет, является ли год високосным, и возвращает boolean
        // (високосный - true, не високосный - false). Каждый 4-й год является високосным,
        // кроме каждого 100-го, при этом каждый 400-й – високосный
        boolean flag = false;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            flag = true;
        }
        return flag;
    }

    public static int[] createArray(int len, int initialValue) {
        //* Написать метод, принимающий на вход два аргумента:
        // len и initialValue, и возвращающий одномерный массив типа int длиной len,
        //каждая ячейка которого равна initialValue;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }

        return arr;
    }

    public static String[] createArray(int len, String initialValue) {
        //* Написать метод, принимающий на вход два аргумента:
        // len и initialValue, и возвращающий одномерный массив типа int длиной len,
        //каждая ячейка которого равна initialValue;
        String[] arr = new String[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }

        return arr;
    }


}
