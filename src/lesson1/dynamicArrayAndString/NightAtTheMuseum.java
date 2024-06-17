package lesson1.dynamicArrayAndString;

public class NightAtTheMuseum {

    public static void main(String [] args) {
        System.out.println(findNightAtTheMuseum("ares"));
        System.out.println(findNightAtTheMuseum("zeus"));
        System.out.println(findNightAtTheMuseum("map"));
    }

    private static int findNightAtTheMuseum(String str) {
        if (str == null || str.length() > 100) {
            return 0;
        }

        final int totalDistance = 26;
        int asciiAChar = 'a';
        int rotation = 0;
        for (int i = 0; i < str.length(); i++) {
            int asciiNextChar = str.charAt(i);

            int twoCharsDistance = asciiNextChar > asciiAChar ? asciiNextChar - asciiAChar : asciiAChar - asciiNextChar;
            int oppositeDistance = totalDistance - twoCharsDistance;
            rotation += (twoCharsDistance < oppositeDistance ? twoCharsDistance : oppositeDistance);
            asciiAChar = asciiNextChar;
        }
        return rotation;
    }
}
