package by.epam.javatraining.chybisau.tasks.maintask01.controller;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.MatrixCreator;
import by.epam.javatraining.chybisau.tasks.maintask01.model.data.VectorCreator;
import by.epam.javatraining.chybisau.tasks.maintask01.model.logic.Matrix;
import by.epam.javatraining.chybisau.tasks.maintask01.model.logic.Vector;
import by.epam.javatraining.chybisau.tasks.maintask01.view.View;

/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 17/03/19.
 *
 * @version 0.0.2
 */

public class Main {

    public static void main(String[] args) {
        int numberOfElements = 20;
        int bound = 50;
        double number = 18.0;

        if (numberOfElements > 0 && bound > 0) {

            VectorCreator vectorCreator = new VectorCreator(numberOfElements, bound);

            View.print("Elements of vectorCreator : ",
                    VectorCreator.returnVector());
            View.print("Minimum vectorCreator value is "
                    + Vector.findMinValue(VectorCreator.returnVector()));
            View.print("Maximum vectorCreator value is "
                    + Vector.findMaxValue(VectorCreator.returnVector()));
            View.print("Arithmetical mean of vectorCreator equals "
                    + Vector.countArithmeticalMean(VectorCreator.returnVector()));
            View.print("Geometrical mean mean of vectorCreator equals "
                    + Vector.countGeometricalMean(VectorCreator.returnVector()));
            View.print("VectorCreator elements are arranged in ascending order "
                    + Vector.checkAscendingOrder(VectorCreator.returnVector()));
            View.print("VectorCreator elements are arranged in descending order "
                    + Vector.checkDescendingOrder(VectorCreator.returnVector()));
            View.print("The position of the first local minimum mean of vectorCreator is "
                    + Vector.findTheFirstLocalMinimumPosition(VectorCreator.returnVector()));
            View.print("The position of the first local maximum mean of vectorCreator is "
                    + Vector.findTheFirstLocalMaximumPosition(VectorCreator.returnVector()));
            View.print("Linear search. The position of the number in the vectorCreator is "
                    + Vector.linearSearch(number, VectorCreator.returnVector()));
            View.print("Binary search. The position of the number in the vectorCreator is "
                    + Vector.binarySearch(number, VectorCreator.returnVector()));
            View.print("Reversed vectorCreator is : ",
                    Vector.reverseVector(VectorCreator.returnVector()));
            View.print("Bubble sort of vectorCreator is : ",
                    Vector.bubbleSortOfVector(VectorCreator.returnVector()));
            View.print("Bubble sort of vectorCreator is : ",
                    Vector.mergeSortOfVector(VectorCreator.returnVector()));
        } else {
            View.print("Error. Incorrect input data in vector");
        }

        int boundMatrix = 30;
        int numberOfRows = 4;
        int numberOfColumns = 4;

        if (boundMatrix > 0 && numberOfRows > 0 && numberOfColumns > 0) {

            MatrixCreator matrixCreator = new MatrixCreator(boundMatrix, numberOfRows, numberOfColumns);

            View.print("Elements of matrix : ", MatrixCreator.returnMatrix());
            View.print("Minimum matrix value is "
                    + Matrix.findMinValue(MatrixCreator.returnMatrix()));
            View.print("Maximum matrix value is "
                    + Matrix.findMaxValue(MatrixCreator.returnMatrix()));
            View.print("MatrixCreator is symmetrical : "
                    + Matrix.isSymmetrical(MatrixCreator.returnMatrix()));
            View.print("Transposed matrix is : ", Matrix.transposeMatrix(MatrixCreator.returnMatrix()));
            View.print("The position of the first local minimum of matrix is  : "
                    + Matrix.findTheFirstLocalMinimumPosition(MatrixCreator.returnMatrix()));
            View.print("The position of the first local maximum of matrix is  : "
                    + Matrix.findTheFirstLocalMaximumPosition(MatrixCreator.returnMatrix()));
        } else {
            View.print("Error. Incorrect input data in matrix");
        }
    }
}


