package hw1;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        this.fruits.add(fruit);
    }

    public double getWeight() {
        try {
            T first = this.fruits.get(0);
            return this.fruits.size() * first.getWeight();
        } catch (IndexOutOfBoundsException e) {
            return 0;
        }
    }

    public boolean compare(Box <?> anotherBox) {
        return Math.abs(getWeight() - anotherBox.getWeight()) < 0.000001;
    }

    public void move(Box <? super T> anotherBox) {
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits +
                '}';
    }
}
