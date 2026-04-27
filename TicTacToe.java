import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    // Method for UC3: Accept user slot input
    public static int getUserSlot() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter slot number (1-9): ");
        int slot = sc.nextInt();

        return slot;
    }

    public static void main(String[] args) {

        // UC1: Create board
        char[][] board = new char[3][3];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '-';
            }
        }

        // Display board
        System.out.println("Empty Tic-Tac-Toe Board:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        // UC2: Toss Logic
        Random random = new Random();

        boolean userStarts = random.nextBoolean();

        char userSymbol = userStarts ? 'X' : 'O';
        char computerSymbol = userStarts ? 'O' : 'X';

        String currentPlayer = userStarts ? "User" : "Computer";

        System.out.println("\nToss Result:");
        System.out.println("User Symbol: " + userSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
        System.out.println("First Turn: " + currentPlayer);

        // UC3: Accept user slot
        int userSlot = getUserSlot();

        System.out.println("User selected slot: " + userSlot);
    }
}