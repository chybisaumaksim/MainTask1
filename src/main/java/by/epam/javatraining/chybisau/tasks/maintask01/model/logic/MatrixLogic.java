package by.epam.javatraining.chybisau.tasks.maintask01.model.logic;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Matrix;

/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 18/03/19.
 *
 * @version 0.0.3
 */
class MatrixLogic {

    static double findMinValue(Matrix matrix) {
        double min = matrix.getElement(0, 0);
        for (int i = 0; i < matrix.length(); i++) {
            for (int j = 0; j < matrix.width(); j++) {
                if (matrix.getElement(i, j) < min) {
                    min = matrix.getElement(i, j);
                }
            }
        }
        return min;
    }

    static double findMaxValue(Matrix matrix) {
        double max = matrix.getElement(0, 0);
        for (int i = 0; i < matrix.length(); i++) {
            for (int j = 0; j < matrix.width(); j++) {
                if (matrix.getElement(i, j) > max) {
                    max = matrix.getElement(i, j);
                }
            }
        }
        return max;
    }

    static double findTheFirstLocalMinimumPosition(Matrix matrix) {
        double min = -1;
        if (matrix.length() == 1 && matrix.width() == 1) {
            min = matrix.getElement(0, 0);
        } else {
            for (int i = 1; i < matrix.length() - 1; i++) {
                for (int j = 1; j < matrix.width() - 1; j++) {
                    if (matrix.getElement(i, j) < matrix.getElement(i, j + 1) && matrix.getElement(i, j) < matrix.getElement(i + 1, j)) {
                        min = matrix.getElement(i, j);
                        break;
                    } else if (matrix.getElement(i, j) < matrix.getElement(i, j) && matrix.getElement(i, j) < matrix.getElement(i, j - 1) && matrix.getElement(i, j) < matrix.getElement(i + 1, j)) {
                        min = matrix.getElement(i, j);
                        break;
                    }
                }
            }
        }
        return min;
    }

    static double findTheFirstLocalMaximumPosition(Matrix matrix) {
        double min = -1;
        if (matrix.length() == 1 && matrix.width() == 1) {
            min = matrix.getElement(0, 0);
        } else {
            for (int i = 1; i < matrix.length(); i++) {
                for (int j = 1; j < matrix.width(); j++) {
                    if (matrix.getElement(i, j) > matrix.getElement(i - 1, j) && matrix.getElement(i, j) > matrix.getElement(i, j) && matrix.getElement(i, j) > matrix.getElement(i, j - 1) && matrix.getElement(i, j) > matrix.getElement(i, j + 1)) {
                        min = matrix.getElement(i - 1, j - 1);
                        break;
                    }
                }
            }
        }
        return min;
    }

    static boolean isSymmetrical(Matrix matrix) {
        boolean isSymmetrical = true;
        if (matrix.length() != matrix.width()) {
            isSymmetrical = false;
        } else {
            for (int i = 0; i < matrix.length(); i++) {
                for (int j = 0; j < matrix.width(); j++) {
                    if (matrix.getElement(i, j) != matrix.getElement(j, i)) {
                        isSymmetrical = false;
                        break;
                    }
                }
            }
        }
        return isSymmetrical;
    }

    static Matrix transposeMatrix(Matrix matrix) throws Exception {
        for (int i = 0; i < matrix.length(); i++) {
            for (int j = i + 1; j < matrix.width(); j++) {
                if (matrix.length() != matrix.width()) {
                    throw new Exception("Matrix is not square");
                }
                double temp = matrix.getElement(i, j);
                matrix.setElement(i, j, matrix.getElement(j, i));
                matrix.setElement(j, i, temp);
            }
        }
        return matrix;
    }
}
