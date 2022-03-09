package com.bridgelabz.basiccore;

import java.util.Scanner;

public class PrimeFactor {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        primeFactors(number);
    }

    static void primeFactors(int number){
        //If number is divisible by 2
        while (number % 2 == 0){
            System.out.print(2 + " ");
            number = number/2;
        }

        //If number is divisible by an odd number
        for (int i = 3; i <= Math.sqrt(number); i += 2) {

            while (number % i == 0) {
                System.out.print(i + " ");
                number = number/i;
            }
        }
        //If the number is prime
        if (number > 2)
            System.out.print(number + " ");
    }
}

