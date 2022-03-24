package com.bridgelabz.generics;

public class MaxText<T extends Comparable<T>> {
    T a, b, c;

    public MaxText(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    T maximum(){
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
            return a;
        else if (b.compareTo(c) > 0)
            return b;
        else return c;
    }

    public static void main(String[] args) {

        MaxText test1 = new MaxText<>("Peach","Apple","Banana");
        MaxText test2 = new MaxText<>(2,3,1);
        MaxText test3 = new MaxText<>(1.7,5.0,7.0);

        System.out.println("Result of TC 1: " + test1.maximum());
        System.out.println("Result of TC 2: " + test2.maximum());
        System.out.println("Result of TC 3: " + test3.maximum());
    }
}
