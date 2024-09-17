package com.lesson.exercises;

import java.util.Scanner;

public class Number37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] mas = new int[scan.nextInt()];
        int imin = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scan.nextInt();
            if (mas[i]<=mas[imin]){
                imin = i;
            }
        }
        mas[imin] = -1;
        for (int ma : mas) {
            System.out.printf("%d ", ma);
        }
    }
}
