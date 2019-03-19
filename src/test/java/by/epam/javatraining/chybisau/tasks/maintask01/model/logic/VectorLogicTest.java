package by.epam.javatraining.chybisau.tasks.maintask01.model.logic;
import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Vector;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 18/03/19.
 *
 * @version 0.0.3
 */

public class VectorLogicTest {

    @Test
    public void findMinValue() {
        double[] testVector = {2, 10, 5, 8, 1};
        double expected = 1;
        assertEquals(expected, VectorLogic.findMinValue(new Vector(testVector)), 0.0001);
    }

    @Test
    public void findMaxValue() {
        double[] testVector = {2, 10, 5, 8, 1};
        double expected = 10;
        assertEquals(expected, VectorLogic.findMaxValue(new Vector(testVector)), 0.0001);
    }

    @Test
    public void countArithmeticalMean() {
        double[] testVector = {2, 10, 5, 7};
        double expected = 6;
        assertEquals(expected, VectorLogic.countArithmeticalMean(new Vector(testVector)), 0.0001);
    }

    @Test
    public void countGeometricalMean() {
        double[] testVector = {2, 10};
        double expected = Math.pow(2 * 10, 0.5);
        assertEquals(expected, VectorLogic.countGeometricalMean(new Vector(testVector)), 0.0001);
    }

    @Test
    public void checkAscendingOrder() {
        double[] testVector = {2, 5, 10};
        assertTrue(VectorLogic.checkAscendingOrder(new Vector(testVector)));
    }

    @Test
    public void checkDescendingOrder() {
        double[] testVector = {10, 6, 3, 1};
        assertTrue(VectorLogic.checkDescendingOrder(new Vector(testVector)));
    }

    @Test
    public void findTheFirstLocalMinimumPosition() {
        double[] testVector = {10, 6, 3, 1};
        double expected = -1;
        assertEquals(expected, VectorLogic.findTheFirstLocalMinimumPosition(new Vector(testVector)), 0.0001);
    }

    @Test
    public void findTheFirstLocalMaximumPosition() {
        double[] testVector = {10, 6, 3, 1};
        double expected = 0;
        assertEquals(expected, VectorLogic.findTheFirstLocalMaximumPosition(new Vector(testVector)), 0.0001);
    }

    @Test
    public void linearSearch() {
        double[] testVector = {10, 6, 3, 1, 18, 5, 9, 4};
        double number = 1;
        int expected = 3;
        assertEquals(expected, VectorLogic.linearSearch(number, new Vector(testVector)));
    }

    @Test
    public void binarySearchOne() {
        double[] testVector = {1, 3, 5, 7, 9};
        double number = 5;
        int expected = 2;
        assertEquals(expected, VectorLogic.binarySearch(number, new Vector(testVector)));
    }

    @Test
    public void binarySearchTwo() {
        double[] testVector = {9, 8, 7, 6, 5};
        double number = 5;
        int expected = 4;
        assertEquals(expected, VectorLogic.binarySearch(number, new Vector(testVector)));
    }

    @Test
    public void reverseVector() {
        double[] testVector = {9, 8, 5, 33};
        double[] expected = {33, 5, 8, 9};
       assertEquals(new Vector(expected), VectorLogic.reverseVector(new Vector(testVector)));
    }


    @Test
    public void bubbleSortOfVector() {
        double[] testVector = {9.0, 8.0, 5.0, 33.0, 21.0};
        double[] expected = {5.0, 8.0, 9.0, 21.0, 33.0};
        assertEquals(new Vector(expected), VectorLogic.bubbleSortOfVector(new Vector(testVector)));
        if(!new Vector(expected).equals(VectorLogic.bubbleSortOfVector(new Vector(testVector)))){
            Assert.fail();
        }
    }

    @Test
    public void mergeSortOfVector() {
        double[] testVector = {9, 8, 5, 33, 21};
        double[] expected = {5, 8, 9, 21, 33};
        assertEquals(new Vector(expected), VectorLogic.mergeSortOfVector(new Vector(testVector)));
    }
}