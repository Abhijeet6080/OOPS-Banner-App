import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // I/P => perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Hint => Perimeter of the Square is 4 times the side
        // Logic: side = perimeter / 4
        double side = perimeter / 4;

        // O/P => The length of the side is ___ whose perimeter is ___
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f", side, perimeter);

        input.close();
    }
}