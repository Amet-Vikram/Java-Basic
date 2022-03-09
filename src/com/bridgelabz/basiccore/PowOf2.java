package com.bridgelabz.basiccore;

public class PowOf2 {

    public static void main(String[] args) {
        long result = 1;
        int pow = Integer.parseInt(args[0]);
        if(pow <= 32){
            for (int i = 0; i < pow; i++) {
                result = result * 2;
            }
            System.out.println("The result is :" + result);
        }
        else{
            System.exit(1);
        }
    }

}
