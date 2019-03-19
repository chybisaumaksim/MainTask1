package by.epam.javatraining.chybisau.tasks.maintask01.model.logic;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Vector;

import java.util.Arrays;


/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 18/03/19.
 *
 * @version 0.0.3
 */

 class VectorLogic {

    static double findMinValue(Vector vector) {
        double min = vector.getElement(0);
        for (int i = 1; i < vector.length(); i++) {
            if (vector.getElement(i) < min) {
                min = vector.getElement(i);
            }
        }
        return min;
    }

    static double findMaxValue(Vector vector) {
        double max = vector.getElement(0);
        for (int i = 1; i < vector.length(); i++) {
            if (vector.getElement(i) > max) {
                max = vector.getElement(i);
            }
        }
        return max;
    }

    static double countArithmeticalMean(Vector vector) {
        double sum = 0;
        for (int i = 0; i < vector.length(); i++) {
            sum += vector.getElement(i);
        }
        return sum / vector.length();
    }

    static double countGeometricalMean(Vector vector) {
        double sum = 1;
        for (int i = 0; i < vector.length(); i++) {
            sum *= vector.getElement(i);
        }
        return Math.pow(sum, 1.0 / vector.length());
    }

    static boolean checkAscendingOrder(Vector vector) {
        int count;
        for (count = 0; count < vector.length() - 1; count++) {
            if (vector.getElement(count) > vector.getElement(count + 1)) {
                break;
            }
        }
        return count == vector.length() - 1;
    }

    static boolean checkDescendingOrder(Vector vector) {
        int count;
        for (count = 0; count < vector.length() - 1; count++) {
            if (vector.getElement(count) < vector.getElement(count + 1)) {
                break;
            }
        }
        return count == vector.length() - 1;
    }

    static int findTheFirstLocalMinimumPosition(Vector vector) {
        int result = -1;
        int index = 0;
        if (vector.length() == 1) {
            result = index;
        } else if (vector.getElement(index) < vector.getElement(index + 1)) {
            result = index;
        } else {
            for (int i = 1; i < vector.length() - 1; i++) {
                if (vector.getElement(i) < vector.getElement(i + 1) && vector.getElement(i) < vector.getElement(i - 1)) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

    static int findTheFirstLocalMaximumPosition(Vector vector) {
        int res = -1;
        int index = 0;
        if (vector.length() == 1) {
            res = index;
        } else if (vector.getElement(index) > vector.getElement(index + 1)) {
            res = index;
        } else {
            for (int i = 1; i < vector.length() - 1; i++) {
                if (vector.getElement(i) > vector.getElement(i + 1) && vector.getElement(i) > vector.getElement(i - 1)) {
                    res = i;
                    break;
                }
            }
        }
        return res;
    }

    static int linearSearch(double number, Vector vector) {
        int i;
        for (i = 0; i < vector.length(); i++) {
            if (vector.getElement(i) == number) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(double number, Vector vector) {
        int i = -1;
        if (checkAscendingOrder(vector)) {
            double[] sortedVector = Arrays.copyOf(vector.toArray(), vector.length());
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
            double[] sortedVector = Arrays.copyOf(vector.toArray(), vector.length());
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
//                double[] sortedVector = Arrays.copyOf(vector, vector.matrixLength);
//            Arrays.sort(sortedVector);
//                int low = 0;
//                int high = sortedVector.matrixLength;
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

    static Vector reverseVector(Vector vector) {
        for (int i = 0; i < vector.length() / 2; i++) {
            double tmp = vector.getElement(i);
            vector.setElement(i, vector.getElement(vector.length() - i - 1));
            vector.setElement(vector.length() - i - 1, tmp);
        }
        return vector;
    }

    static Vector bubbleSortOfVector(Vector vector) {
        int n = vector.length();
        double temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (vector.getElement(j - 1)> vector.getElement(j)) {
                    temp = vector.getElement(j - 1);
                    vector.setElement(j - 1, vector.getElement(j));
                    vector.setElement(j,temp);
                }
            }
        }
        return vector;
    }

    static Vector mergeSortOfVector(Vector vector) {
        return mergeSortOfVector(vector, 0, vector.length() - 1);
    }

    private static Vector mergeSortOfVector(Vector vector, int begin, int end) {
        if (begin < end) {
            int middle = (begin + end) / 2;
            mergeSortOfVector(vector, begin, middle);
            mergeSortOfVector(vector, middle + 1, end);
            merge(vector, begin, middle, end);
        }
        return vector;
    }

    private static void merge(Vector vector, int begin, int middle, int end) {
        double[] newVector = new double[ vector.length() ];
        int mid = middle + 1;
        int beg = begin;
        for (int i = beg; i <= end; i++) {
            if (begin <= middle && mid <= end) {
                if (vector.getElement(begin) <= vector.getElement(mid)) {
                    newVector[ i ] = vector.getElement(begin);
                    begin++;
                } else if (vector.getElement(mid) <= vector.getElement(begin)) {
                    newVector[ i ] = vector.getElement(mid);
                    mid++;
                }
            } else if (begin > middle) {
                newVector[ i ] = vector.getElement(mid);
                mid++;
            } else if (mid >= end) {
                newVector[ i ] = vector.getElement(begin);
                begin++;
            }
        }
        for (int i = beg; i <= end; i++) {
            vector.setElement(i, newVector[ i ]);
        }
    }

}
