package by.epam.javatraining.chybisau.model;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Maksim Chybisau on 09/03/19.
 */
public class Vector {
    private static double[] vector;

    public Vector(int numberOfElements, int bound) {
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

    public static double findMinValue(double[] vector) {
        double min = vector[ 0 ];
        for (int i = 1; i < vector.length; i++) {
            if (vector[ i ] < min) {
                min = vector[ i ];
            }
        }
        return min;
    }

    public static double findMaxValue(double[] vector) {
        double max = vector[ 0 ];
        for (int i = 1; i < vector.length; i++) {
            if (vector[ i ] > max) {
                max = vector[ i ];
            }
        }
        return max;
    }

    public static double countArithmeticalMean(double[] vector) {
        double sum = 0;
        for (double tmp : vector) {
            sum += tmp;
        }
        return sum / vector.length;
    }

    public static double countGeometricalMean(double[] vector) {
        double sum = 1;
        for (double tmp : vector) {
            sum *= tmp;
        }
        return Math.pow(sum, 1.0 / vector.length);
    }

    public static boolean checkAscendingOrder(double[] vector) {
        int count;
        for (count = 0; count < vector.length - 1; count++) {
            if (vector[ count ] > vector[ count + 1 ]) {
                break;
            }
        }
        return count == vector.length - 1;
    }

    public static boolean checkDescendingOrder(double[] vector) {
        int count;
        for (count = 0; count < vector.length - 1; count++) {
            if (vector[ count ] < vector[ count + 1 ]) {
                break;
            }
        }
        return count == vector.length - 1;
    }

    public static int findTheFirstLocalMinimumPosition(double[] vector) {
        int res = -1;
        int index = 0;
        if (vector.length == 1) {
            res = index;
        } else if (vector[ index ] < vector[ index + 1 ]) {
            res = index;
        } else {
            for (int i = 1; i < vector.length - 1; i++) {
                if (vector[ i ] < vector[ i + 1 ] && vector[ i ] < vector[ i - 1 ]) {
                    res = i;
                    break;
                }
            }
        }
        return res;
    }

    public static int findTheFirstLocalMaximumPosition(double[] vector) {
        int res = -1;
        int index = 0;
        if (vector.length == 1) {
            res = index;
        } else if (vector[ index ] > vector[ index + 1 ]) {
            res = index;
        } else {
            for (int i = 1; i < vector.length - 1; i++) {
                if (vector[ i ] > vector[ i + 1 ] && vector[ i ] > vector[ i - 1 ]) {
                    res = i;
                    break;
                }
            }
        }
        return res;
    }

    public static int linearSearch(double number, double[] vector) {
        int i;
        for (i = 0; i < vector.length; i++) {
            if (vector[ i ] == number) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(double number, double[] vector) {
        int i = -1;
        if (checkAscendingOrder(vector)) {
            double[] sortedVector = Arrays.copyOf(vector, vector.length);
            int low = 0;
            int high = sortedVector.length;
            int mid;
            while (low < high) {
                mid = (low + high) / 2;
                if (number == sortedVector[ mid ]) {
                    i = mid;
                    break;
                } else {
                    if (number < sortedVector[ mid ]) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        } else if (checkDescendingOrder(vector)) {
            double[] sortedVector = Arrays.copyOf(vector, vector.length);
//            Arrays.sort(sortedVector);
            int low = 0;
            int high = sortedVector.length;
            int mid;
            while (low < high) {
                mid = (low + high) / 2;
                if (number == sortedVector[ mid ]) {
                    i = mid;
                    break;
                } else {
                    if (number > sortedVector[ mid ]) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
//        else {
//            if(checkAscendingOrder(vector)) {
//                double[] sortedVector = Arrays.copyOf(vector, vector.length);
//            Arrays.sort(sortedVector);
//                int low = 0;
//                int high = sortedVector.length;
//                int mid;
//                while (low < high) {
//                    mid = (low + high) / 2;
//                    if (number == sortedVector[ mid ]) {
//                        i = mid;
//                        break;
//                    } else {
//                        if (number < sortedVector[ mid ]) {
//                            high = mid;
//                        } else {
//                            low = mid + 1;
//                        }
//                    }
//                }
//        }
        return i;
    }

    public static double[] reverseVector(double[] vector) {
        for (int i = 0; i < vector.length / 2; i++) {
            double tmp = vector[ i ];
            vector[ i ] = vector[ vector.length - i - 1 ];
            vector[ vector.length - i - 1 ] = tmp;
        }
        return vector;
    }

    public static double[] bubbleSortOfVector(double[] vector) {
        int n = vector.length;
        double temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (vector[ j - 1 ] > vector[ j ]) {
                    temp = vector[ j - 1 ];
                    vector[ j - 1 ] = vector[ j ];
                    vector[ j ] = temp;
                }
            }
        }
        return vector;
    }

    public static double[] mergeSortOfVector(double[] vector) {
        return mergeSortOfVector(vector, 0, vector.length - 1);
    }

    public static double[] mergeSortOfVector(double[] vector, int begin, int end) {
        if (begin < end) {
            int middle = (begin + end) / 2;
            mergeSortOfVector(vector, begin, middle);
            mergeSortOfVector(vector, middle + 1, end);
            merge(vector, begin, middle, end);
        }
        return vector;
    }

    private static void merge(double[] vector, int begin, int middle, int end) {
        double[] newVector = new double[ vector.length ];
        int mid = middle + 1;
        int beg = begin;
        for (int i = beg; i <= end; i++) {
            if (begin <= middle && mid <= end) {
                if (vector[ begin ] <= vector[ mid ]) {
                    newVector[ i ] = vector[ begin ];
                    begin++;
                } else if (vector[ mid ] <= vector[ begin ]) {
                    newVector[ i ] = vector[ mid ];
                    mid++;
                }
            } else if (begin > middle) {
                newVector[ i ] = vector[ mid ];
                mid++;
            } else if (mid >= end) {
                newVector[ i ] = vector[ begin ];
                begin++;
            }
        }
        for (int i = beg; i <= end; i++) {
            vector[ i ] = newVector[ i ];
        }
    }
}

