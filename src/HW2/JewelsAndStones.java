package HW2;

// https://leetcode.com/problems/jewels-and-stones/

public class JewelsAndStones {
    public static void main(String[] args) {
        /*String jewels = "aA";
        String stones = "aAAbbbb";*/

        String jewels = "z";
        String stones = "ZZ";

        System.out.println(getCountJewelsInStones(jewels, stones));
    }

    public static int getCountJewelsInStones(String jewels, String stones) {
        int count = 0;
        if (jewels.length() == 0 || stones.length() == 0) {
            return count;
        }

        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                count++;
            }
        }

        return count;
    }
}


