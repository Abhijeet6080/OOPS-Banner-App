import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    // UC3: Accept user slot input
    public static int getUserSlot(Scanner sc) {
        System.out.print("Enter slot number (1-9): ");
        return sc.nextInt();
    }

    // UC4: Convert slot to row and column
    public static int[] convertSlotToIndex(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[] { row, col };
    }

    // UC5: Validate move
    public static boolean isValidMove(char[][] board, int row, int col) {

        // Check bounds
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        return board[row][col] == '-';
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // UC1: Initialize board
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

            // UC2: Toss
            Random random = new Random();

            boolean userStarts = random.nextBoolean();

            char userSymbol = userStarts ? 'X' : 'O';
            char computerSymbol = userStarts ? 'O' : 'X';

            String currentPlayer = userStarts ? "User" : "Computer";

            System.out.println("\nToss Result:");
            System.out.println("User Symbol: " + userSymbol);
            System.out.println("Computer Symbol: " + computerSymbol);
            System.out.println("First Turn: " + currentPlayer);

            // UC3: Get slot
            int userSlot = getUserSlot(sc);

            // UC4: Convert slot
            int[] position = convertSlotToIndex(userSlot);

            int row = position[0];
            int col = position[1];

            // UC5: Validate move
            boolean valid = isValidMove(board, row, col);

            if (valid) {
                System.out.println("Valid move.");
            } else {
                System.out.println("Invalid move.");
            }
        }
    }
}