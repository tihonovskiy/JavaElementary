package HW15;

import java.util.ArrayList;
import java.util.List;

public class MainBoxFruit {

    public static void main(String[] args) {
        Box<Apple> boxApple = new Box<>();
        Box<Orange> boxOrange = new Box<>();

        Apple apple1 = new Apple("apple1");
        Apple apple2 = new Apple("apple2");
        Apple apple3 = new Apple("apple3");

        Orange orange1 = new Orange("orange1");
        Orange orange2 = new Orange("orange2");
        Orange orange3 = new Orange("orange3");

        List<Apple> apples = new ArrayList<>();
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);

        List<Orange> oranges = new ArrayList<>();
        oranges.add(orange1);
        oranges.add(orange2);
        oranges.add(orange3);

        boxApple.addFruit(apple1);
        boxApple.addFruits(apples);

        boxOrange.addFruit(orange1);
        boxOrange.addFruits(oranges);

        System.out.println(boxApple);
        System.out.println(boxOrange);
    }

}
