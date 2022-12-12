package lesson_4;

public class Dog extends Animal {
    String name;
    private static int dogCount;

    public Dog() {
        dogCount++;
    }

    public static int getNumOfInstances() {
        return dogCount;
    }


    public Dog(String name) {
        this.name = name;
        dogCount++;
    }

    @Override
    public void voice() {
        System.out.println("Gav");
    }

    @Override
    public void run(int meter) {
        if (meter > 0 && meter <= 500) {
            System.out.println("Собака " + name + " пробежал " + meter + " м.");
        } else {
            System.out.println("Собака" + name + " ограничение на бег");
        }

    }

    @Override
    public void swim(int meter) {

        if (meter > 0 && meter <= 10) {
            System.out.println("Собака " + name + " проплыл " + meter + " м.");
        } else {
            System.out.println("Собака " + name + " ограничение на плавание");
        }
    }
}