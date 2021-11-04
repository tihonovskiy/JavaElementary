package HW11.TaskA;

import java.util.ArrayList;
import java.util.List;

/*
    1. Создать метод countOccurance, принимающий на вход строковый список в качестве параметра и произвольную строку.
    Список заполнен произвольными словами 10-20 штук, которые могут повторяться в неограниченном количестве.
    Посчитать сколько раз встречается переданная строка в качестве второго аргумента.
 */

public class CountOccurance {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("qwe");
        stringList.add("qwe");
        stringList.add("asd");
        stringList.add("zxc");
        stringList.add("qwe");
        stringList.add("asd");
        stringList.add("qwe");
        stringList.add("qwe");
        stringList.add("asd");
        stringList.add("zxc");

        System.out.println(countOccurance(stringList, "qwe"));
        System.out.println(countOccurance(stringList, "asd"));
        System.out.println(countOccurance(stringList, "zxc"));
        System.out.println(countOccurance(stringList, "tyu"));
    }

    public static int countOccurance(List<String> stringList, String str) {
        int amount = 0;

        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).contains(str)) {
                amount++;
            }
        }

        return amount;
    }
}
