package com.bridgelabz.basiccore;

import java.util.Scanner;

public class Harmonics {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the Limits: ");
        int num = scanner.nextInt();
        double nHar = 0;
        if (num>0){
            for (int i=1; i<=num; i++){
                System.out.print("1/"+ i + " ");
                nHar += 1/(double)i;
            }
        }

        else{
            System.out.println("Limit should be more than 0.");
        }

        System.out.println("= " + nHar);
    }
}
