import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static int getUserSlot(Scanner sc) {
        System.out.print("Enter slot number (1-9): ");
        return sc.nextInt();
    }

    public static int[] convertSlotToIndex(int slot) {
        return new int[] { (slot - 1) / 3, (slot - 1) % 3 };
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

    // UC9: Check Winning Condition
    public static boolean checkWinner(char[][] board, char symbol) {

        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == symbol &&
                board[1][j] == symbol &&
                board[2][j] == symbol) {
                return true;
            }
        }

        // Check main diagonal
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) {
            return true;
        }

        // Check anti-diagonal
        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) {
            return true;
        }

        return false;
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

            while (true) {

                if (userTurn) {
                    int slot = getUserSlot(sc);
                    int[] pos = convertSlotToIndex(slot);

                    if (isValidMove(board, pos[0], pos[1])) {
                        placeMove(board, pos[0], pos[1], userSymbol);

                        if (checkWinner(board, userSymbol)) {
                            printBoard(board);
                            System.out.println("User Wins!");
                            break;
                        }

                    } else {
                        System.out.println("Invalid Move. Try Again.");
                        continue;
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

                if (isBoardFull(board)) {
                    System.out.println("Game Over - Draw!");
                    break;
                }

                userTurn = !userTurn;
            }
        }
    }
}