package by.epam.javatraining.chybisau.tasks.maintask01.model.data;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 17/03/19.
 *
 * @version 0.0.2
 */

public class MatrixCreator {

    private static double[][] matrix;

    public MatrixCreator(int boundMatrix, int matrixLength, int matrixWidth) {
        matrix = initializeMatrix(boundMatrix, matrixLength, matrixWidth);
    }

    private double[][] initializeMatrix(int boundMatrix, int matrixLength, int matrixWidth) {
        Random random = new Random();
        matrix = new double[ matrixLength ][ matrixWidth ];
        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < matrixWidth; j++) {
                matrix[ i ][ j ] = random.nextInt(boundMatrix) + 1;
            }
        }
        return matrix;
    }

    public static double[][] returnMatrix() {
        return matrix;
    }

    public static String toString(double[][] matrix) {
        return Arrays.deepToString(matrix);
    }
}
