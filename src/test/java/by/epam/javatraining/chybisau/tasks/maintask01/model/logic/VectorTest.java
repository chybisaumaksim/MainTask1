package by.epam.javatraining.chybisau.tasks.maintask01.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class VectorTest {

    @Test
    public void findMinValue() {
        double[] vector = {2, 10, 5, 8, 1};
        double expected = 1;
        assertEquals(expected, Vector.findMinValue(vector), 0.0001);
    }

    @Test
    public void findMaxValue() {
        double[] vector = {2, 10, 5, 8, 1};
        double expected = 10;
        assertEquals(expected, Vector.findMaxValue(vector), 0.0001);
    }

    @Test
    public void countArithmeticalMean() {
        double[] vector = {2, 10, 5, 7};
        double expected = 6;
        assertEquals(expected, Vector.countArithmeticalMean(vector), 0.0001);
    }

    @Test
    public void countGeometricalMean() {
        double[] vector = {2, 10};
        double expected = Math.pow(2 * 10, 0.5);
        assertEquals(expected, Vector.countGeometricalMean(vector), 0.0001);
    }

    @Test
    public void checkAscendingOrder() {
        double[] vector = {2, 5, 10};
        assertTrue(Vector.checkAscendingOrder(vector));
    }

    @Test
    public void checkDescendingOrder() {
        double[] vector = {10, 6, 3, 1};
        assertTrue(Vector.checkDescendingOrder(vector));
    }

    @Test
    public void findTheFirstLocalMinimumPosition() {
        double[] vector = {10, 6, 3, 1};
        double expected = -1;
        assertEquals(expected, Vector.findTheFirstLocalMinimumPosition(vector), 0.0001);
    }

    @Test
    public void findTheFirstLocalMaximumPosition() {
        double[] vector = {10, 6, 3, 1};
        double expected = 0;
        assertEquals(expected, Vector.findTheFirstLocalMaximumPosition(vector), 0.0001);
    }

    @Test
    public void linearSearch() {
        double[] vector = {10, 6, 3, 1, 18, 5, 9, 4};
        double number = 1;
        int expected = 3;
        assertEquals(expected, Vector.linearSearch(number, vector));
    }

    @Test
    public void binarySearchOne() {
        double[] vector = {1, 3, 5, 7, 9};
        double number = 5;
        int expected = 2;
        assertEquals(expected, Vector.binarySearch(number, vector));
    }

    @Test
    public void binarySearchTwo() {
        double[] vector = {9, 8, 7, 6, 5};
        double number = 5;
        int expected = 4;
        assertEquals(expected, Vector.binarySearch(number, vector));
    }

    @Test
    public void reverseVector() {
        double[] vector = {9, 8, 5, 33};
        double[] expected = {33, 5, 8, 9};
        assertArrayEquals(expected, Vector.reverseVector(vector), 0.0001);
    }

    @Test
    public void bubbleSortOfVector() {
        double[] vector = {9.0, 8.0, 5.0, 33.0, 21.0};
        double[] expected = {5.0, 8.0, 9.0, 21.0, 33.0};
        assertArrayEquals(expected, Vector.bubbleSortOfVector(vector), 0.0001);
    }

    @Test
    public void mergeSortOfVector() {
        double[] vector = {9, 8, 5, 33, 21};
        double[] expected = {5, 8, 9, 21, 33};
        assertArrayEquals(expected, Vector.bubbleSortOfVector(vector), 0.0001);
    }
}