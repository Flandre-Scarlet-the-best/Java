package com.lesson.exercises;

import java.util.Random;
import java.util.Scanner;

public class Number35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] mas = new int[scan.nextInt()];
        Random rand = new Random(scan.nextInt());
        int sum = 0;
        double product = 1;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(-5,6);
            System.out.print(mas[i] + " ");
            if (mas[i]>0) sum +=mas[i];
            if (mas[i]<0) product *=mas[i];
        }
        System.out.println();
        System.out.printf("%d %f",sum, product);
    }
}
