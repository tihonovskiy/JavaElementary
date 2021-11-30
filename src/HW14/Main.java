package HW14;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Task 1
        List<String> stringList = new ArrayList<>();
        stringList.add("Привет");
        stringList.add("Мир");
        stringList.add("Привет");
        stringList.add("!");

        System.out.println(convertToUnique(stringList));

        //Task 2
        List<Integer> integersList = new ArrayList<>();
        integersList.add(1);
        integersList.add(2);
        integersList.add(3);
        integersList.add(1);
        integersList.add(4);
        integersList.add(2);
        integersList.add(5);
        integersList.add(1);

        System.out.println(getSortedUniqueIntegersASC(integersList));

        //Task 3
        System.out.println(getSortedUniqueIntegersDESC(integersList));

        //Task 4
        stringList.add("!");
        stringList.add("Тест");
        stringList.add("Привет");
        stringList.add("Готово");
        System.out.println(buildSentenceDirection(stringList));
    }

    /*
    1. Создать метод convertToUnique. Метод принимает строковый список заполненый произвольными значениями, которые могут повторяться.
    Необходимо вернуться последовательность строк, но без учета повторений.
    Например:
    Дано: [Привет, Мир, Привет, !]
    Будет хранить: [Привет, Мир, !]
     */
    public static Set<String> convertToUnique(List<String> stringList) {
        Set<String> uniqueString = new HashSet<>();
        uniqueString.addAll(stringList);
        return uniqueString;
    }

    /*
    2. Создать метод getSortedUniqueIntegersASC. Метод принимает на вход список целочисленных значений,
    заполненый произвольными значениями, которые могут повторяться.
    Необходимо вернуться последовательность целочисленных значений, но без учета повторений, отсортированных по возрастанию.
     */
    public static Set<Integer> getSortedUniqueIntegersASC(List<Integer> integersList) {
        Set<Integer> sortedUniqueIntegersASC = new TreeSet<>();
        sortedUniqueIntegersASC.addAll(integersList);
        return sortedUniqueIntegersASC;
    }

    /*
    3. Создать метод getSortedUniqueIntegersDESC. Метод принимает на вход список целочисленных значений,
    заполненый произвольными значениями, которые могут повторяться.
    Необходимо вернуться последовательность целочисленных значений, но без учета повторений, отсортированных по убыванию.
     */
    public static Set<Integer> getSortedUniqueIntegersDESC(List<Integer> integersList) {
        Set<Integer> tmp = new TreeSet<>();
        tmp.addAll(integersList);
        Set<Integer> sortedUniqueIntegersDESC = new LinkedHashSet<>();
        for (int i = tmp.size(); i > 0; i--) {
            sortedUniqueIntegersDESC.add(i);
        }
        return sortedUniqueIntegersDESC;
    }

    /*
    4. * Создать метод buildSentenceDirection. Метод принимает на вход набор строковых значений,
    заполненый произвольными значениями, которые могут повторяться.
    Необходимо вернуться последовательность строковых значений, но без учета повторений,
    которые сохранят последовательность вставки после создания такой последовательности.
    Например:
    Дано: [Привет, Мир, Привет, !, !]
    Будет хранить значения в точной последовательности и никак иначе: [Привет, Мир, !]
     */
    public static Set<String> buildSentenceDirection(List<String> stringList) {
        Set<String> stringListWithExactSequence = new LinkedHashSet<>();
        stringListWithExactSequence.addAll(stringList);
        return stringListWithExactSequence;
    }

}
