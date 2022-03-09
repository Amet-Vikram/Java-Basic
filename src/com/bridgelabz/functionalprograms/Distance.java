package com.bridgelabz.functionalprograms;

public class Distance {
    int x;
    int y;
    Distance(int x, int y){
        this.x = x;
        this.y = y;
    }
    double distance(){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    public static void main(String[] args) {
        Distance obj = new Distance(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        System.out.println("The Distance from Origin is : " + obj.distance());
    }
}
