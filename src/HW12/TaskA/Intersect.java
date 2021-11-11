package HW12.TaskA;

/*
    5. Создать метод intersect, принимающий на вход два целочисловых связных списка,
    заполненные произвольными значениями (5-10 шт. в каждом).
    Метод должен вернуть новый связный список содержащий только элементы имеющиеся одновременно
    в каждом из переданных список (пересечение).
    Например:
    param1 [1, 2, 3]
    param2 [3, 2, 5, 7]
    result [2, 3]
 */

import java.util.LinkedList;

public class Intersect {

    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList1 = new LinkedList<>();
        myLinkedList1.add(1);
        myLinkedList1.add(20);
        myLinkedList1.add(3);
        myLinkedList1.add(40);
        myLinkedList1.add(5);
        myLinkedList1.add(60);
        myLinkedList1.add(7);
        myLinkedList1.add(80);
        myLinkedList1.add(9);
        myLinkedList1.add(100);
        myLinkedList1.add(11);
        myLinkedList1.add(120);
        myLinkedList1.add(13);
        myLinkedList1.add(140);
        myLinkedList1.add(15);

        LinkedList<Integer> myLinkedList2 = new LinkedList<>();
        myLinkedList2.add(1);
        myLinkedList2.add(2);
        myLinkedList2.add(3);
        myLinkedList2.add(4);
        myLinkedList2.add(5);
        myLinkedList2.add(6);
        myLinkedList2.add(7);
        myLinkedList2.add(8);
        myLinkedList2.add(9);
        myLinkedList2.add(10);
        myLinkedList2.add(11);
        myLinkedList2.add(12);
        myLinkedList2.add(13);
        myLinkedList2.add(14);
        myLinkedList2.add(15);

        System.out.println(intersect(myLinkedList1, myLinkedList2));
    }

    private static LinkedList intersect(LinkedList<Integer> myLinkedList1, LinkedList<Integer> myLinkedList2) {
        LinkedList<Integer> resultLinkedList = new LinkedList<>();

        for (Integer value : myLinkedList1) {
            if (myLinkedList2.contains(value)) {
                resultLinkedList.add(value);
            }
        }

        return resultLinkedList;
    }
}
