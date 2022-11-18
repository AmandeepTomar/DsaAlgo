package recursion;

/***
 * Count all possible paths from top left to bottom right of a mXn matrix
 * The problem is to count all the possible paths from top left to bottom right of a mXn matrix with the constraints that from each cell you can either move only to right or down
 * Examples :
 *
 * Input :  m = 2, n = 2;
 * Output : 2
 * There are two paths
 * (0, 0) -> (0, 1) -> (1, 1)
 * (0, 0) -> (1, 0) -> (1, 1)
 *
 * Input :  m = 2, n = 3;
 * Output : 3
 * There are three paths
 * (0, 0) -> (0, 1) -> (0, 2) -> (1, 2)
 * (0, 0) -> (0, 1) -> (1, 1) -> (1, 2)
 * (0, 0) -> (1, 0) -> (1, 1) -> (1, 2)
 *
 *@url https://www.geeksforgeeks.org/count-possible-paths-top-left-bottom-right-nxm-matrix/
 * */
public class CountAllPossiblePathsFromTopLeftRightBottom {
    public static int Row = 3;
    public static int Col = 3;

    public static void main(String[] args) {
        int row = 3;
        int column = 3;
        System.out.println(solutionFromUpperLeft(row - 1, column - 1));
        System.out.println(solutionFromDownRight(0, 0));

    }


    /**
     * Best one when we don't need to have the global variable like COL and Row we have in our code.
     */
    private static int solutionFromUpperLeft(int r, int c) {
        if (r == 0 || c == 0) {
            return 1;
        }
        return solutionFromUpperLeft(r - 1, c) + solutionFromUpperLeft(r, c - 1);
    }

    private static int solutionFromDownRight(int r, int c) {
        if (r == CountAllPossiblePathsFromTopLeftRightBottom.Row - 1 || c == Col - 1) {
            return 1;
        }
        return solutionFromDownRight(r + 1, c) + solutionFromDownRight(r, c + 1);
    }

}


