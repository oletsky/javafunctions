package javatraining.oletsky.javafunctions;

public class VariableNumberOfParameters {
    static public int sum (int ... v) {
        int s=0;
        for (int i:v) {s+=i;}
        return s;
    }
    public static void main (String[] args) {
        int s = sum(3,5,24);
        System.out.println(s);
    }

}
