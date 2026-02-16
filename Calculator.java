import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a. Create variables and take user inputs
        System.out.print("Enter number 1: ");
        double number1 = input.nextDouble();
        
        System.out.print("Enter number 2: ");
        double number2 = input.nextDouble();

        // b. Perform Arithmetic Operations
        double sum = number1 + number2;
        double diff = number1 - number2;
        double prod = number1 * number2;
        double div = number1 / number2;

        // Final O/P formatted as per your requirement
        System.out.printf("The addition, subtraction, multiplication, and division value of 2 numbers %.1f and %.1f is %.1f, %.1f, %.1f, and %.1f", number1, number2, sum, diff, prod, div);
        
        input.close();
    }
}