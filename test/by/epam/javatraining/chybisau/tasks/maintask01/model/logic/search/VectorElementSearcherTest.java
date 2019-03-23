package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.search;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Vector;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */
public class VectorElementSearcherTest {

    @Test
    public void linearSearch() {
        double[] testVector = {10, 6, 3, 1, 18, 5, 9, 4};
        double number = 1;
        int expected = 3;
        assertEquals(expected, VectorElementSearcher.linearSearch(number, new Vector(testVector)));
    }

    @Test
    public void binarySearchOne() {
        double[] testVector = {1, 3, 5, 7, 9};
        double number = 5;
        int expected = 2;
        assertEquals(expected, VectorElementSearcher.binarySearch(number, new Vector(testVector)));
    }
}