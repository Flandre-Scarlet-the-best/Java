package com.lesson.exercises;

import java.util.Random;
import java.util.Scanner;

public class Number42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int line = scan.nextInt();
        int columns = scan.nextInt();
        int first = scan.nextInt();
        Random rand = new Random(first);
        int [][] mass = new int[line][columns];
        int max = mass[0][0];
        int q = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = rand.nextInt(-5, 5);
                System.out.print(mass[i][j] + "\t");
                if (mass[i][j] > max) max = mass[i][j];
            }
            System.out.println();
        }
        for (int[] search : mass) {
            for (int i : search) {
                if (i == max) q++;
            }
        }
        System.out.println(max + " " + q);
    }
}
