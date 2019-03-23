package by.epam.javatraining.chybisau.tasks.maintask01.controller;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Matrix;
import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Vector;
import by.epam.javatraining.chybisau.tasks.maintask01.model.logic.findminmaxvalue.MatrixMinMaxValue;
import by.epam.javatraining.chybisau.tasks.maintask01.model.logic.findminmaxvalue.VectorMinMaxValue;
import by.epam.javatraining.chybisau.tasks.maintask01.view.ConsoleView;
import by.epam.javatraining.chybisau.tasks.maintask01.view.View;

/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */

public class Main {

    public static void main(String[] args) {
        int numberOfElements = 20;
        int boundOfValues = 50;

        int numberOfElements2 = 15;
        int boundOfValues2 = 25;

        int boundMatrix = 30;
        int numberOfRows = 4;
        int numberOfColumns = 4;
        View view = new ConsoleView();

        Vector vector = new Vector(numberOfElements, boundOfValues);
        Vector vector2 = new Vector(numberOfElements2, boundOfValues2);

        view.print(vector);
        view.print(vector2);
        view.print(VectorMinMaxValue.findMaxValue(vector2));
        VectorMinMaxValue.findMaxValue(vector2);

        Matrix matrix = new Matrix(boundMatrix, numberOfRows, numberOfColumns);
        view.print(MatrixMinMaxValue.findMaxValue(matrix));
        view.print(matrix);
    }
}


