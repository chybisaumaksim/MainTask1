package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.sort;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Vector;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */
public class VectorSorterTest {

    @Test
    public void bubbleSortOfVector() {
        double[] testVector = {9.0, 8.0, 5.0, 33.0, 21.0};
        double[] expected = {5.0, 8.0, 9.0, 21.0, 33.0};
        assertEquals(new Vector(expected), VectorSorter.bubbleSortOfVector(new Vector(testVector)));
//        if(!new Vector(expected).equals(VectorSorter.bubbleSortOfVector(new Vector(testVector)))){
//            Assert.fail();
//        }
    }

    @Test
    public void mergeSortOfVector() {
        double[] testVector = {9, 8, 5, 33, 21};
        double[] expected = {5, 8, 9, 21, 33};
        assertEquals(new Vector(expected), VectorSorter.mergeSortOfVector(new Vector(testVector)));
    }
}