package HW11.TaskA;

/*
    3. Создать метод findUnique, принимающий на вход числовой список состоящий из произвольных значений,
    которые могут повторяться в неограниченном количестве.
    Необходимо вернуть новый числовой список содержащий только уникальные числа.
*/

import java.util.ArrayList;
import java.util.List;

public class FindUnique {

    public static void main(String[] args) {
        List<Integer> myListInteger = new ArrayList<>();
        myListInteger.add(1);
        myListInteger.add(2);
        myListInteger.add(2);
        myListInteger.add(3);
        myListInteger.add(3);
        myListInteger.add(3);
        myListInteger.add(4);
        myListInteger.add(4);
        myListInteger.add(4);
        myListInteger.add(4);
        myListInteger.add(5);
        myListInteger.add(5);
        myListInteger.add(5);
        myListInteger.add(5);
        myListInteger.add(5);

        List<Integer> result = findUnique(myListInteger);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<Integer> findUnique (List<Integer> myListInt) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < myListInt.size(); i++) {
            if(!resultList.contains(myListInt.get(i))) {
                resultList.add(myListInt.get(i));
            }
        }

        return resultList;
    }
}
