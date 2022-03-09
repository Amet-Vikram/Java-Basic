package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class SumOfThree {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int uniqueTriplets = 0;
        //Array Length
        System.out.println("Enter number of inputs.");
        int len = sc.nextInt();
        //Appending Values through user input
        System.out.println("Enter the values: ");
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
        }
        //For loop to determine unique triplets
        for (int i = 0; i < len - 2; i++) {
            for (int j = 1; j < len - 1; j++) {
                for (int k = 2; k < len; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        uniqueTriplets++;
                        System.out.print("[" + array[i] + "," + array[j] + "," + array[k] + "] ");
                    }
                }
            }
        }
        System.out.println("Number of Unique Triplets: " + uniqueTriplets);
    }
}

