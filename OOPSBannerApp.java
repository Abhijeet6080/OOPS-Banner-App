public class OOPSBannerApp {
<<<<<<< HEAD
    public static void main(String[] args) {
        
        // UC5: Inline Array Initialization
        // We declare, initialize, and populate the array in one block
        String[] lines = {
            String.join("", "  *** ", "  *** ", "****** ", "  *****"),
            String.join("", "** ** ", "** ** ", "** ** ", "** **"),
            String.join("", "** ", "** ** ", "** ** ", "** **"),
            String.join("", "** ", "** ** ", "****** ", "  ***"),
            String.join("", "** ", "** ** ", "** ", "    **"),
            String.join("", "** ** ", "** ** ", "** ", "    **"),
            String.join("", "  *** ", "  *** ", "** ", "  *****")
        };

        // Enhanced for-loop remains the same for printing
=======
    // Main method to run the banner display
    public static void main(String[] args) {
        
        // 1. Define a String array with a size equal to the number of lines in the banner
        String[] lines = new String[7];

        // 2. Populate each index of the array with the corresponding banner line using String.join()
        lines[0] = String.join(" ", "  ***", "   ***", "******", " *****");
        lines[1] = String.join(" ", "** ", "**", "** ", "**", "** ", "** ", "**");
        lines[2] = String.join(" ", "** ", "  ** **", "   ** **", "  ** **");
        lines[3] = String.join(" ", "** ", "  ** **", "   ******", "   ***");
        lines[4] = String.join(" ", "** ", "  ** **", "   ** **", "    **");
        lines[5] = String.join(" ", " **", " ** ", "** ", "**", "** ", "** ", " **");
        lines[6] = String.join(" ", "  ***", "   ***", " **", "     *****");

        // 3. Use a for-each loop to iterate through the array and print each line
>>>>>>> origin/dev
        for (String line : lines) {
            System.out.println(line);
        }
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> origin/dev
