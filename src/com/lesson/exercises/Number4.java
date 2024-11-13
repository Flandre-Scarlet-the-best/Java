package com.lesson.exercises;

import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number<0) number = -number;
        if (number <100 || number>999){
            System.out.println("ERROR");
            return;
        }
        int num1 = number/100;
        int num2 = number%100/10;
        int num3 = number%10;
        int sum = 0;
        if (num1 % 2 != 0){
            sum += num1;
        }
        if (num2 % 2 != 0){
            sum +=num2;
        }
        if (num3 % 2 != 0){
            sum += num3;
        }
        if (sum==0){
            System.out.println("NO");
            return;
        }
        System.out.println(sum);
    }

}
