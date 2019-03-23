package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.checkorder;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Vector;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */
public class VectorOrderCheckerTest {

        @Test
    public void checkAscendingOrder() {
        double[] testVector = {2, 5, 10};
        assertTrue(VectorOrderChecker.checkAscendingOrder(new Vector(testVector)));
    }

    @Test
    public void checkDescendingOrder() {
        double[] testVector = {10, 6, 3, 1};
        assertTrue(VectorOrderChecker.checkDescendingOrder(new Vector(testVector)));
    }

}