package HW3;

import java.util.HashSet;
import java.util.Set;

public class FindString {
    public static void main(String[] args) {
        String firstString1 = "asdf";
        String secondString1 = "fdsa";
        System.out.println(findStringInPermutationString(firstString1, secondString1));

        String firstString2 = "asdf";
        String secondString2 = "asdfg";
        System.out.println(findStringInPermutationString(firstString2, secondString2));

        String firstString3 = "aab";
        String secondString3 = "bba";
        System.out.println(findStringInPermutationString(firstString3, secondString3));
    }

    public static boolean findStringInPermutationString(String myString, String findString) {
        String[] arrayFromFirstStr = permutationFinder(myString).toArray(String[]::new);

        for (String str : arrayFromFirstStr) {
            if (str.equals(findString)) {
                return true;
            }
        }

        return false;
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
            for (int i = 0;i<=strNew.length();i++){
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
