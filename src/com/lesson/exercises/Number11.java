package com.lesson.exercises;

import java.util.Scanner;

public class Number11 {
    public static void main(String[] args) {
        int numberOfDigits;
        int x;
        int min;
        Scanner scan = new Scanner(System.in);
        numberOfDigits = scan.nextInt();
        min = scan.nextInt();
        for (int i=0; i<numberOfDigits-1; i++){
            x = scan.nextInt();
            if (x<min) min = x;
        }
        System.out.println(min);
    }
}
