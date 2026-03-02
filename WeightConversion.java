import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // I/P => weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double pounds = input.nextDouble();

        // Hint => 1 pound = 2.2 kg
        // Logic: kg = pounds * 2.2
        double kgResult = pounds * 2.2;

        // O/P => The weight of the person in pounds is ___ and in kg is ___
        System.out.printf("The weight of the person in pounds is %.2f and in kg is %.2f", pounds, kgResult);

        input.close();
    }
}