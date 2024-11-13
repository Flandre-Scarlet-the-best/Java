package com.lesson.exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Number41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int first = scan.nextInt();
        int [] mass = new int[size];
        Random rand = new Random(first);
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(10, 21);
        }
        System.out.println(Arrays.toString(mass));
        int index1 = scan.nextInt();
        int index2 = scan.nextInt();
        Arrays.sort(mass, index1, index2+1);
        System.out.println(Arrays.toString(mass));
    }
}
