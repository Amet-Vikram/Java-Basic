package com.bridgelabz.functionalprograms;

public class WindChill {
    int v;
    int t;

    WindChill(int v, int t){
        this.v = v;
        this.t = t;
    }
    public double windChill() {
        return 35.74 + (0.6215 * t) + Math.pow((0.4275 * t - 35.75) * v, 0.16);
    }

    public static void main(String[] args) {
        int velocity = Integer.parseInt(args[0]);
        int temperature = Integer.parseInt(args[1]);

        WindChill obj = new WindChill(velocity, temperature);

        System.out.println("Effective Temperature is: " + obj.windChill() + " deg F.");
    }
}
