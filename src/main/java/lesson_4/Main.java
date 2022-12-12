package lesson_4;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        ArrayList<Cat> cats = main.createCats();
        Plate plate = new Plate(15);
        plate.info();
        for (Cat cat : cats) {
            if (plate.infoCount() > cat.getAppetite()) {
                cat.eat(plate);
                cat.setSatiety(true);
            }
        }

        for (Cat cat : cats) {
            System.out.println("Сытость кота " + cat.getName() + " равна " + cat.getSatiety());
        }

        plate.info();
        Cat cat = new Cat("Barsik", 15);
        Cat catBras = new Cat("Bras");
        Cat catMurzik = new Cat("Murzik", 10, false);
        Dog dogBobik = new Dog("Бобик");
        Dog dogMarcus = new Dog("Marcus");
        Dog dog = new Dog();
        Animal animalSome = new Dog();

        dogBobik.run(150);
        catBras.run(200);
        catBras.run(300);


        plate.increaseFood(25);
        plate.info();

        System.out.println("Количество созданных собак " + Dog.getNumOfInstances());
        System.out.println("Количество созданных котов " + Cat.getNumOfInstances());
        System.out.println("Всего созданных животных " + Animal.getNumOfInstances());
    }

    public ArrayList<Cat> createCats() {
        Cat cat01 = new Cat("Барс", 5);
        Cat cat02 = new Cat("Лузя", 15);
        Cat cat03 = new Cat("Маруся", 20);
        Cat cat04 = new Cat("Васёк", 18);
        Cat cat05 = new Cat("Мила", 8);
        ArrayList<Cat> cats = new ArrayList<>();
        Collections.addAll(cats, cat01, cat02, cat03, cat04, cat05);
        return cats;
    }
}