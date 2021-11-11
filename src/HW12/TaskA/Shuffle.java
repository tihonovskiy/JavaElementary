package HW12.TaskA;

/*
    4. Создать метод shuffle, принимающий на вход связный список содержащий любой (на выбор) тип данных,
    заполненный соответствующими произвольными значениями (10-20 шт.).
    Метод должен поменять местами имеющиеся внутри списка значения в случайном порядке (тасовка).
    Каждый потенциальный вызов метода будет возвращать новый результат, где нет гарантии повторения порядка.
 */

import java.util.LinkedList;
import java.util.Random;

public class Shuffle {

    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(6);
        myLinkedList.add(7);
        myLinkedList.add(8);
        myLinkedList.add(9);
        myLinkedList.add(10);
        myLinkedList.add(11);
        myLinkedList.add(12);
        myLinkedList.add(13);
        myLinkedList.add(14);
        myLinkedList.add(15);

        System.out.print("Default: ");
        System.out.println(myLinkedList);


        System.out.print("After first shuffle : ");
        System.out.println(shuffle(myLinkedList));

        System.out.print("After second shuffle : ");
        System.out.println(shuffle(myLinkedList));
    }

    private static LinkedList<Integer> shuffle(LinkedList<Integer> linkedList) {
        Random random = new Random();

        for (int i = 0; i < linkedList.size(); i++) {
            int randomIndex = random.nextInt(linkedList.size());
            Integer tmp = linkedList.get(i);
            linkedList.set(i, linkedList.get(randomIndex));
            linkedList.set(randomIndex, tmp);
        }

        return linkedList;
    }
}
