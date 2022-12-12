package lesson_4;

public abstract class Animal {
    String name;
    private static int animalCount;

    public Animal() {
        animalCount++;
    }

    public static int getNumOfInstances() {
        return animalCount;
    }

    public abstract void run(int meter);

    public abstract void swim(int meter);

    public abstract void voice();
}