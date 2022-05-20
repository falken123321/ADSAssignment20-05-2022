package Queens;

public class nQueensBacktracking {

    static int[] X1 = new int[30];              //Row-col+N-1
    static int[] diagonalRight = new int[30];   //Used for diagonal Right Check
    static int[] rowCheck = new int[30];        //Used for Row check



    //Recursive function
    static boolean populate(int board[][], int column) {
        //END
        if (column >= board.length) {
            return true;
        }

        //Go through each column
        for (int i = 0; i < board.length; i++) {

            //Check if it's possible to place queen
            if (rowCheck[i] != 1 && (X1[i - column + board.length - 1] != 1 && diagonalRight[i + column] != 1)) {
                //Placing a queen
                board[i][column] = 1;
                //Update the 3 check arrays
                X1[i - column + board.length - 1] = diagonalRight[i + column] = rowCheck[i] = 1;

                //Place the rest of the queens using recursion
                if (populate(board, column + 1))
                    return true;

                //Rollback the solution since it didn't resolve in a filled board.
                board[i][column] = 0;
                //Update the 3 check arrays
                X1[i - column + board.length - 1] =
                        diagonalRight[i + column] = rowCheck[i] = 0;
            }
        }
        return false;
    }

    //Used to easily create a board with desired size (n)
    public static int[][] createBoard(int size) {
        return new int[size][size];
    }

    //Print the board (Prettified)
    public static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    System.out.printf(" X ");
                } else {
                    System.out.printf(" O ");
                }
            }
            System.out.println();
        }
    }
}
