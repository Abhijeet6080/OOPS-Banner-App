package Level1;

public class Que4 {

    // Method to generate NullPointerException
    @SuppressWarnings("null") // suppresses IDE warning (intentional null)
    public static void generateException() {
        String text = null;

        // Intentionally causing exception
        System.out.println("Length: " + text.length());
    }

    // Helper method to avoid "always null" warning in handler
    public static String getNullString() {
        return null;
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = getNullString();

        try {
            System.out.println("Length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: text is null");
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Generating Exception ===");

        // Calling method that generates exception
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e);
        }

        System.out.println("\n=== Handling Exception ===");

        // Calling method that handles exception
        handleException();
    }
}