import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static int getUserSlot(Scanner sc) {
        System.out.print("Enter slot number (1-9): ");
        return sc.nextInt();
    }

    public static int[] convertSlotToIndex(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[] { row, col };
    }

    public static boolean isValidMove(char[][] board, int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        return board[row][col] == '-';
    }

    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    public static void printBoard(char[][] board) {
        System.out.println("\nCurrent Board:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // UC7: Computer random move
    public static void computerMove(char[][] board, char computerSymbol) {
        Random random = new Random();

        while (true) {
            int slot = random.nextInt(9) + 1; // 1–9
            int[] position = convertSlotToIndex(slot);

            int row = position[0];
            int col = position[1];

            if (isValidMove(board, row, col)) {
                placeMove(board, row, col, computerSymbol);
                System.out.println("\nComputer chose slot: " + slot);
                break;
            }
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            char[][] board = new char[3][3];

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    board[i][j] = '-';
                }
            }

            printBoard(board);

            Random random = new Random();
            boolean userStarts = random.nextBoolean();

            char userSymbol = userStarts ? 'X' : 'O';
            char computerSymbol = userStarts ? 'O' : 'X';

            System.out.println("\nUser Symbol: " + userSymbol);
            System.out.println("Computer Symbol: " + computerSymbol);

            // User Move
            int userSlot = getUserSlot(sc);
            int[] userPos = convertSlotToIndex(userSlot);

            if (isValidMove(board, userPos[0], userPos[1])) {
                placeMove(board, userPos[0], userPos[1], userSymbol);
            }

            printBoard(board);

            // Computer Move
            computerMove(board, computerSymbol);

            printBoard(board);
        }
    }
}