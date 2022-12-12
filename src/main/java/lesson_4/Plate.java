package lesson_4;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int foodCount) {
        food -= foodCount;
        if (food < 0) {
            food += foodCount;
            System.out.println("Оставшееся количество еды равно " + food);
        }
    }

    public void increaseFood(int foodCount) {
        food += foodCount;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int infoCount() {
        return food;
    }
}