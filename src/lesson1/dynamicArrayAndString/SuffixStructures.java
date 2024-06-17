package lesson1.dynamicArrayAndString;

public class SuffixStructures {

    public static void main (String [] args) {
        System.out.println(checkSuffixStructure("automaton", "tomat"));
        System.out.println(checkSuffixStructure("array", "arary"));
        System.out.println(checkSuffixStructure("both", "hot"));
        System.out.println(checkSuffixStructure("need", "tree"));
    }

    private static String checkSuffixStructure(String s, String t) {
        if (s == null || s.isEmpty() || t == null || t.isEmpty()) {
            throw new IllegalArgumentException("Input parameters is incorrect");
        }

        boolean isAutomaton = false;
        boolean isNeedTree = false;
        boolean isArray = false;

        int[] sCount = new int[26];
        int[] tCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            tCount[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (sCount[i] > tCount[i]) {
                isAutomaton = true;
            } else if (sCount[i] < tCount[i]) {
                isNeedTree = true;
            }
        }

        int indexFound = 0;
        int match = -1;
        for (int i = 0; i < t.length(); i++) {
            indexFound = s.indexOf(t.charAt(i), match + 1);

            if (indexFound > match) {
                match = indexFound;
            } else {
                isArray = true;
                break;
            }
        }

        if (isNeedTree) {
            return "Need Tree";
        } else if (isAutomaton && isArray) {
            return "Both";
        } else if (isAutomaton) {
            return "Automaton";
        } else {
            return "Array";
        }
    }
}
