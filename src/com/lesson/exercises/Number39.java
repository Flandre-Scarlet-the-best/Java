package com.lesson.exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Number39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] mas = new int [scan.nextInt()];
        Random rand = new Random(scan.nextInt());
        int index = scan.nextInt();
        int trigger = 0;
        boolean q = false;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(2, 16);
        }
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == index) {
                trigger = i;
                q = true;
            }
        }
        if (!q){
            System.out.println("ERROR");
            return;
        }
        int [] n_mas = Arrays.copyOf(mas, trigger+1);
        System.out.println(Arrays.toString(n_mas));
    }
}
