package com.lesson.exercises;

import java.util.Scanner;

public class Number31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int max = maxNumberDivider(a, b);
        System.out.println(max);
    }
    static int maxNumberDivider (int a, int b){
        int max = 0;
        int number = 0;
        for (int i = a; i <= b; i++){
            int q = 0;
            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    q++;
                }
            }
            if (max < q){
                max = q;
                number = i;
            }

        }
        return number;
    }
}
