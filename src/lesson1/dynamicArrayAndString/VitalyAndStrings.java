package lesson1.dynamicArrayAndString;

public class VitalyAndStrings {

    public static void main(String[] args) {
        System.out.println(vitalyAndStrings("k", "m"));
        System.out.println(vitalyAndStrings("klmnopq", "klmpopq"));
        System.out.println(vitalyAndStrings("abcde", "abcdf"));
    }

    private static String vitalyAndStrings(String s, String t) {
        if (s.length() != t.length()) {
            return "No such string";
        }

        char [] results = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (t.charAt(i) - s.charAt(i) > 1) {
                char lastChar = s.charAt(s.length() - 1);
                return s.replace(lastChar, (char) (lastChar + 1));
            } else if (t.charAt(i) - s.charAt(i) == 1) {
                if (i == s.length() - 1) {
                    return "No such string";
                }
            }
            results[i] = s.charAt(i);
        }

        return new String(results);
    }
}
