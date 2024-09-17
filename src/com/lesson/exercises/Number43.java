package com.lesson.exercises;

import java.util.Random;
import java.util.Scanner;

public class Number43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int line = scan.nextInt();
        int column = scan.nextInt();
        int first = scan.nextInt();
        Random rand = new Random(first);
        int [][] mass = new int[line][column];
        int [] summColumn = new int[column];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = rand.nextInt(-10,11);
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            for (int j  = 0; j < mass[i].length; j++) {
                if (mass[i][j]>0) summColumn[j] += mass[i][j];
            }
        }
        for (int j : summColumn) {
            System.out.print(j + " ");
        }
    }
}
