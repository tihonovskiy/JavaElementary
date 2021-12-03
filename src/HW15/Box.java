package HW15;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    List<T> fruitsBox = new ArrayList<>();

    public void addFruit(T fruit) {
        this.fruitsBox.add(fruit);
    }

    public List<T> getFruitsBox() {
        return fruitsBox;
    }

    public void addFruits(List<T> fruits) {
        this.fruitsBox.addAll(fruits);
    }

    public float getWeight() {
        return fruitsBox.size() * fruitsBox.get(0).getWeight();
    }

    public <V extends Fruit> boolean compare(Box<V> compareBox) {
        if (this.getWeight() == compareBox.getWeight()) {
            return true;
        }
        return false;
    }

    public void merge(Box<T> newBox) {
        fruitsBox.addAll(newBox.getFruitsBox());
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruitsBox=" + fruitsBox +
                '}';
    }
}
