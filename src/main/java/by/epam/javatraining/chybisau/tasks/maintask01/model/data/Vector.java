package by.epam.javatraining.chybisau.tasks.maintask01.model.data;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 18/03/19.
 *
 * @version 0.0.3
 */

public class Vector {
    static double[] vector;

    public Vector(int numberOfElements, int bound) {
        vector = initializeVector(numberOfElements, bound);
    }

    //constructor for tests
    public Vector(double[] vector) {
        this.vector = vector;
    }

    private static double[] initializeVector(int numberOfElements, int bound) {
        Random random = new Random();
        vector = new double[ numberOfElements ];
        for (int i = 0; i < vector.length; i++) {
            vector[ i ] = random.nextInt(bound) + 1;
        }
        return vector;
    }

    public int length() {
        return vector.length;
    }

    public double getElement(int index) {
        return vector[ index ];
    }

    public void setElement(int index, double value) {
        vector[ index ] = value;
    }

    public double[] toArray() {
        return vector;
    }

    @Override
    public boolean equals(Object o) {
        return o.equals(vector);
    }

    @Override
    public String toString() {
        return "Vector : " + Arrays.toString(vector);
    }
}