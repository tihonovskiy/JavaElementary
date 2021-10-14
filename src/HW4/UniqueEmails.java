package HW4;

//https://leetcode.com/problems/unique-email-addresses/

public class UniqueEmails {
    public static void main(String[] args) {
        String[] emails1 = {"test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};

        String[] emails2 = {"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"};

        System.out.println(numUniqueEmails(emails1));
        System.out.println(numUniqueEmails(emails2));
    }

    public static int numUniqueEmails(String[] emails) {
        int countEmail = 0;
        String[] resultEmails = new String[emails.length];

        for (int i = 0; i < emails.length; i++) {
            String[] tmp1 = emails[i].split("@");
            String[] tmp2 = tmp1[0].split("\\+");
            resultEmails[i] = tmp2[0].replaceAll("\\.", "") + "@" + tmp1[tmp1.length - 1];
        }

        for (int i = 0; i < resultEmails.length; i++) {
            countEmail++;
            for (int j = i; j < resultEmails.length; j++) {
                if (resultEmails[i].equals(resultEmails[j]) && i != j) {
                    countEmail--;
                    break;
                }
            }
        }

        return countEmail;
    }
}
