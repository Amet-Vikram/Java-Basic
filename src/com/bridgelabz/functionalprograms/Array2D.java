package com.bridgelabz.functionalprograms;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Array2D {

    static Scanner sc = new Scanner(System.in);

    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        out.println("Enter Value of M and N: ");
        int M = sc.nextInt(), N = sc.nextInt();

        out.println("Enter " + M * N + " values for array.");
        int[][] array = new int[M][N];

        for (int index1 = 0; index1 < M; index1 ++) {
//            System.out.println("First for");
            for (int index2 = 0; index2 < N; index2 ++){
                array[index1][index2] = sc.nextInt();
            }
        }
        out.println(Arrays.deepToString(array));
    }
}
