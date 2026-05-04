import java.util.Random;
import java.util.Scanner;

public class TicTacToe { // hello

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
        return row >= 0 && row < 3 &&
            col >= 0 && col < 3 &&
            board[row][col] == '-';
    }

    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    public static void printBoard(char[][] board) {
        System.out.println("\nCurrent Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void computerMove(char[][] board, char computerSymbol) {
        Random random = new Random();

        while (true) {
            int slot = random.nextInt(9) + 1;
            int[] pos = convertSlotToIndex(slot);

            if (isValidMove(board, pos[0], pos[1])) {
                placeMove(board, pos[0], pos[1], computerSymbol);
                System.out.println("Computer chose slot: " + slot);
                break;
            }
        }
    }

    // Temporary draw checker for UC8 loop testing
    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            char[][] board = new char[3][3];

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = '-';
                }
            }

            Random random = new Random();
            boolean userTurn = random.nextBoolean();

            char userSymbol = userTurn ? 'X' : 'O';
            char computerSymbol = userTurn ? 'O' : 'X';

            System.out.println("User Symbol: " + userSymbol);
            System.out.println("Computer Symbol: " + computerSymbol);

            printBoard(board);

            // UC8: Continuous Game Loop
            while (true) {

                if (userTurn) {
                    int slot = getUserSlot(sc);
                    int[] pos = convertSlotToIndex(slot);

                    if (isValidMove(board, pos[0], pos[1])) {
                        placeMove(board, pos[0], pos[1], userSymbol);
                    } else {
                        System.out.println("Invalid Move. Try Again.");
                        continue;
                    }

                } else {
                    computerMove(board, computerSymbol);
                }

                printBoard(board);

                // Temporary stop condition until win logic added
                if (isBoardFull(board)) {
                    System.out.println("Game Over - Draw!");
                    break;
                }

                // Switch turns
                userTurn = !userTurn;
            }
        }
    }
}