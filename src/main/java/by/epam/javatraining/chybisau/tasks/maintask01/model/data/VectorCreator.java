package by.epam.javatraining.chybisau.tasks.maintask01.model.data;

import java.util.Arrays;
import java.util.Random;

import static java.lang.System.out;

/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 17/03/19.
 *
 * @version 0.0.2
 */

public class VectorCreator {
    private static double[] vector;

    public VectorCreator(int numberOfElements, int bound) {
        vector = initializeVector(numberOfElements, bound);
    }

    public static double[] initializeVector(int numberOfElements, int bound) {
        Random random = new Random();
        vector = new double[ random.nextInt(numberOfElements) + 1 ];
        for (int i = 0; i < vector.length; i++) {
            vector[ i ] = random.nextInt(bound) + 1;
        }
        return vector;
    }

    public static double[] returnVector() {
        return vector;
    }

    public static String toString(double[] vector) {
        return Arrays.toString(vector);
    }
}

