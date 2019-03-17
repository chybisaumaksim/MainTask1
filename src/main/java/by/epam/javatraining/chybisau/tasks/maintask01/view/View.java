package by.epam.javatraining.chybisau.tasks.maintask01.view;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.MatrixCreator;
import by.epam.javatraining.chybisau.tasks.maintask01.model.data.VectorCreator;

import java.util.Arrays;
import java.util.Vector;

/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 17/03/19.
 *
 * @version 0.0.2
 */

public class View {

    public static void print(String message, String array) {
        System.out.println(message + array);
    }

    public static void print(String message) {
        System.out.println(message);
    }

    public static void print(String message, double[][]matrix) {
        System.out.println(message + MatrixCreator.toString(matrix));
    }

    public static void print(String message, double[]vector) {
        System.out.println(message + VectorCreator.toString(vector));
    }
}
