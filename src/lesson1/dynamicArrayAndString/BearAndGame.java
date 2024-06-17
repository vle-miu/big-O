package lesson1.dynamicArrayAndString;

public class BearAndGame {

    public static void main(String[] args) {
        System.out.println(countWatchingTime(3, new int[] {7, 20, 88}));
        System.out.println(countWatchingTime(9, new int[] {16, 20, 30, 40, 50, 60, 70, 80, 90}));
        System.out.println(countWatchingTime(9, new int[] {15, 20, 30, 40, 50, 60, 70, 80, 90}));
    }

    private static int countWatchingTime(int numberOfMinutes, int[] interestingMinutes) {
        if (numberOfMinutes < 0 || numberOfMinutes > 90) {
            return 0;
        }

        if (interestingMinutes.length != numberOfMinutes) {
            return 0;
        }

        final int consecutiveBoringMinutes = 15;
        int startMinutes = 0;
        int watchingTime = startMinutes;
        for (int i = 0; i < interestingMinutes.length; i++) {
            if (interestingMinutes[i] - startMinutes <= consecutiveBoringMinutes) {
                watchingTime += (interestingMinutes[i] - startMinutes);
            } else {
                watchingTime += consecutiveBoringMinutes;
                break;
            }
            startMinutes = interestingMinutes[i];
        }
        return watchingTime;
    }
}
