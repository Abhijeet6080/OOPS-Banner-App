public class OOPSBannerApp {
    public static void main(String[] args) {
        // 1. Define a String array for the 7 lines of the banner
        String[] lines = new String[7];

        // 2. Populate array using String.join() with an empty delimiter for total control
        lines[0] = String.join("", "  *** ", "  *** ", "****** ", "  *****");
        lines[1] = String.join("", "** ** ", "** ** ", "** ** ", "** **");
        lines[2] = String.join("", "** ", "** ** ", "** ** ", "** **");
        lines[3] = String.join("", "** ", "** ** ", "****** ", "  ***");
        lines[4] = String.join("", "** ", "** ** ", "** ", "    **");
        lines[5] = String.join("", "** ** ", "** ** ", "** ", "    **");
        lines[6] = String.join("", "  *** ", "  *** ", "** ", "  *****");

        // 3. Use an enhanced for-loop to print each line sequentially
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
