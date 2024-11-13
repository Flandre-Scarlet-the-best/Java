package com.lesson.exercises;

import java.util.Scanner;

public class Number26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int sum = 0;
        a:
        for (int i = x; i<=y; i++){
            for (int j = 2; j<=i; j++){
                if (i%j==0){
                    sum +=j;
                    continue a;
                }
            }
        }
        System.out.println(sum);
    }
}
