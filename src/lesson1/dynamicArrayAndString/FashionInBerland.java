package lesson1.dynamicArrayAndString;

public class FashionInBerland {

    public static void main(String[] args) {
        System.out.println(checkIfJackFastened(3, new int [] {1, 0, 0}));
        System.out.println(checkIfJackFastened(3, new int [] {1, 0, 1}));
    }

    static String checkIfJackFastened(int N, int[] buttons) {
        if (N < 1 || N > 1000 || buttons.length != N) {
            return "NO";
        }

        if (buttons.length == 1) {
            if (buttons[0] == 1) {
                return "YES";
            } else {
                return "NO";
            }
        }

        int countUnfastenedButton = 0;
        for (int i = 0; i < buttons.length; i++) {
            if (buttons[i] < 0 || buttons[i] > 1) {
                return "NO";
            }

            if (buttons[i] == 0) {
                countUnfastenedButton++;
                if (countUnfastenedButton > 1) {
                    return "NO";
                }
            }
        }

        return "YES";
    }
}
