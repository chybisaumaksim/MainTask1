package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.findfirstlocalminmaxposition;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Matrix;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */
public class MatrixFirstLocalMinMaxPositionTest {

    @Test
    public void findTheFirstLocalMinimumPosition() {
        double[][] testMatrix = {{5, 4}, {8, 1}};
        double expected = -1;
        assertEquals(expected, MatrixFirstLocalMinMaxPosition.findTheFirstLocalMinimumPosition(new Matrix(testMatrix)), 0.001);
    }

    @Test
    public void findTheFirstLocalMaximumPosition() {
        double[][] testMatrix = {{5, 4}, {8, 1}};
        double expected = -1;
        assertEquals(expected, MatrixFirstLocalMinMaxPosition.findTheFirstLocalMaximumPosition(new Matrix(testMatrix)), 0.001);
    }

}