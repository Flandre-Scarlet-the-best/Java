package com.lesson.exercises;

import java.util.Scanner;

public class Number33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i_f = scan.nextInt();
        if (i_f == 1){
            double a = scan.nextDouble();
            System.out.printf("%.2f ", square(a));
        }
        else {
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            System.out.printf("%.2f ", square(a, b));
        }
    }
    static double square(double x){
        return Math.pow(x, 2);
    }
    static double square(double x, double y){
        return x*y;
    }
}
