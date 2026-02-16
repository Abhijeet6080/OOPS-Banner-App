public class BannerApp {
    public static void main(String[] args) {
        // UC3: Using String.join to build banner segments efficiently
        // The first argument "" is the delimiter (empty string because we want letters to touch)
        
        String row1 = String.join("", "  *** ", "  *** ", " ***** ", "  **** ");
        String row2 = String.join("", " * * ", " * * ", " * * ", " * ");
        String row3 = String.join("", " * * ", " * * ", " ***** ", "  *** ");
        String row4 = String.join("", " * * ", " * * ", " * ", "     * ");
        String row5 = String.join("", "  *** ", "  *** ", " * ", " **** ");

        // Printing the Banner
        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);
        System.out.println(row5);
    }
}