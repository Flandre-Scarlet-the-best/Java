package com.lesson.theory;


import java.util.Scanner;

public class MassTest {
    public static void main(String[] args) {
        int [] a = new int [10];
        int [] b = new int[]{3, 5, 2};
        double [] c = {0.3, 2.2, 3.6, 9.2};
        System.out.println(c[3]);
        System.out.println();

        for (double element : c) {
            System.out.print("|" + element + "| ");
        }
        System.out.println(c.length);

        Scanner scan = new Scanner(System.in);
        int[] mas = new int[scan.nextInt()];
        for (int i = 0; i < mas.length; i++) {
            mas [i] = scan.nextInt();
        }
        System.out.println();
        for (int element : mas) {
            System.out.println(element);
        }
    }
}
