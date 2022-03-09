package com.bridgelabz.basiccore;

import java.util.Scanner;

public class Swap2Num {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the First number to be swapped: ");
        int x = scanner.nextInt();
        System.out.println("Enter the Second number to be swapped: ");
        int y = scanner.nextInt();

        swap(x,y);
    }
    static void swap(int firstNum, int secondNum){
        int temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;
        System.out.println("First Number: " + firstNum);
        System.out.println("Second Number: " + secondNum);
    }
}
