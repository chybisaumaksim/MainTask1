package by.epam.javatraining.chybisau.tasks.maintask01.model.logic;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Matrix;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 18/03/19.
 *
 * @version 0.0.3
 */
public class MatrixTest {

    @Test
    public void findMinValue() {
        double[][] testMatrix = {{5, 4}, {8, 1}};
        double expected = 1;
        assertEquals(expected, MatrixLogic.findMinValue(new Matrix(testMatrix)), 0.001);
    }

    @Test
    public void findMaxValue() {
        double[][] testMatrix = {{10, 4}, {12, 1}};
        double expected = 12;
        assertEquals(expected, MatrixLogic.findMaxValue(new Matrix(testMatrix)), 0.001);
    }

    @Test
    public void findTheFirstLocalMinimumPosition() {
        double[][] testMatrix = {{5, 4}, {8, 1}};
        double expected = -1;
        assertEquals(expected, MatrixLogic.findTheFirstLocalMinimumPosition(new Matrix(testMatrix)), 0.001);
    }

    @Test
    public void findTheFirstLocalMaximumPosition() {
        double[][] testMatrix = {{5, 4}, {8, 1}};
        double expected = -1;
        assertEquals(expected, MatrixLogic.findTheFirstLocalMaximumPosition(new Matrix(testMatrix)), 0.001);
    }

    @Test
    public void isSymmetrical() {
        double[][] testMatrix = {{0, 0, 1}, {0, 1, 0}, {1, 0, 0}};
        assertTrue(MatrixLogic.isSymmetrical(new Matrix(testMatrix)));
    }

    @Test
    public void isSymmetricalTwo() {
        double[][] testMatrix = {{4, 1, 0}, {3, 2, 3}, {1, 1, 5}};
        assertFalse(MatrixLogic.isSymmetrical(new Matrix(testMatrix)));
    }


    @Test
    public void transposeMatrix() throws Exception {
        double[][] testMatrix = {{5, 4}, {8, 1}};
        double[][] expected = {{5, 8}, {4, 1}};
        assertEquals(new Matrix(expected), MatrixLogic.transposeMatrix(new Matrix(testMatrix)));
    }
}
