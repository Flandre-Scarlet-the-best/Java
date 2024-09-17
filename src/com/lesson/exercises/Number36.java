package com.lesson.exercises;

import java.util.*;

public class Number36 {
    public static void main(String[] args) {
        double sum =0;
        Scanner scan = new Scanner(System.in);
        double [] mas = new double[scan.nextInt()];
        Random rand = new Random(scan.nextInt());
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextDouble(0, 5);
            System.out.printf("%.2f ", mas[i]);
            sum += mas[i];
        }
        double average = sum/ mas.length;
        System.out.printf("\n%.2f\n", average);
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > average) mas[i] = average;
            System.out.printf("%.2f ", mas[i]);
        }
    }
}
