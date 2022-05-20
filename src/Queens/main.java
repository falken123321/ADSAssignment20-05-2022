package Queens;

import Queens.nQueensBacktracking;

public class main {
    public static void main(String[] args) {

        //Creating the board and initialized the recursive function (Populate)
        int[][] board = nQueensBacktracking.createBoard(5);
        nQueensBacktracking.populate(board, 0);
        //Prettified print
        nQueensBacktracking.printBoard(board);


        /*OUTPUT for a board with a size of 4x4:
                    O  O  X  O
                    X  O  O  O
                    O  O  O  X
                    O  X  O  O
        */

    }
}
