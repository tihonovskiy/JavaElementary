package HW12.TaskA;
/*
    2. Создать метод addLast, принимающий на вход связный список и строку.
    Добавить в начало списка переданное строковое значение.
 */

import java.util.LinkedList;

public class AddLast {
    public static void main(String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("qwe");
        myLinkedList.add("asd");
        myLinkedList.add("zxc");

        System.out.print("Default: ");
        System.out.println(myLinkedList);

        addLast1(myLinkedList, "last1");
        System.out.print("After last1: ");
        System.out.println(myLinkedList);

        System.out.print("After last2: ");
        addLast2(myLinkedList, "last2");
        System.out.println(myLinkedList);
    }

    private static void addLast1(LinkedList<String> myLinkedList, String last) {
        myLinkedList.addLast(last);
    }

    private static void addLast2(LinkedList<String> myLinkedList, String last) {
        myLinkedList.add(myLinkedList.size(), last);
    }
}
