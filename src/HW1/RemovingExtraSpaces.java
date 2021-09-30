package HW1;

public class RemovingExtraSpaces {
    public static void main(String[] args) {
        String myString = "   test1 test2  test3   test4    test5     end   ";
        System.out.println(getStringWihtoutExtraSpaces(myString));
    }

    public static String getStringWihtoutExtraSpaces(String text) {
        return text.trim().replaceAll("[ ]{2,}", " ");
    }
}
