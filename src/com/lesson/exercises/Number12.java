package com.lesson.exercises;

import java.util.Scanner;

public class Number12 {
    public static void main(String[] args) {
        int number;
        int divider = 1;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        for (int i=0; i<number; i++){
            if (number%divider == 0){
               sum += divider;
            }
            divider++;
        }
        System.out.println(sum);
    }
}
