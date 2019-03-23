package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.checkifsymmetrical;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Matrix;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */
public class MatrixSymmetricalCheckerTest {

    @Test
    public void isSymmetricalTwo() {
        double[][] testMatrix = {{4, 1, 0}, {3, 2, 3}, {1, 1, 5}};
        assertFalse(MatrixSymmetricalChecker.isSymmetrical(new Matrix(testMatrix)));
    }
}