package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.findminmaxvalue;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Matrix;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */
public class MatrixMinMaxValueTest {

    @Test
    public void findMinValue() {
        double[][] testMatrix = {{5, 4}, {8, 1}};
        double expected = 1;
        assertEquals(expected, MatrixMinMaxValue.findMinValue(new Matrix(testMatrix)), 0.001);
    }

    @Test
    public void findMaxValue() {
        double[][] testMatrix = {{10, 4}, {12, 1}};
        double expected = 12;
        assertEquals(expected, MatrixMinMaxValue.findMaxValue(new Matrix(testMatrix)), 0.001);
    }

}