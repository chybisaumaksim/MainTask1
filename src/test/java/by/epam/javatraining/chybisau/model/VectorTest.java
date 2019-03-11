package by.epam.javatraining.chybisau.model;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class VectorTest {

    @Test
    public void findMinValue() {
        double[] vector = {2, 10, 5, 8, 1};
        double expected = 1;
        if (expected != Vector.findMinValue(vector)) {
            Assert.fail();
        }
    }

    @Test
    public void findMaxValue() {
        double[] vector = {2, 10, 5, 8, 1};
        double expected = 10;
        if (expected != Vector.findMaxValue(vector)) {
            Assert.fail();
        }
    }

    @Test
    public void countArithmeticalMean() {
        double[] vector = {2, 10, 5, 7};
        double expected = 6;
        if (expected != Vector.countArithmeticalMean(vector)) {
            Assert.fail();
        }
    }

    @Test
    public void countGeometricalMean() {
        double[] vector = {2, 10};
        double expected = Math.pow(2 * 10, 0.5);
        if (expected != Vector.countGeometricalMean(vector)) {
            Assert.fail();
        }
    }

    @Test
    public void checkAscendingOrder() {
        double[] vector = {2, 5, 10};
        if (!Vector.checkAscendingOrder(vector)) {
            Assert.fail();
        }
    }

    @Test
    public void checkDescendingOrder() {
        double[] vector = {10, 6, 3, 1};
        if (!Vector.checkDescendingOrder(vector)) {
            Assert.fail();
        }
    }

    @Test
    public void findTheFirstLocalMinimumPosition() {
        double[] vector = {10, 6, 3, 1};
        double expected = -1;
        if (expected != Vector.findTheFirstLocalMinimumPosition(vector)) {
            Assert.fail();
        }
    }

    @Test
    public void findTheFirstLocalMaximumPosition() {
        double[] vector = {10, 6, 3, 1};
        double expected = 0;
        if (expected != Vector.findTheFirstLocalMaximumPosition(vector)) {
            Assert.fail();
        }
    }

    @Test
    public void linearSearch() {
        double[] vector = {10, 6, 3, 1, 18, 5, 9, 4};
        double number = 1;
        int expected = 3;
        if (expected != Vector.linearSearch(number, vector)) {
            Assert.fail();
        }
    }

    @Test
    public void binarySearchOne() {
        double[] vector = {1, 3, 5, 7, 9};
        double number = 5;
        int expected = 2;
        if (expected != Vector.binarySearch(number, vector)) {
            Assert.fail();
        }
    }

    @Test
    public void binarySearchTwo() {
        double[] vector = {9, 8, 7, 6, 5};
        double number = 5;
        int expected = 4;
        if (expected != Vector.binarySearch(number, vector)) {
            Assert.fail();
        }
    }

    @Test
    public void reverseVector() {
        double[] vector = {9, 8, 5, 33};
        double[] expected = {33, 5, 8, 9};
        if (!Arrays.equals(expected, Vector.reverseVector(vector))) {
            Assert.fail();
        }
    }

    @Test
    public void bubbleSortOfVector() {
        double[] vector = {9.0, 8.0, 5.0, 33.0, 21.0};
        double[] expected = {5.0, 8.0, 9.0, 21.0, 33.0};
        if (!Arrays.equals(expected, Vector.bubbleSortOfVector(vector))) {
            Assert.fail();
        }
    }

    @Test
    public void mergeSortOfVector() {
        double[] vector = {9, 8, 5, 33, 21};
        double[] expected = {5, 8, 9, 21, 33};
        if (!Arrays.equals(expected, Vector.bubbleSortOfVector(vector))) {
            Assert.fail();
        }
    }

}