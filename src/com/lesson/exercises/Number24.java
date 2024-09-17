package com.lesson.exercises;

import java.util.Scanner;

public class Number24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x>y){
            int temp;
            temp = x;
            x = y;
            y = temp;
        }
        for (int i = x; i<=y;i++){
            if (i == 1 || i==2) continue;
            for (int j = 2;j<i;j++){
                if (i % j == 0) {
                    System.out.printf("%d", i);
                    return;
                }
            }

        }
        System.out.println("NO");
    }
}