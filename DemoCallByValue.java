package javatraining.oletsky.javafunctions;

/**
 * A programmer intended to use a function for changing its arguments
 * What's wrong?
 */
public class DemoCallByValue {
    public static void main(String[] args) {
        int c=10;
        changeArgument(c,100);
        System.out.println(c); //100 expected by 10 actually got
    }

    static void changeArgument(int c, int value){
        c=value;
    }
}
