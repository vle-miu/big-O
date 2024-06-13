package lesson1.dynamicArrayAndString;

public class SuffixStructures {

    public static void main (String [] args) {
        System.out.println(checkSuffixStructure("automaton", "tomat"));
        System.out.println(checkSuffixStructure("array", "arary"));
        System.out.println(checkSuffixStructure("both", "hot"));
        System.out.println(checkSuffixStructure("need", "tree"));
    }

    public static String checkSuffixStructure(String s, String t) {
        if (s == null || s.length() == 0 || t == null || t.length() == 0) {
            return "EMPTY";
        }

        // TODO
        return null;
    }
}
