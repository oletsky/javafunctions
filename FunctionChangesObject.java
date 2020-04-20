package javatraining.oletsky.javafunctions;

/**
 * @author O.Oletsky
 * A function can change a field of its argument of reference type
 */
public class FunctionChangesObject {
    public static void main(String[] args) {
        MyClass ekz = new MyClass();
        System.out.println("Old value: "+ekz.a); //0
        change(ekz,10);
        System.out.println("New value: "+ekz.a); //10
    }

    static void change(MyClass ekz, int val) {
        ekz.a=val;
    }
}

class MyClass{
    int a;
}
