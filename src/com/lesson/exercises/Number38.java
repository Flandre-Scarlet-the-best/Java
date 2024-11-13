package com.lesson.exercises;

import java.util.Random;
import java.util.Scanner;

public class Number38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] mas = new int[scan.nextInt()];
        Random rand = new Random(scan.nextInt());
        int imax = 0;
        int i_last_min = 0;
        int temp = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(-5, 16);
            System.out.printf("%d ", mas[i]);
            if (mas[i] > mas[imax]){
                imax = i;
            }
            if (mas[i] < 0){
                i_last_min = i;
            }
        }
        temp = mas[imax];
        mas[imax] = mas[i_last_min];
        mas[i_last_min] = temp;
        System.out.println();
        for (int ma : mas) {
            System.out.printf("%d ",ma);
        }
    }
}
