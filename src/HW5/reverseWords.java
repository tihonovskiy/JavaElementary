package HW5;

/*
2*) Задана строка английских слов через пробел.
Написать метод который который вернет эту же строку но в которой слова в обратном порядке.
Например:
"man has dog" => "dog has man"
 */

public class reverseWords {
    public static void main(String[] args) {
        String myString1 = "man has dog";
        System.out.println(getReverseWordsString(myString1));

        String myString2 = "email login password access token";
        System.out.println(getReverseWordsString(myString2));

        String myString3 = "a b c d e";
        System.out.println(getReverseWordsString(myString3));
    }

    private static String getReverseWordsString(String myString) {
        String result = new String();

        String[] tmpWordsArray = myString.split(" ");

        for (int i = tmpWordsArray.length-1; i >= 0; i--) {
            result = result + tmpWordsArray[i] + " ";
        }

        return result.substring(0, result.length() - 1);
    }
}
