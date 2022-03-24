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

        MaxText<String> test1 = new MaxText<>("Peach","Apple","Banana");
        MaxText<String> test2 = new MaxText<>("Apple","Peach","Banana");
        MaxText<String> test3 = new MaxText<>("Apple","Banana","Peach");

        System.out.println("Result of TC 1: " + test1.maximum());
        System.out.println("Result of TC 2: " + test2.maximum());
        System.out.println("Result of TC 3: " + test3.maximum());
    }
}
