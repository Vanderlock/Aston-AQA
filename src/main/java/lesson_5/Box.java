package lesson_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Box<T extends Fruit> {
    private ArrayList<T> box;

    public Box() {
        this.box = new ArrayList<>();
    }

    public Box(T... fruits) {
        this.box = new ArrayList<>(Arrays.asList(fruits));
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T o : box) {
            weight += o.getWeight();
        }
        return weight;
    }

    public void poorTo(Box<T> anotherBox) {
        anotherBox.box.addAll(box);
        box.clear();
    }

    public void addFruit(T fruit) {
        box.add(fruit);
    }

    public void addFruit(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            box.add(fruit);
        }
    }

    public void addFruit(Collection<T> fruit) {
        box.addAll(fruit);
    }

    public boolean compare(Box<?> o) {
        return Math.abs(this.getWeight() - o.getWeight()) < 0.0001;
    }
}