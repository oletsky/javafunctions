package javatraining.oletsky.javafunctions;

/**
 * @author O.Oletsky
 * Use function findMax for finding minimum of int[] array
 */
public class AdaptFunction {
    public static void main(String[] args) {
        double[] mas={15., 25., 10., 30., 41., 8., 12.};
        double max = findMax(mas);
        System.out.println(max);

    }

    static double findMax(double[] mas) {
        if (mas.length==0) throw new RuntimeException("No elememts in array!");
        double max=mas[0];
        for (int i=1; i<mas.length; i++) {
            if (mas[i]>max) max=mas[i];
        }
        return max;
    }
}
