public class OOPSBannerApp {
    public static void main(String[] args) {
    
        // 1. Call your helper methods to get the patterns [cite: 38, 120-122]
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // 2. Loop to assemble and print each line of the banner "OOPS" [cite: 40, 126]
        for (int i = 0; i < oPattern.length; i++) {
            // This line combines the letters with a space in between [cite: 65]
            System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
        }
    }
    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            "  *** ",
            " ** ** ",
            "** **",
            "** **",
            "** **",
            " ** ** ",
            "  *** "
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            "*******",
            "** **",
            "** **",
            "*******",
            "** ",
            "** ",
            "** "
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            " ***** ",
            "** ",
            "** ",
            " ***** ",
            "     **",
            "** ",
            " ***** "
        };
    }
}

