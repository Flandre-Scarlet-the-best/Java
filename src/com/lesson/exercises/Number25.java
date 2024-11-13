package com.lesson.exercises;

import java.util.Scanner;

public class Number25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int sum = 0;
        for (int i = 1; i<x;i++){
            if (x%i==0 && i%2==0){
                sum +=i;
            }
        }
        System.out.println(sum);
    }
}
