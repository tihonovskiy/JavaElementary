package HW12.TaskA;

/*
    1. Создать метод addFirst, принимающий на вход связный список и строку.
    Добавить в конец списка переданное строковое значение.
 */

import java.util.LinkedList;

public class AddFirst {

    public static void main(String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("qwe");
        myLinkedList.add("asd");
        myLinkedList.add("zxc");

        System.out.print("Default: ");
        System.out.println(myLinkedList);

        addFirst1(myLinkedList, "first1");
        System.out.print("After first1: ");
        System.out.println(myLinkedList);


        addFirst2(myLinkedList, "first2");
        System.out.print("After first2: ");
        System.out.println(myLinkedList);
    }

    public static void addFirst1(LinkedList<String> linkedList, String first) {
        linkedList.addFirst(first);
    }

    public static void addFirst2(LinkedList<String> linkedList, String target) {
        linkedList.add(0, target);
    }

}
