import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Method to build the map of character patterns
    public static Map<Character, String[]> getCharacterPatterns() {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patterns.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        patterns.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return patterns;
    }

    // Method to render banner
    public static void renderBanner(String message, Map<Character, String[]> patterns) {

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char c : message.toCharArray()) {
                line.append(patterns.get(c)[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patterns = getCharacterPatterns();

        String message = "OOPS";

        renderBanner(message, patterns);
    }
}
