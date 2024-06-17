package lesson1.dynamicArrayAndString;

public class BigSegment {

    public static void main(String[] args) {
        System.out.println(findBigSegment(3, new int[][] {{3, 3}, {4, 4}, {5, 5}}));
        System.out.println(findBigSegment(6, new int[][] {{1, 5}, {2, 3}, {1, 10}, {7, 10}, {7, 7}, {10, 10}}));
    }

    private static int findBigSegment(int n, int [][] segments) {
        if (n != segments.length) {
            return -1;
        }

        int countCoverSegments = 0;
        for (int i = 0; i < segments.length; i++) {
            if (segments[i].length != 2) {
                return -1;
            }

            int count = 0;
            for (int j = i + 1; j < segments.length; j++) {
                if (segments[i][0] <= segments[j][0] && segments[j][0] <= segments[j][1] && segments[j][1] <= segments[i][1]) {
                    count++;
                }
            }

            if (count > countCoverSegments) {
                countCoverSegments = count;
            }
        }
        return countCoverSegments > 0 ? countCoverSegments : -1;
    }
}
