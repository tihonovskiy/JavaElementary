package HW11.TaskA;

/*
    4. ** Создать метод calcOccurance, принимающий на вход строковый список в качестве параметра.
    Список заполнен произвольными словами 10-20 штук, которые могут повторяться в неограниченном количестве.
    Вычислить сколько раз встречается каждое слово. Результат вывести в консоль.
    Например: bird: 2, fox: 1, cat: 1.
*/

import java.util.ArrayList;
import java.util.List;

public class CalcOccurance {

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

        calcOccurance(stringList);
    }

    public static void calcOccurance(List<String> strList) {
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

                System.out.println(strList.get(i) + ": " + count);
            }
        }
    }
}
