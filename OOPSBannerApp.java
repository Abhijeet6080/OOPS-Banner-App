public class OOPSBannerApp {
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
        for (String line : lines) {
            System.out.println(line);
        }
    }
}

