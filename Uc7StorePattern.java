public class Uc7StorePattern {

    // Static Inner Class
    static class CharacterPattern {
        private char character;
        private String[] pattern;

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
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        });
    }

    public static CharacterPattern createP() {
        return new CharacterPattern('P', new String[]{
                "*******  ",
                "*      * ",
                "*      * ",
                "*******  ",
                "*        ",
                "*        ",
                "*        "
        });
    }

    public static CharacterPattern createS() {
        return new CharacterPattern('S', new String[]{
                " ******  ",
                "*        ",
                "*        ",
                " *****   ",
                "        *",
                "        *",
                " ******  "
        });
    }

    public static void main(String[] args) {

        CharacterPattern[] letters = {
                createO(),
                createO(),
                createP(),
                createS()
        };

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPattern cp : letters) {
                line.append(cp.getPattern()[i]).append("  ");
            }
            System.out.println(line);
        }
    }
}