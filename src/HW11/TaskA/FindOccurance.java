package HW11.TaskA;

/*
    5. *** Создать метод findOccurance, принимающий на вход строковый список в качестве параметра.
    Список заполнен произвольными словами 10-20 штук, которые могут повторяться в неограниченном количестве.
    Вычислить сколько раз встречается каждое слово.
    Результат вернуть в виде списка структур описывающих повторение каждого отдельного взятого слова.
    Например:
    [
       {name: "bird", occurrence: 2},
       {name: "fox", occurrence: 1},
       {name: "cat", occurrence: 1}
    ]
 */

import java.util.ArrayList;
import java.util.List;

public class FindOccurance {

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

        System.out.println(findOccurance(stringList));
    }

    public static List<MyStructure> findOccurance(List<String> strList) {
        List<MyStructure> result = new ArrayList<>();
        List<String> bufferList = new ArrayList<>();

        for (int i = 0; i < strList.size(); i++) {
            if(!bufferList.contains(strList.get(i))) {
                bufferList.add(strList.get(i));
                int count = 0;

                for (int j = 0; j < strList.size(); j++) {
                    if(strList.get(i).equals(strList.get(j))) {
                        count++;
                    }
                }

                result.add(new MyStructure(strList.get(i), count));
            }
        }

        return result;
    }
}
