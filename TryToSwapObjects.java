package javatraining.oletsky.javafunctions;

public class TryToSwapObjects {
    public static void main(String[] args) {
        Swapped a = new Swapped(10);
        Swapped b = new Swapped(20);
        swap(a,b);
        System.out.println("-----------");
        System.out.println("In main program: ");
        System.out.println("a.n="+a.n); //10
        System.out.println("b.n="+b.n); //20

    }

    static void swap (Swapped a, Swapped b) {
        Swapped temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping in function:");
        System.out.println("a.n="+a.n); //20
        System.out.println("b.n="+b.n); //10
    }

}

class Swapped {
    int n;

    public Swapped(int n) {
        this.n = n;
    }
}
