import java.util.Random;

public class TicTacToe {

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

        char userSymbol;
        char computerSymbol;
        String currentPlayer;

        if (userStarts) {
            userSymbol = 'X';
            computerSymbol = 'O';
            currentPlayer = "User";
        } else {
            userSymbol = 'O';
            computerSymbol = 'X';
            currentPlayer = "Computer";
        }

        // Display toss result
        System.out.println("\nToss Result:");
        System.out.println("User Symbol: " + userSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
        System.out.println("First Turn: " + currentPlayer);
    }
}