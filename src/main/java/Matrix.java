import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Dorkó Arnold
 */
public class Matrix {

    /**
     * Counts the non-zero values in the matrix
     * @param matrix 2D integer array
     * @return sum of non-zero values
     */
    public static int numberOfNonZeroValues(int[][] matrix) {
        int sum = 0;
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (ints[j] != 0)
                    sum++;
            }
        }
        return sum;
    }

    /**
     *
     * @param matrix 2D integer array
     * @return ArrayList of columns with same values
     */
    public static ArrayList<Integer> indexOfColumnsWithSameValues(int[][] matrix) {
        ArrayList<Integer> a = new ArrayList<>();

        ArrayList<Integer> helper = new ArrayList<>();

        for(int cols = 0; cols < matrix[0].length; cols++){
            for (int[] ints : matrix) {
                helper.add(ints[cols]);
            }
            if(isSame(helper)) a.add(cols);
            helper.clear();
        }
        return a;
    }

    private static boolean isSame(ArrayList<Integer> arr){

        int condition = arr.get(0);

        for (int i : arr) {
            if(i != condition)
                return false;
        }

        return true;
    }

}
