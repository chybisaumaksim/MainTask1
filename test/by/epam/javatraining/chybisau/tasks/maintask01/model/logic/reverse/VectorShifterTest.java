package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.reverse;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Vector;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */
public class VectorShifterTest {

    @Test
    public void reverseVector() {
        double[] testVector = {9, 8, 5, 33};
        double[] expected = {33, 5, 8, 9};
       assertEquals(new Vector(expected), VectorShifter.reverseVector(new Vector(testVector)));
    }
}