package com.lesson.exercises;

import java.util.Scanner;

public class Number23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        repeat:
        for (int i = x; i<=y;i++){
            if (i == 1) continue;
            for (int j = 2;j<i;j++){
                if (i%j == 0){
                    continue repeat;
                }
            }
            System.out.printf("%d ", i);
        }
    }
}
