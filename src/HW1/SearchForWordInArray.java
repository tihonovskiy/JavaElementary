package HW1;

public class SearchForWordInArray {
    public static void main(String[] args) {
        char[][] myArrayChar = new char[][]{{'a', 'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a', 'a'},
                {'a', 't', 'e', 's', 't'},
                {'a', 'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a', 'a'}};
        String findWorld = "test";
        System.out.println(searchForWordInArray(myArrayChar, findWorld));
    }

    public static String searchForWordInArray(char[][] myArrayChar, String findWorld) {
        String[] myWords = new String[myArrayChar.length * 2];

        for (int i = 0; i < myWords.length; i++) {
            myWords[i] = "";
        }

        String result = "";

        for (int i = 0; i < myArrayChar.length; i++) {
            for (int j = 0; j < myArrayChar.length; j++)
                myWords[i] += myArrayChar[i][j];
        }

        for (int i = 0; i < myArrayChar.length; i++) {
            for (int j = 0; j < myArrayChar.length; j++)
                myWords[i + myArrayChar.length] += myArrayChar[j][i];
        }

        for (int i = 0; i < myWords.length; i++) {
            if (myWords[i].contains(findWorld)) {
                result = "Word is find";
                break;
            } else if ((myWords.length) - 1 == i) {
                result = "Word is NOT find";
            }
        }

        return result;
    }
}
