public class BannerApp {
    public static void main(String[] args) {
        // Goal: Storing all banner lines in a String array
        String[] bannerLines = {
            " OOOO   PPPP   SSSS ",
            "O    O  P   P  S    ",
            "O    O  PPPP   SSSS ",
            "O    O  P          S",
            " OOOO   P      SSSS "
        };

        // Flow: Program uses a loop to iterate and print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}