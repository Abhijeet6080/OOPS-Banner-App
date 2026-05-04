import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    // UC3: Get user slot input
    public static int getUserSlot(Scanner sc) {
        System.out.print("Enter slot number (1-9): ");
        return sc.nextInt();
    }

    // UC4: Convert slot to row/column
    public static int[] convertSlotToIndex(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[] { row, col };
    }

    // UC5: Validate move
    public static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 &&
            col >= 0 && col < 3 &&
            board[row][col] == '-';
    }

    // UC6: Place move
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // UC1: Print board
    public static void printBoard(char[][] board) {
        System.out.println("\nCurrent Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // UC7: Computer random move
    public static void computerMove(char[][] board, char computerSymbol) {
        Random random = new Random();

        while (true) {
            int slot = random.nextInt(9) + 1;

            int[] position = convertSlotToIndex(slot);
            int row = position[0];
            int col = position[1];

            if (isValidMove(board, row, col)) {
                placeMove(board, row, col, computerSymbol);
                System.out.println("Computer chose slot: " + slot);
                break;
            }
        }
    }

    // UC9: Check winner
    public static boolean checkWinner(char[][] board, char symbol) {

        // Rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol) {
                return true;
            }
        }

        // Columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == symbol &&
                board[1][j] == symbol &&
                board[2][j] == symbol) {
                return true;
            }
        }

        // Main diagonal
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) {
            return true;
        }

        // Anti-diagonal
        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) {
            return true;
        }

        return false;
    }

    // UC10: Detect draw
    public static boolean isDraw(char[][] board) {
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

            // Initialize board
            char[][] board = new char[3][3];

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = '-';
                }
            }

            // UC2: Toss
            Random random = new Random();
            boolean userTurn = random.nextBoolean();

            char userSymbol = userTurn ? 'X' : 'O';
            char computerSymbol = userTurn ? 'O' : 'X';

            System.out.println("User Symbol: " + userSymbol);
            System.out.println("Computer Symbol: " + computerSymbol);
            System.out.println(userTurn ? "User starts first." : "Computer starts first.");

            printBoard(board);

            // UC8: Game Loop
            while (true) {

                if (userTurn) {

                    int slot = getUserSlot(sc);
                    int[] position = convertSlotToIndex(slot);

                    int row = position[0];
                    int col = position[1];

                    if (!isValidMove(board, row, col)) {
                        System.out.println("Invalid Move. Try Again.");
                        continue;
                    }

                    placeMove(board, row, col, userSymbol);

                    if (checkWinner(board, userSymbol)) {
                        printBoard(board);
                        System.out.println("User Wins!");
                        break;
                    }

                } else {

                    computerMove(board, computerSymbol);

                    if (checkWinner(board, computerSymbol)) {
                        printBoard(board);
                        System.out.println("Computer Wins!");
                        break;
                    }
                }

                printBoard(board);

                if (isDraw(board)) {
                    System.out.println("Game Over - Draw!");
                    break;
                }

                // Switch Turn
                userTurn = !userTurn;
            }
        }
    }
}