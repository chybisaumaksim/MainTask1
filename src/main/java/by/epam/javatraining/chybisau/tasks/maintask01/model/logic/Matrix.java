package by.epam.javatraining.chybisau.tasks.maintask01.model.logic;

/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 17/03/19.
 *
 * @version 0.0.2
 */
public class Matrix {

    public static double findMinValue(double[][] matrix) {
        double min = matrix[ 0 ][ 0 ];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[ 0 ].length; j++) {
                if (matrix[ i ][ j ] < min) {
                    min = matrix[ i ][ j ];
                }
            }
        }
        return min;
    }

    public static double findMaxValue(double[][] matrix) {
        double max = matrix[ 0 ][ 0 ];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[ 0 ].length; j++) {
                if (matrix[ i ][ j ] > max) {
                    max = matrix[ i ][ j ];
                }
            }
        }
        return max;
    }

    public static double findTheFirstLocalMinimumPosition(double[][] matrix) {
        double min = -1;
        if (matrix.length == 1 && matrix[ 0 ].length == 1) {
            min = matrix[ 0 ][ 0 ];
        } else {
            for (int i = 1; i < matrix.length - 1; i++) {
                for (int j = 1; j < matrix[ 0 ].length - 1; j++) {
                    if (matrix[ i ][ j ] < matrix[ i ][ j + 1 ] && matrix[ i ][ j ] < matrix[ i + 1 ][ j ]) {
                        min = matrix[ i ][ j ];
                        break;
                    } else if (matrix[ i ][ j ] < matrix[ i ][ j ] && matrix[ i ][ j ] < matrix[ i ][ j - 1 ] && matrix[ i ][ j ] < matrix[ i + 1 ][ j ])
                        min = matrix[ i ][ j ];
                    break;
                }
            }
        }
        return min;
    }

    public static double findTheFirstLocalMaximumPosition(double[][] matrix) {
        double min = -1;
        if (matrix.length == 1 && matrix[ 0 ].length == 1) {
            min = matrix[ 0 ][ 0 ];
        } else {
            for (int i = 1; i < matrix.length; i++) {
                for (int j = 1; j < matrix[ 0 ].length; j++) {
                    if (matrix[ i ][ j ] > matrix[ i - 1 ][ j ] && matrix[ i ][ j ] > matrix[ i ][ j ] && matrix[ i ][ j ] > matrix[ i ][ j - 1 ] && matrix[ i ][ j ] > matrix[ i ][ j + 1 ]) {
                        min = matrix[ i - 1 ][ j - 1 ];
                        break;
                    }
                }
            }
        }
        return min;
    }

    public static boolean isSymmetrical(double[][] matrix) {
        boolean isSymmetrical = true;
        if (matrix.length != matrix[ 0 ].length) {
            isSymmetrical = false;
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[ 0 ].length; j++) {
                    if (matrix[ i ][ j ] != matrix[ j ][ i ]) {
                        isSymmetrical = false;
                        break;
                    }
                }
            }
        }
        return isSymmetrical;
    }

    public static double[][] transposeMatrix(double[][] matrix) {
        double[][] transposedMatrix = new double[ matrix.length ][ matrix[ 0 ].length ];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[ 0 ].length; j++)
                transposedMatrix[ j ][ i ] = matrix[ i ][ j ];
        return transposedMatrix;
    }
}
