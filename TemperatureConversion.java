import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // I/P => Create a celsius variable and take the temperature as user input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Hint => Use the Formulae (°C × 9/5) + 32 = °F
        // Logic: Multiply by 9, divide by 5, then add 32
        double farenheitResult = (celsius * 9 / 5) + 32;

        // O/P => The ____ celsius is _____ fahrenheit
        System.out.printf("The %.1f celsius is %.1f fahrenheit", celsius, farenheitResult);

        input.close();
    }
}