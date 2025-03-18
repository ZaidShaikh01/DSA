import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;

public class NQueen {


    public static List<List<String>> solveNQueens(int n) {
        // Creating the resList
        List<List<String>> resList= new ArrayList<>();

        // Creating a board

        List<String> board=initBoard(n);


        // Calling the function
        // giving n cuz I'm using 0 based indexing
        nQueenSolver(resList,board,n,0);

        // Returning the solutions
        return resList;
    }

    public static List<String> initBoard(int n){

        // Creating an list of strings
        List<String> board= new ArrayList<>();
        // Creating an empty String 'cuz this will be needed for row
        String emptyRow=".".repeat(n); // Will give something like "...." if n=4

        //System.out.println(emptyRow);

        // Adding the emptyRow in the list now
        for (int i=0;i<n;i++){
            // Will give me the board
            board.add(emptyRow);
            // ["....", "...." , "...." , "...." ]
        }
//        for (String row : board) {
//            System.out.println(row);
//        }



        return board;
    }
//    public static boolean isValid(List<String> board,int row,int col){
//
//        // First not in the same row & same column and same diagonal
//
//
//
//        for(int i=0;i<board.size();i++){
//            // First checking the rows...
//            if (board.get(row).charAt(i) == 'Q' ){
//                // Will skip the current row
//
//                return false;
//            }
//            // Then checking for the columns
//            if (board.get(i).charAt(col) == 'Q' ){
//                // Will skip the current col
//
//                return false;
//            }
//
//
//        }
//        // last is for diagonals // Look
//        for (int r = 0; r < board.size(); r++) {
//            for (int c = 0; c < board.size(); c++) {
//                if (board.get(r).charAt(c) == 'Q') {
//                    if (r == row || c == col || Math.abs(r - row) == Math.abs(c - col) || r + c == row + col) {
//                        return false; // Invalid position
//                    }
//                }
//            }
//        }
//
//        return true;
//    }
public static boolean isValid(List<String> board, int row, int col) {
    // Check column (only previous rows)
    for (int i = 0; i < row; i++) {
        if (board.get(i).charAt(col) == 'Q') {
            return false;
        }
    }

    // Check top-left diagonal (↖)
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
        if (board.get(i).charAt(j) == 'Q') {
            return false;
        }
    }

    // Check top-right diagonal (↗)
    for (int i = row - 1, j = col + 1; i >= 0 && j < board.size(); i--, j++) {
        if (board.get(i).charAt(j) == 'Q') {
            return false;
        }
    }

    return true; // Position is valid
}



    public static void nQueenSolver(List<List<String>> resList,List<String> board, int boardSize,int row){
        // As I have solved the Sudoku problem I'm sure that I'll need a isValid function


        // Base condition
        if (row == boardSize){
            // If the board is valid then the solution will be stored
            resList.add(new ArrayList<>(board));
            return;

        }


        // going through choices
        for (int col=0;col<boardSize;col++){
            if (isValid(board,row,col)){
                // Making the choice
                char[] rowArray = board.get(row).toCharArray();
                rowArray[col] = 'Q'; // Placing a queen
                board.set(row, new String(rowArray));

                // Backtracing
                nQueenSolver(resList, board, boardSize, row + 1);

                // Now reverthing the equation

                rowArray[col] = '.'; // Placing a dot
                board.set(row, new String(rowArray));

            }
        }


    }

    public static void main(String[] args) {
        List<List<String>> solutions = solveNQueens(4);

        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();

        }
    }
}
