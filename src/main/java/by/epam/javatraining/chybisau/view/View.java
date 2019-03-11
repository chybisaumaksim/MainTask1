package by.epam.javatraining.chybisau.view;

/**
 * Created by Maksim Chybisau on 09/03/19.
 */
public class View {

    public static void print(String message) {
        System.out.println(message);
    }

    public static void printVector(String message, double[] vector) {
        System.out.print(message + " ");
        for (double tmp : vector) {
            System.out.print(tmp + " ");
        }
        System.out.println();
    }

}
