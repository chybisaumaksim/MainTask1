package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.countmean;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Vector;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */
public class VectorMeanTest {

    @Test
    public void countArithmeticalMean() {
        double[] testVector = {2, 10, 5, 7};
        double expected = 6;
        assertEquals(expected, VectorMean.countArithmeticalMean(new Vector(testVector)), 0.0001);
    }

    @Test
    public void countGeometricalMean() {
        double[] testVector = {2, 10};
        double expected = Math.pow(2 * 10, 0.5);
        assertEquals(expected, VectorMean.countGeometricalMean(new Vector(testVector)), 0.0001);
    }
}
