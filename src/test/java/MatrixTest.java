import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class MatrixTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MATRIX_LENGTH = 5;


    @Test
    public void testNumberOfNonZeroValues() {
        int[][] matrix = {
                {  0,  67,  22,   0,  95},
                { 72,   0,   0, -88,   0},
                {  0, -79,   0,   0, -97},
                {  0,   0, -13, -19,   0},
                {  0,  89,  95,   0,   0}
        };

        assertEquals(11, Matrix.numberOfNonZeroValues(matrix));
    }

    @Test
    public void testIndexOfColumnsWithSameValues() {
        int[][] matrix = {
                { 84,  79,  22, -33,  95},
                { 72,  79,  22, -33,  30},
                { 95,  79,  22, -33, -97},
                {-52,  79,  22, -33, -27},
                { 79,  79,  22, -3, -53}
        };

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);

        ArrayList<Integer> actual = Matrix.indexOfColumnsWithSameValues(matrix);

        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }

}