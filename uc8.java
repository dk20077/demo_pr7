import java.util.*;

public class BannerApp {

    /**
     * Utility method to create and return character patterns using HashMap
     */
    public static Map<Character, String[]> createPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        // Pattern for 'O'
        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Pattern for 'P'
        map.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        // Pattern for 'S'
        map.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return map;
    }

    /**
     * Utility method to print banner
     */
    public static void printBanner(String word, Map<Character, String[]> map) {

        StringBuilder[] bannerLines = new StringBuilder[7];

        // Initialize StringBuilders
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        // Build banner
        for (char ch : word.toCharArray()) {
            String[] pattern = map.get(ch);

            if (pattern != null) {
                for (int i = 0; i < 7; i++) {
                    bannerLines[i].append(pattern[i]).append("  ");
                }
            }
        }

        // Print banner
        for (StringBuilder line : bannerLines) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        // Create pattern map
        Map<Character, String[]> patternMap = createPatternMap();

        // Word to display
        String word = "OOPS";

        // Print banner
        printBanner(word, patternMap);
    }
}