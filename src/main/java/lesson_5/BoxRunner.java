package lesson_5;

public class BoxRunner {
    public static void main(String[] args) {
        // Создаём две пустые коробки под яблоки
        Box<Apple> appleBox01 = new Box<>();
        Box<Apple> appleBox02 = new Box<>();

        // Создаём две пустые коробки под апельсины
        Box<Orange> orangeBox01 = new Box<>();
        Box<Orange> orangeBox02 = new Box<>();

        //Заполняем коробки фруктами
        appleBox01.addFruit(new Apple(), 20);
        appleBox02.addFruit(new Apple(), 30);

        orangeBox01.addFruit(new Orange(), 15);
        orangeBox02.addFruit(new Orange(), 20);
        System.out.println();

        System.out.println("Вывод веса коробок с фруктами:");
        System.out.println("Вес первой коробки из под яблок ====> " + appleBox01.getWeight());
        System.out.println("Вес второй коробки из под яблок ====> " + appleBox02.getWeight());
        System.out.println("Вес первой коробки из под апельсинов ====> " + orangeBox01.getWeight());
        System.out.println("Вес второй коробки из под апельсинов ====> " + orangeBox02.getWeight());
        System.out.println();

        System.out.println("Сравнение веса коробок:");
        System.out.println("Вес первой коробки с яблоками с первой коробкой апельсинов ====> " + appleBox01.compare(orangeBox01));
        System.out.println("Вес второй коробки с яблоками со второй коробкой апельсинов ====> " + appleBox02.compare(orangeBox02));

        //Пересыпание фруктов из одной коробки в другую
        appleBox01.poorTo(appleBox02);
        orangeBox02.poorTo(orangeBox01);
        System.out.println();

        System.out.println("Вывод веса коробок с фруктами после пересыпания:");
        System.out.println("Вес первой коробки из под яблок ====> " + appleBox01.getWeight());
        System.out.println("Вес второй коробки из под яблок ====> " + appleBox02.getWeight());
        System.out.println("Вес первой коробки из под апельсинов ====> " + orangeBox01.getWeight());
        System.out.println("Вес второй коробки из под апельсинов ====> " + orangeBox02.getWeight());
    }
}