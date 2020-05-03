package javatraining.oletsky.javafunctions;

import java.util.function.Function;

/**
 * @author O.Oletsky
 * A very simple example of lambda
 */
public class DemoLambda {
    public static void main(String[] args) {
        Function<Integer, Integer> func = x->(x*2);
        int q1 = func.apply(10);
        System.out.println(q1);

    }
}
