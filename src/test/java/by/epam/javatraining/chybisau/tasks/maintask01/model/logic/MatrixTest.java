package by.epam.javatraining.chybisau.tasks.maintask01.model.logic;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.MatrixCreator;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void findMinValue() {
        double[][] testMatrix = {{5, 4}, {8, 1}};
        double expected = 1;
        assertEquals(expected, Matrix.findMinValue(testMatrix), 0.001);
    }

    @Test
    public void findMaxValue() {
        double[][] testMatrix = {{10, 4}, {12, 1}};
        double expected = 12;
        assertEquals(expected, Matrix.findMaxValue(testMatrix), 0.001);
    }

    @Test
    public void findTheFirstLocalMinimumPosition() {
        double[][] testMatrix = {{5, 4}, {8, 1}};
        double expected = -1;
        assertEquals(expected, Matrix.findTheFirstLocalMinimumPosition(testMatrix), 0.001);
    }

    @Test
    public void findTheFirstLocalMaximumPosition() {
        double[][] testMatrix = {{5, 4}, {8, 1}};
        double expected = -1;
        assertEquals(expected, Matrix.findTheFirstLocalMaximumPosition(testMatrix), 0.001);
    }

    @Test
    public void isSymmetrical() {
        double[][] testMatrix = {{0, 0, 1}, {0, 1, 0}, {1, 0, 0}};
        assertTrue(Matrix.isSymmetrical(testMatrix));
    }

    @Test
    public void isSymmetricalTwo() {
        double[][] testMatrix = {{4, 1, 0}, {3, 2, 3}, {1, 1, 5}};
        assertFalse(Matrix.isSymmetrical(testMatrix));
    }

    @Test
    public void transposeMatrix() {
        double[][] testMatrix = {{5, 4}, {8, 1}};
        double[][] expected = {{5, 8}, {4, 1}};
        if (!Arrays.deepEquals(expected, Matrix.transposeMatrix(testMatrix))) {
            Assert.fail();
        }
    }
}