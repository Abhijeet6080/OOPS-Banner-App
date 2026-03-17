import java.util.Scanner;

public class Que2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("Enter 5 numbers:");

        // Taking input
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        // Checking positive, negative, zero and even/odd
        for (int i = 0; i < num.length; i++) {

            if (num[i] > 0) {

                if (num[i] % 2 == 0) {
                    System.out.println(num[i] + " is positive and even");
                } else {
                    System.out.println(num[i] + " is positive and odd");
                }

            } 
            else if (num[i] < 0) {
                System.out.println(num[i] + " is negative");
            } 
            else {
                System.out.println(num[i] + " is zero");
            }
        }

        // Comparing first and last element
        if (num[0] == num[num.length - 1]) {
            System.out.println("First and last elements are equal");
        } 
        else if (num[0] > num[num.length - 1]) {
            System.out.println("First element is greater than last element");
        } 
        else {
            System.out.println("First element is less than last element");
        }

        sc.close();
    }
}


