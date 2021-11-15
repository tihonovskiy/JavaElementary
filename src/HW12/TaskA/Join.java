package HW12.TaskA;

/*
    3. Создать метод join, принимающий на вход два целочисловых связных списка,
    заполненные произвольными значениями (5-10 шт. в каждом).
    Метод должен возвращать объединение двух переданных списков.
    Например:
    param1 [1, 2, 3]
    param2 [5, 7, 8]
    result [1, 2, 3, 5, 7, 8]
 */

import java.util.LinkedList;

public class Join {

    public static void main(String[] args) {
        LinkedList<Integer> param1 = new LinkedList<>();
        param1.add(1);
        param1.add(2);
        param1.add(3);

        LinkedList<Integer> param2 = new LinkedList<>();
        param1.add(5);
        param1.add(7);
        param1.add(8);

        System.out.print("JOIN1: ");
        System.out.println(join1(param1, param2));

        join2(param1, param2);
        System.out.print("JOIN2: ");
        System.out.println(join1(param1, param2));
    }

    public static LinkedList<Integer> join1(LinkedList<Integer> linkedList1, LinkedList<Integer> linkedList2) {
        LinkedList<Integer> result = new LinkedList<>(linkedList1);
        result.addAll(linkedList2);

        return result;
    }

    public static LinkedList<Integer> join2(LinkedList<Integer> linkedList1, LinkedList<Integer> linkedList2) {
        LinkedList<Integer> result = (LinkedList<Integer>) linkedList1.clone();
        result.addAll(linkedList2);

        return result;
    }
}
