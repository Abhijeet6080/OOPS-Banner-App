import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // I/P => Create variables and take user input
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        // The Swap Logic (using a temporary variable)
        int temp = number1; // Put number1 in the 'third cup'
        number1 = number2;  // Move number2 into number1
        number2 = temp;     // Take the value from the 'third cup' and put it in number2

        // O/P => The swapped numbers are ___ and ___
        System.out.printf("The swapped numbers are %d and %d", number1, number2);

        input.close();
    }
}