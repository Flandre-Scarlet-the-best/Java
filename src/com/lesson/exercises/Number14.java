package com.lesson.exercises;

import java.util.Scanner;

public class Number14 {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        int x = 0;
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        if (number<0) number = -number;
        do{
            sum += number % 10;
            number /=10;
            x++;
        }while (number>0);
        System.out.printf("%d %d",x, sum);
    }
}
