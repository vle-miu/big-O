package lesson1.dynamicArrayAndString;

public class Passwords {

    public static void main(String [] args) {
        int[] result = checkPassword(5, 2, new String[] {"cba", "abc", "bb1", "abC", "ABC"}, "abc");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);;
        }

        result = checkPassword(4, 100, new String[] {"11", "22", "1", "2"}, "22");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);;
        }
    }

    private static int[] checkPassword(int n, int k, String [] passwords, String correctPassword) {
        if (n != passwords.length || k < 1 || k > 100) {
            throw new IllegalArgumentException("Input parameters is incorrect");
        }

        int bestCaseSeconds = 0;
        int worstCaseSeconds = 0;

        int countWrongTries = 0;
        int worstCaseWithLessLength = 0;
        int worstCaseWithSameLength = 0;
        for (int i = 0; i < passwords.length; i++) {
            countWrongTries++;
            if (passwords[i].length() < correctPassword.length()) {
                worstCaseWithLessLength += 1;

                if (countWrongTries >= k) {
                    worstCaseWithLessLength += 5;
                    countWrongTries = 0;
                }
            } else if (!passwords[i].equals(correctPassword)) {
                worstCaseWithSameLength += 1;

                if (countWrongTries >= k) {
                    worstCaseWithSameLength += 5;
                    countWrongTries = 0;
                }
            }
        }

        bestCaseSeconds = worstCaseWithLessLength + 1;
        worstCaseSeconds = worstCaseWithLessLength + worstCaseWithSameLength + 1;
        return new int[] {bestCaseSeconds, worstCaseSeconds};
    }
}
