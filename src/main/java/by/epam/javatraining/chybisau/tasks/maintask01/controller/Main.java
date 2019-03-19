package by.epam.javatraining.chybisau.tasks.maintask01.controller;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Matrix;
import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Vector;
import by.epam.javatraining.chybisau.tasks.maintask01.view.View;

/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 18/03/19.
 *
 * @version 0.0.3
 */

public class Main {

    public static void main(String[] args) {
        int numberOfElements = 20;
        int boundOfValues = 50;

        int boundMatrix = 30;
        int numberOfRows = 4;
        int numberOfColumns = 4;

        Vector vector = new Vector(numberOfElements, boundOfValues);
        View.print(vector);
//      View.print(VectorLogic.findMaxValue(vector));
        Matrix matrix = new Matrix(boundMatrix, numberOfRows, numberOfColumns);
        View.print(matrix);
    }
}


