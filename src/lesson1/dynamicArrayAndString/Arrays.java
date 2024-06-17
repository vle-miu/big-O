package lesson1.dynamicArrayAndString;

public class Arrays {

    public static void main (String[] args) {
        System.out.println(checkArrays(3, 3, 2, 1, new int [] {1, 2, 3}, new int[] {4, 5, 6}));
        System.out.println(checkArrays(3, 3, 3, 3, new int [] {1, 2, 3}, new int[] {3, 4, 5}));
        System.out.println(checkArrays(5, 2, 3, 1, new int [] {1, 1, 1, 1, 1}, new int[] {2, 2}));
    }

    private static String checkArrays(int na, int nb, int k, int m, int[] a, int[] b) {
        if (na != a.length || nb != b.length || k > a.length || m > b.length) {
            return "NO";
        }

        if (a[k - 1] < b[b.length - m]) {
            return "YES";
        }
        return "NO";
    }
}
