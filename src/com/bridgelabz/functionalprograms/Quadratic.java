package com.bridgelabz.functionalprograms;

public class Quadratic {
    int a;
    int b;
    int c;
    int delta;
    Quadratic(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        discriminant();
    }
    void discriminant(){
        delta  = b * b - 4 * (a * c);
    }
    public int getDiscriminant(){
        return delta;
    }
    double root1(){
        return (-b + Math.sqrt(delta))/(2*a);
    }
    double root2(){
        return (-b - Math.sqrt(delta))/(2*a);
    }

    public static void main(String[] args) {
        Quadratic obj = new Quadratic(1,5,3);

        System.out.println("Discriminant: " + obj.getDiscriminant());
        System.out.println("Root 1 of x: " + obj.root1());
        System.out.println("Root 2 of y: " + obj.root2());
    }

}
