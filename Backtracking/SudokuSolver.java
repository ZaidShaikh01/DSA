public class SudokuSolver {

    public static void solveSudoku(char[][] board) {
        backtrackHelper(board,0,0);

    }

    public static boolean isValid(char [][] board, int row,int col, char element){

        // First I have to check weather the element that I'm going to store is in the row or not
        for (int i=0; i<9;i++){
            //System.out.println("In row check");
            if (element == board[row][i]){
                return false;
            }
        }
        // To check weather the element exists in the same column
        for (int i=0; i<9;i++){
            //System.out.println("In col check");
            if (element == board[i][col]){
                return false;
            }
        }
        // Now to check in the same grid
        // We have to use formula
        // to find the row --> 3*(row / 3) + X / 3
        // to find the col --> 3*(col / 3) + X % 3

        // Creating one row and one column temporary variable
        int tempRow=0;
        int tempCol=0;

        for (int i=0;i<9;i++){
            //System.out.println("In grid check");
            tempRow = 3 * (row / 3) + i / 3;
            tempCol = 3 * (col / 3) + i % 3;
            //System.out.println(tempCol +" "+tempRow);
            if(board[tempRow][tempCol] == element){
                return false;
            }
        }
        return true;
    }

    public static boolean backtrackHelper(char [][] board, int row,int col){
        // First of all I need to check weather the position is empty or full...
        // If it is full then I need to move to the next element

        if (row==9) return true;
        // But, what if the col is 9.. Then we have to do row ++
        if (col == 9) return backtrackHelper(board,row+1,0);

        // If we reach the final element we have to return True to indicate that Sudoku has been solved


        // Checking if the place is empty or not
        if (board[row][col] != '.'){
            return backtrackHelper(board,row,col+1);
        }

        // Now I have to iterate through choices
        for(char i='1';i<='9';i++){

            if (isValid(board,row,col,i)){
                // Making the choice
                board[row][col]=i;
                // Recursing
                if (backtrackHelper(board,row,col+1)) return true;
                // BackTracking the thing
                board[row][col]='.';

            }
        }

        // If there exists no solution for Sudoku solver
        return false;

    }
    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char[][] board = {
                {'2', '6', '.', '.', '7', '.', '.', '.', '.'},
                {'.', '.', '9', '6', '.', '2', '.', '1', '.'},
                {'4', '.', '.', '3', '.', '.', '.', '.', '.'},
                {'.', '.', '3', '.', '.', '.', '.', '.', '8'},
                {'8', '.', '7', '9', '.', '4', '5', '.', '2'},
                {'9', '.', '.', '.', '.', '.', '7', '.', '.'},
                {'.', '.', '.', '.', '.', '7', '.', '.', '5'},
                {'.', '4', '.', '2', '.', '6', '1', '.', '.'},
                {'.', '.', '.', '.', '3', '.', '.', '8', '6'}
        };
        solveSudoku(board);
        printBoard(board);


    }
}
