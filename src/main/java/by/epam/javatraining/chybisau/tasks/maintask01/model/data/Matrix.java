package by.epam.javatraining.chybisau.tasks.maintask01.model.data;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 18/03/19.
 *
 * @version 0.0.3
 */

public class Matrix {

    static double[][] matrix;

    public Matrix(int boundMatrix, int matrixLength, int matrixWidth) {
        matrix = initializeMatrix(boundMatrix, matrixLength, matrixWidth);
    }

    //constructor for tests
    public Matrix(double[][] matrix) {
        this.matrix = matrix;
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

    public double getElement(int indexOfRow, int indexOfColumn) {
        return matrix[ indexOfRow ][ indexOfColumn ];
    }

    public void setElement(int indexOfRow, int indexOfColumn, double value) {
        matrix[ indexOfRow ][ indexOfColumn ] = value;
    }

    public int length() {
        return matrix.length;
    }

    public int width() {
        return matrix[ 0 ].length;
    }

    @Override
    public boolean equals(Object o) {
        return o.equals(matrix);
    }

    @Override
    public String toString() {
        return "Matrix : " + Arrays.deepToString(matrix);
    }
}

