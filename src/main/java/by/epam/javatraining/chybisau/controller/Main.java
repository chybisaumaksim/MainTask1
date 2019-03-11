package by.epam.javatraining.chybisau.controller;

import by.epam.javatraining.chybisau.model.Vector;
import by.epam.javatraining.chybisau.view.View;

/**
 * Created by Maksim Chybisau on 09/03/19.
 */
public class Main {
    public static void main(String[] args) {
        int numberOfElements = 20;
        int bound = 50;
        double number = 18.0;

        if (numberOfElements > 0 && bound > 0) {
            Vector vector = new Vector(numberOfElements, bound);
            View.printVector("Elements of vector : ", Vector.returnVector());
            View.print("Minimum vector value is " + Vector.findMinValue(Vector.returnVector()));
            View.print("Maximum vector value is " + Vector.findMaxValue(Vector.returnVector()));
            View.print("Arithmetical mean equals " + Vector.countArithmeticalMean(Vector.returnVector()));
            View.print("Geometrical mean equals " + Vector.countGeometricalMean(Vector.returnVector()));
            View.print("Vector elements are arranged in ascending order " + Vector.checkAscendingOrder(Vector.returnVector()));
            View.print("Vector elements are arranged in descending order " + Vector.checkDescendingOrder(Vector.returnVector()));
            View.print("The position of the first local minimum is " + Vector.findTheFirstLocalMinimumPosition(Vector.returnVector()));
            View.print("The position of the first local maximum is " + Vector.findTheFirstLocalMaximumPosition(Vector.returnVector()));
            View.print("Linear search. The position of the number is " + Vector.linearSearch(number, Vector.returnVector()));
            View.print("Binary search. The position of the number is " + Vector.binarySearch(number, Vector.returnVector()));
            View.printVector("Reversed vector is : ", Vector.reverseVector(Vector.returnVector()));
            View.printVector("Bubble sort of vector is : ", Vector.bubbleSortOfVector(Vector.returnVector()));
            View.printVector("Bubble sort of vector is : ", Vector.mergeSortOfVector(Vector.returnVector()));
        } else {
            View.print("Error. Incorrect input data.");
        }
    }
}


