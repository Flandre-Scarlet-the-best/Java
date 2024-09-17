package com.lesson.exercises;

import java.util.Scanner;

public class Number16 {
    public static void main(String[] args) {
        int height;
        int number;
        Scanner scan = new Scanner(System.in);
        height = scan.nextInt();
        number = height;
        for (int i = 1; i <= height; i++){
            for (int j = height; j >= i; j--){
                System.out.print(number);
            }
            number--;
            System.out.println();
        }

    }
}
