// 1. Renamed to use CamelCase (no hyphens allowed in Java class names)
public class Uc7StorePattern {

    // Static Inner Class
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // 2. Constructor must match the class name EXACTLY (Capital C)
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Utility methods to create patterns
    public static CharacterPattern createO() {
        return new CharacterPattern('O', new String[]{
            " ***** ",
            "* *",
            "* *",
            "* *",
            "* *",
            " ***** "
        });
    }

    public static CharacterPattern createP() {
        return new CharacterPattern('P', new String[]{
            "*******",
            "* *",
            "* *",
            "*******",
            "* ",
            "* "
        });
    }
}