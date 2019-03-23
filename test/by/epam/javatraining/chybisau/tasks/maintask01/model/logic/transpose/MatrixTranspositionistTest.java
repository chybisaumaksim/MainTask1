package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.transpose;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Matrix;
import org.junit.Test;
/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */
import static org.junit.Assert.*;

public class MatrixTranspositionistTest {

    @Test
    public void transposeMatrix() throws Exception {
        double[][] testMatrix = {{5, 4}, {8, 1}};
        double[][] expected = {{5, 8}, {4, 1}};
        assertEquals(new Matrix(expected), MatrixTransposition.transposeMatrix(new Matrix(testMatrix)));
    }
}