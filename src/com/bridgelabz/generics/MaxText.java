package com.bridgelabz.generics;

public class MaxText<Integer extends Comparable<Integer>> {
    Integer a, b, c;

    public MaxText(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    Integer maximum(){
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
            return a;
        else if (b.compareTo(c) > 0)
            return b;
        else return c;
    }

    public static void main(String[] args) {
        MaxText test1 = new MaxText<>(10,5,3);
        MaxText test2 = new MaxText<>(10,15,9);
        MaxText test3 = new MaxText<>(16,5,19);

        System.out.println("Result of TC 1: " + test1.maximum());
        System.out.println("Result of TC 2: " + test2.maximum());
        System.out.println("Result of TC 3: " + test3.maximum());
    }
}
