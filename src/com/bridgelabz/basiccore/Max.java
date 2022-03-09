package com.bridgelabz.basiccore;

public class Max {

    static int maxOfThree(int a, int b, int c){
        if (a > b && a > c){
            return a;
        }
        else if (b > c){
            return b;
        }
        else return c;
    }


    public static void main(String[] args) {
        System.out.println(maxOfThree(30, 12, 10));
    }
}
