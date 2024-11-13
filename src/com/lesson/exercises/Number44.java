package com.lesson.exercises;

import java.util.Random;
import java.util.Scanner;

public class Number44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int line = scan.nextInt();
        int column = scan.nextInt();
        int seed = scan.nextInt();
        Random rand = new Random(seed);
        int [][]mass = new int[line][column];
        for (int i = 0; i <mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass [i][j] = rand.nextInt(-10, 11);
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
        a:
        for (int[] ints : mass) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] < 0) {
                    System.out.println(j);
                    continue a;
                }
            }
            System.out.println("NO");

        }
    }
}
