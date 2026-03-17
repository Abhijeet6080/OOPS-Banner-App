public class MultiGreetingApp {

    public static void main(String[] args) {

        if (args.length > 0) {
            String names = String.join(", ", args);
            System.out.println("Hello, " + names + "!");
        } 
        else {
            System.out.println("Hello, World!");
        }

    }
}