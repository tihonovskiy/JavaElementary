package HW15;

import java.util.Arrays;
import java.util.List;

/*
    1. Создать метод toList. Метод принимает на вход массив и преобразовывает его в список.
    Коллекция хранит точно такой же тип данных, как и входной массив.
    После преобразования необходимо вернуть только что созданный список.
 */

public class Main {

    public static void main(String[] args) {
        String[] stringArray = {"one", "two", "six", "seven", "ten"};
        Double[] doubleArray = {5D, 3D, 2D};

        List<String> stringList = toList(stringArray);
        List<Double> doubleList = toList(doubleArray);

        System.out.println(stringList);
        System.out.println(doubleList);
    }

    public static <T> List<T> toList(T[] array) {
        return Arrays.asList(array);
    }
}