package HW15;

import java.util.List;

public class Box<T extends Fruit> {
     List<T> fruitsBox;

    public void addFruit(T fruit) {
        this.fruitsBox.add(fruit);
    }

    public void addFruits(List<T> fruits) {
        this.fruitsBox.addAll(fruits);
    }
}
