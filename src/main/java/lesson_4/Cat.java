package lesson_4;

public class Cat extends Animal {
    private String name;
    private int appetite;
    private boolean satiety;
    private static int catCount;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        catCount++;
    }

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
        catCount++;
    }

    public Cat() {
        catCount++;
    }

    public static int getNumOfInstances() {
        return catCount;
    }


    public Cat(String name) {
        this.name = name;
        catCount++;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    @Override
    public void run(int meter) {
        if (meter > 0 && meter <= 200) {
            System.out.println("Кот " + name + " пробежал " + meter + " м.");
        } else {
            System.out.println("Кот " + name + " ограничение на бег");
        }

    }

    @Override
    public void swim(int meter) {
        System.out.println("Кот " + name + " не умеет плавать");
    }

    @Override
    public void voice() {
        System.out.println("Myau");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}