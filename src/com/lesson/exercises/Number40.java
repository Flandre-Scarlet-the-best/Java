package com.lesson.exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Number40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int first = scan.nextInt();
        Random rand = new Random(first);
        double [] mass = new double[size];
        double max = mass [0];
        double min = 1;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextDouble(0., 2.);
            if (mass [i] > max) max = mass[i];
            if (mass [i] < min) min = mass[i];
        }
        System.out.println(Arrays.toString(mass));
        System.out.println(max+min);
    }
}
