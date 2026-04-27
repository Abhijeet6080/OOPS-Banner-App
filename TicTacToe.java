public class TicTacToe {

    public static void main(String[] args) {

        // Create 3x3 board
        char[][] board = new char[3][3];

        // Initialize all cells with '-'
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
    }
}