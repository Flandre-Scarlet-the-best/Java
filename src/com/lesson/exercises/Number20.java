package com.lesson.exercises;

import java.util.Scanner;

public class Number20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i = 1; i<=number; i++){
            for (int j = 1; j<=number; j++){
                System.out.printf("%d\t",i*j);
            }
            System.out.println();
        }
    }
}
