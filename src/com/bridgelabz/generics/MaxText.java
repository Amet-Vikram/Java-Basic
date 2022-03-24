package com.bridgelabz.generics;

public class MaxText<Double extends Comparable<Double>> {
    Double a, b, c;

    public MaxText(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    Double maximum(){
        if (a.compareTo(b) > 0.0 && a.compareTo(c) > 0.0)
            return a;
        else if (b.compareTo(c) > 0.0)
            return b;
        else return c;
    }

    public static void main(String[] args) {
        MaxText test1 = new MaxText(10.1,5.2,3.7);
        MaxText test2 = new MaxText(7.5,15.3,9.3);
        MaxText test3 = new MaxText(16.6,5.0,19.8);

        System.out.println("Result of TC 1: " + test1.maximum());
        System.out.println("Result of TC 2: " + test2.maximum());
        System.out.println("Result of TC 3: " + test3.maximum());
    }
}
