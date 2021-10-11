package HW3;

/*
3*) Задана строка. Вывести все перестановки этой строки.
Например для строки "abc":
abc, acb, bac, bca, cab, cba
*/

import java.util.HashSet;
import java.util.Set;

public class Permutation {
    public static void main(String[] args) {
        String myString = "abc";
        System.out.println("\nPermutations for " + myString + " are: \n" + permutationFinder(myString));
    }

    public static Set<String> permutationFinder(String str) {
        Set<String> perm = new HashSet<>();
        if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0);
        String rem = str.substring(1);
        Set<String> words = permutationFinder(rem);
        for (String strNew : words) {
            for (int i = 0; i <= strNew.length(); i++) {
                perm.add(insertChar(strNew, initial, i));
            }
        }
        return perm;
    }

    public static String insertChar(String str, char initial, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + initial + end;
    }
}
