package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.findfirstlocalminmaxposition;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Vector;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */
public class VectorFirstLocalMinMaxPositionTest {

    @Test
    public void findTheFirstLocalMinimumPosition() {
        double[] testVector = {10, 6, 3, 1};
        double expected = -1;
        assertEquals(expected, VectorFirstLocalMinMaxPosition.findTheFirstLocalMinimumPosition(new Vector(testVector)), 0.0001);
    }

    @Test
    public void findTheFirstLocalMaximumPosition() {
        double[] testVector = {10, 6, 3, 1};
        double expected = 0;
        assertEquals(expected, VectorFirstLocalMinMaxPosition.findTheFirstLocalMaximumPosition(new Vector(testVector)), 0.0001);
    }

}